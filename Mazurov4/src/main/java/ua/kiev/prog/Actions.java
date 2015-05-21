package ua.kiev.prog;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;



public interface Actions {
	
	List <Document> DocumentList();
	List <BigSection> BigSectionList();
	List <Publisher> PublisherList();
	List <Document> searchByInvNumbList(String pattern);
	List <Document> searchByName(String pattern);
	List <Document> searchByPublisher(String pattern);
	
	public void add(BigSection bs);
	public void add(Document d);
	public void add(Publisher d);
	
	List <Section> smallSectionList(String BigSectionName);
	public BigSection getBigSectionByName(String name);
	public Section getSectionByName(String name);
	public Publisher getPublisherByName(String name);
	public Document getDocByInvNym(String inventaryNumber);
	void deleteDocByInvNum(String [] invNum);
	

}
