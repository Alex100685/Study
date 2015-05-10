package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

@Controller
@RequestMapping("/SpringMVC_war_exploded")
public class MainController {

	@Autowired
	private AdvDAO advDAO;

	@RequestMapping("/")
	public ModelAndView listAdvs() {
		return new ModelAndView("index", "advs", advDAO.list());
	}
	
	@RequestMapping("/advs.xml")
	public void advsDownload(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		File f = new File("d:\\advs.xml");
		int BUFF_SIZE =(int) f.length();
		byte[] buffer = new byte[BUFF_SIZE];
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		response.setCharacterEncoding("Content-Transfer-Encoding:binary");
		response.setContentType("Content-Type:application/xml");
		response.setHeader("Content-Disposition:attachment", "filename=\"advs.xml\"");
		response.setContentLength((int) f.length());
		OutputStream os = response.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		bis.read(buffer);
		bos.write(buffer);
		
		bis.close();
		bos.close();
		

		
	}
	
	
	
	@RequestMapping("/advsDownload")
	public String downLoadXML(Model model) throws IOException, JAXBException {
		List <Advertisement> advsList = advDAO.list();
		File f = new File("d:\\advs.xml");
		if(!f.exists()){
			f.createNewFile();
		}
		Advertisements advsXMLList = new Advertisements();
		advsXMLList.setAdvertisements(advsList);
		JAXBContext jaxbContext = JAXBContext.newInstance(Advertisements.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		
		
		for(int i=0; i<advsList.size(); i++){
			
			advsXMLList.getAdvertisements().get(i).getPhoto().setBody(null);
			advsXMLList.getAdvertisements().get(i).getPhoto().setName(null);
			
			
		}
		
		jaxbMarshaller.marshal(advsXMLList, f);
		
		
		
		return "XML";
	}
	
	
	@RequestMapping("/basket")
	public ModelAndView listBasket() {
		return new ModelAndView("basket", "basket", advDAO.listDeleted());
	}
	

	@RequestMapping(value = "/add_page", method = RequestMethod.POST)
	public String addPage(Model model) {
		return "add_page";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView search(@RequestParam(value="pattern") String pattern) {
		return new ModelAndView("index", "advs", advDAO.list(pattern));
	}
	
	@RequestMapping(value = "/searchDeleted", method = RequestMethod.POST)
	public ModelAndView searchDeleted(@RequestParam(value="pattern") String pattern) {
		return new ModelAndView("basket", "basket", advDAO.listDeleted(pattern));
	}

	@RequestMapping("/deleteFromBasket")
	public ModelAndView delete() {
		advDAO.delete();
		return new ModelAndView("basket", "basket", advDAO.listDeleted());
	}
	
	@RequestMapping("/toBasket")
	public ModelAndView tobasket(@RequestParam(value="id []") long [] id) {
		advDAO.toBasket(id);
		return new ModelAndView("index", "advs", advDAO.list());
	}
	
	@RequestMapping("/restore")
	public ModelAndView restore(@RequestParam(value="id []") long [] id) {
		advDAO.restore(id);
		return new ModelAndView("index", "advs", advDAO.list());
	}
	
	
	@RequestMapping("/imageDeleted/{basket_id}")
	public void getFileDeleted(HttpServletRequest request, HttpServletResponse response, @PathVariable("basket_id") long basketId) {
		try {
			byte[] content = advDAO.getPhotoDeleted(basketId);
			response.setContentType("image/png");
			response.getOutputStream().write(content);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	@RequestMapping("/image/{file_id}")
	public void getFile(HttpServletRequest request, HttpServletResponse response, @PathVariable("file_id") long fileId) {
		try {
			byte[] content = advDAO.getPhoto(fileId);
			response.setContentType("image/png");
			response.getOutputStream().write(content);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addAdv(@RequestParam(value="name") String name,
						 @RequestParam(value="shortDesc") String shortDesc,
						 @RequestParam(value="longDesc", required=false) String longDesc,
						 @RequestParam(value="phone") String phone,
						 @RequestParam(value="price") double price,
						 @RequestParam(value="photo") MultipartFile photo,
						 HttpServletRequest request,
						 HttpServletResponse response)
	{
		try {
			Advertisement adv = new Advertisement(
					name, shortDesc, longDesc, phone, price,
					photo.isEmpty() ? null : new Photo(photo.getOriginalFilename(), photo.getBytes())
			);
			advDAO.add(adv);
			return new ModelAndView("index", "advs", advDAO.list());
		} catch (IOException ex) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}
}