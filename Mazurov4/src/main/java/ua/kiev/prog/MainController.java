package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/Main")
public class MainController {

	@Autowired
	private Actions actions;

	@RequestMapping("/")
	public ModelAndView listDocs() {
		List <Document> dList = actions.DocumentList();
		return new ModelAndView("index", "document", dList);
		
	}
	
	@RequestMapping("/deleteDocuments")
	public ModelAndView deleteDocuments(
			@RequestParam(value="id []") String [] id
			) 
	{
			actions.deleteDocByInvNum(id);
		List <Document> dList = actions.DocumentList();
		return new ModelAndView("index", "document", dList);
		
	}
	
	
	@RequestMapping("/sortByInvNum")
	public ModelAndView sortByInvNum() {
		List <Document> docList = actions.DocumentList();
		Document [] docArray = new Document [docList.size()];
		for(int i=0; i<docList.size(); i++){
			docArray[i] = docList.get(i);
		}
		Arrays.sort(docArray, new SortByInvNum());
		
		return new ModelAndView("index", "document", docArray);
	}
	
	@RequestMapping("/sortByName")
	public ModelAndView sortByName() {
		List <Document> docList = actions.DocumentList();
		Document [] docArray = new Document [docList.size()];
		for(int i=0; i<docList.size(); i++){
			docArray[i] = docList.get(i);
		}
		Arrays.sort(docArray, new SortByName());
		
		return new ModelAndView("index", "document", docArray);
	}
	
	@RequestMapping("/sortByPublisher")
	public ModelAndView sortByPublisher() {
		List <Document> docList = actions.DocumentList();
		Document [] docArray = new Document [docList.size()];
		for(int i=0; i<docList.size(); i++){
			docArray[i] = docList.get(i);
		}
		Arrays.sort(docArray, new SortByPublisher());
		
		return new ModelAndView("index", "document", docArray);
	}
	
	@RequestMapping("/sortByNote")
	public ModelAndView sortByNote() {
		List <Document> docList = actions.DocumentList();
		Document [] docArray = new Document [docList.size()];
		for(int i=0; i<docList.size(); i++){
			docArray[i] = docList.get(i);
		}
		Arrays.sort(docArray, new SortByNote());
		
		return new ModelAndView("index", "document", docArray);
	}
	
	@RequestMapping("/sortByDocType")
	public ModelAndView sortByDocType() {
		List <Document> docList = actions.DocumentList();
		Document [] docArray = new Document [docList.size()];
		for(int i=0; i<docList.size(); i++){
			docArray[i] = docList.get(i);
		}
		Arrays.sort(docArray, new SortByDocType());
		
		return new ModelAndView("index", "document", docArray);
	}
	
	@RequestMapping("/sortByQuantity")
	public ModelAndView sortByQuantity() {
		List <Document> docList = actions.DocumentList();
		Document [] docArray = new Document [docList.size()];
		for(int i=0; i<docList.size(); i++){
			docArray[i] = docList.get(i);
		}
		Arrays.sort(docArray, new SortByQuantity());
		
		return new ModelAndView("index", "document", docArray);
	}
	
	@RequestMapping("/sortByStatus")
	public ModelAndView sortByStatus() {
		List <Document> docList = actions.DocumentList();
		Document [] docArray = new Document [docList.size()];
		for(int i=0; i<docList.size(); i++){
			docArray[i] = docList.get(i);
		}
		Arrays.sort(docArray, new SortByStatus());
		
		return new ModelAndView("index", "document", docArray);
	}
	
	
	@RequestMapping("/searchByInvNumb")
	public ModelAndView searchByInvNumbl(
			@RequestParam(value="pattern") String pattern
			) {
		return new ModelAndView("index", "document", actions.searchByInvNumbList(pattern));
	}
	
	@RequestMapping("/searchByName")
	public ModelAndView searchByName(
			@RequestParam(value="pattern") String pattern
			) {
		return new ModelAndView("index", "document", actions.searchByName(pattern));
	}
	
	@RequestMapping("/searchByPublisher")
	public ModelAndView searchByPublisher(
			@RequestParam(value="pattern") String pattern
			) {
		return new ModelAndView("index", "document", actions.searchByPublisher(pattern));
	}
	
	
	
	@RequestMapping(value = "/addDocument", method = RequestMethod.POST)
	public ModelAndView chooseBigSection() {
		List <BigSection> list = actions.BigSectionList();
		return new ModelAndView("choosebigsection", "bigSections", list);
	}
	
	@RequestMapping(value = "/ChooseSmallSection", method = RequestMethod.POST)
	public ModelAndView chooseSmallSection(
			@RequestParam(value="SelectBigSection") String name
			) {
		return new ModelAndView("choosesmallsection", "Sections", actions.smallSectionList(name));
	}
	
	
	
	
	@RequestMapping("/addBigSection")
	public String addBigSection(Model model) {
		return "addbigsection";
	}
	
	@RequestMapping("/createNewPublisher")
	public String createNewPublisher(Model model) {
		return "createNewPublisher";
	}
	
	@RequestMapping("/addSmallSection")
	public ModelAndView addSmallSection(Model model) {
		return new ModelAndView ("addsmallsection", "BigSection", actions.BigSectionList());
	}
	
	
	@RequestMapping(value = "/SaveNewBigSection", method = RequestMethod.POST)
	public ModelAndView saveBigSection(
			@RequestParam(value="id") String id,
			 @RequestParam(value="name") String name
			) {
		List <BigSection> list = actions.BigSectionList();
		if("".equals(id)){
			return new ModelAndView("addbigsectionerror");
		}
		for(BigSection bs : list){
			if(bs.getId().equals(id)){
				return new ModelAndView("addbigsectionerror");
				
			}
		}
		BigSection bs = new BigSection();
		bs.setName(name);
		bs.setId(id);
		actions.add(bs);
		List <BigSection> list2 = actions.BigSectionList();
		
		return new ModelAndView("choosebigsection", "bigSections", list2);	
	}
	
	
	@RequestMapping(value = "/saveSmallSection", method = RequestMethod.POST)
	public ModelAndView saveSmallSection(
			@RequestParam(value="UpperSection") String upperSection,
			@RequestParam(value="number") String id,
			 @RequestParam(value="name") String name
			) {
		List <Section> list = actions.smallSectionList(upperSection);
		if("".equals(id)){
			return new ModelAndView("addsmallsectionerror");
		}
		for(Section s : list){
			if(s.getId().equals(id)){
				return new ModelAndView("addsmallsectionerror");
				
			}
		}
		BigSection bs = actions.getBigSectionByName(upperSection);
		Section s = new Section();
		s.setName(name);
		s.setId(bs.getId()+"."+id);
		s.setBigSection(bs);
		actions.add(bs);
		
		return new ModelAndView("choosebigsection", "bigSections", actions.BigSectionList());	
	}

	
	@RequestMapping(value = "/toDocumentData", method = RequestMethod.POST)
	public ModelAndView toDocumentData(
			@RequestParam(value="smallSection") String sectionName
			)
	{
		List <Publisher> pList = actions.PublisherList();
		Section s = actions.getSectionByName(sectionName);
		
		List <Object> all = new ArrayList<>();
		all.add(pList);
		all.add(s);
		
				return new ModelAndView ("add_page", "all", all);
	}
	
	
	@RequestMapping(value = "/edit")
	public ModelAndView editData(
			HttpServletRequest request,
			 HttpServletResponse response
			)
	{	
		List <Publisher> pList = actions.PublisherList();
		List <Object> all = new ArrayList<>();
		String inventaryNumber = request.getParameter("in");
		Document d = actions.getDocByInvNym(inventaryNumber);
		if(pList.size()>1){
		Publisher temp;
		temp = pList.get(0);
		pList.set(0, d.getPublisher());
		pList.set(1, temp);
		}
		all.add(pList);
		all.add(d);
		return new ModelAndView ("edit_page", "all", all);
	}
	
	@RequestMapping(value = "/deleteFile")
	public ModelAndView deleteFile(
			HttpServletRequest request,
			 HttpServletResponse response
			)
	{	
		String invName = request.getParameter("in");
		Document d = actions.getDocByInvNym(invName);
		d.setFileBody(null);
		d.setFileName(null);
		
		List <Publisher> pList = actions.PublisherList();
		List <Object> all = new ArrayList<>();
		all.add(pList);
		all.add(d);
		
		
		return new ModelAndView ("edit_page", "all", all);
	}
	
	
	@RequestMapping(value = "/uploadFile")
	public ModelAndView uploadFile(
			HttpServletRequest request,
			 HttpServletResponse response
			)
	{	
		String inventaryNumber = request.getParameter("in");
		Document d = actions.getDocByInvNym(inventaryNumber);
		
		return new ModelAndView ("upload", "document", d);
	}
	
	@RequestMapping(value = "/upload")
	public ModelAndView upload(
			@RequestParam(value="inventaryNumber") String inventaryNumber,
			 @RequestParam(value="file") MultipartFile file
			)
	{	
		Document d = actions.getDocByInvNym(inventaryNumber);
		d.setFileName(file.getOriginalFilename());
		try {
			d.setFileBody(file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actions.add(d);
		return new ModelAndView ("index", "document", actions.DocumentList());
	}
	
	
	
	
	
	
	@RequestMapping(value = "/createDocument", method = RequestMethod.POST)
	public ModelAndView addDoc(
						@RequestParam(value="sectionName") String sectionName,
						 @RequestParam(value="numberInSection") String inventaryNumber,
						 @RequestParam(value="name") String name,
						 @RequestParam(value="publisher") String publisher,
						 @RequestParam(value="status") String status,
						 @RequestParam(value="note") String note,
						 @RequestParam(value="doctype") String doctype,
						 @RequestParam(value="quantity") int quantity,
						 @RequestParam(value="file") MultipartFile file,
						 HttpServletRequest request,
						 HttpServletResponse response)
	{
		try {
			Document doc = new Document();
			Section s = actions.getSectionByName(sectionName);
			doc.setSection(s);
			doc.setInventaryNumber(s.getId()+"."+inventaryNumber);
			doc.setName(name);
			
			
			Publisher p = actions.getPublisherByName(publisher);
			
			doc.setPublisher(p);
			doc.setStatus(status);
			doc.setNote(note);
			doc.setDocType(doctype);
			doc.setQuantity(quantity);
			doc.setFileBody(file.getBytes());
			doc.setFileName(file.getOriginalFilename());
			if(file.getOriginalFilename() == ""){
				doc.setFileName(null);
			}
			
					
			actions.add(doc);
			return new ModelAndView("index", "document", actions.DocumentList());
		} catch (IOException ex) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}
	
	@RequestMapping(value = "/SaveNewPublisher", method = RequestMethod.POST)
	public ModelAndView saveBigSection(
			@RequestParam(value="nameOfPublisher") String nameOfPublisher
			) {
	
		List <Publisher> pList = actions.PublisherList();
		for(int i=0; i<pList.size(); i++){
			if(pList.get(i).getName().equals(nameOfPublisher)){
				return new ModelAndView("createNewPublishererror");
			}
		}
		
		Publisher p = new Publisher();
		p.setName(nameOfPublisher);
		actions.add(p);
		List <BigSection> list = actions.BigSectionList();
		
		return new ModelAndView("choosebigsection", "bigSections", list);	
	}
	
	@RequestMapping(value = "/saveEditedDoc2", method = RequestMethod.POST)
	public ModelAndView saveEditedDoc2(
						@RequestParam(value="inventaryNumber") String inventaryNumber,
						 @RequestParam(value="name") String name,
						 @RequestParam(value="publisher") String publisherName,
						 @RequestParam(value="status") String status,
						 @RequestParam(value="note") String note,
						 @RequestParam(value="doctype") String doctype,
						 @RequestParam(value="quantity") int quantity,
						 @RequestParam(value="file") MultipartFile file,
						 HttpServletRequest request,
						 HttpServletResponse response)
	{
		
		Document doc = actions.getDocByInvNym(inventaryNumber);
		doc.setName(name);
		doc.setStatus(status);
		doc.setNote(note);
		doc.setDocType(doctype);
		doc.setQuantity(quantity);
		try {
			doc.setFileBody(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		doc.setFileName(file.getOriginalFilename());
		if(file.getOriginalFilename() == ""){
			doc.setFileName(null);
		}
		
		Publisher p = actions.getPublisherByName(publisherName);
		doc.setPublisher(p);
		
		actions.add(doc);
		
		return new ModelAndView("index", "document", actions.DocumentList());
	}
	
	@RequestMapping(value = "/saveEditedDoc", method = RequestMethod.POST)
	public ModelAndView saveEditedDoc(
						@RequestParam(value="inventaryNumber") String inventaryNumber,
						 @RequestParam(value="name") String name,
						 @RequestParam(value="publisher") String publisherName,
						 @RequestParam(value="status") String status,
						 @RequestParam(value="note") String note,
						 @RequestParam(value="doctype") String doctype,
						 @RequestParam(value="quantity") int quantity,
						 HttpServletRequest request,
						 HttpServletResponse response)
	{
		
		Document doc = actions.getDocByInvNym(inventaryNumber);
		doc.setName(name);
		doc.setStatus(status);
		doc.setNote(note);
		doc.setDocType(doctype);
		doc.setQuantity(quantity);
		
		Publisher p = actions.getPublisherByName(publisherName);
		doc.setPublisher(p);
		
		actions.add(doc);
		
		return new ModelAndView("index", "document", actions.DocumentList());
	}
	
	@RequestMapping(value = "/downloadFile")
	public void downloadFile(
			HttpServletRequest request,
			 HttpServletResponse response
			)
	{	
		String invNumb = request.getParameter("in");
		Document d = actions.getDocByInvNym(invNumb);
		
		response.setCharacterEncoding("Content-Transfer-Encoding:binary");
		response.setContentType("Content-Type:application/octet-stream");
		response.setHeader("Content-Disposition:attachment; filename=", d.getFileName());
		response.setContentLength((int) d.getFileBody().length);
		OutputStream os;
		BufferedOutputStream bos;
		try {
			os = response.getOutputStream();
			bos = new BufferedOutputStream(os);
			bos.write(d.getFileBody());
			bos.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	
}