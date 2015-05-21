package ua.kiev.prog;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import java.beans.XMLEncoder;
import java.util.ArrayList;
import java.util.List;


public class ActionsImpl implements Actions {
	
	@Autowired
    private EntityManager entityManager;
	
	
	

	public List<Document> DocumentList() {
		List<Document> list = new ArrayList<>();
		Query query = entityManager.createQuery("SELECT d FROM Document d", Document.class);
		list = query.getResultList();
		return list;
	}
	
	public List<BigSection> BigSectionList() {
		List<BigSection> list = new ArrayList<>();
		Query query = entityManager.createQuery("SELECT b FROM BigSection b", BigSection.class);
		list = query.getResultList();
		return list;
	}

	@Override
	public void add(BigSection bs) {
		try {
            entityManager.getTransaction().begin();
            entityManager.persist(bs);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            ex.printStackTrace();
        }
		
	}

	@Override
	public List<Section> smallSectionList(String bigSectionName) {
		BigSection bs;
		Query query = entityManager.createQuery("SELECT b FROM BigSection b WHERE b.name = '"+bigSectionName+"'", BigSection.class);
		bs = (BigSection) query.getSingleResult();
		List <Section> list = new ArrayList<>();
		list = bs.getSections();
		return list;
	}
	
	public BigSection getBigSectionByName(String name){
		BigSection bs;
		Query query = entityManager.createQuery("SELECT b FROM BigSection b WHERE b.name = '"+name+"'", BigSection.class);
		bs = (BigSection) query.getSingleResult();
		return bs;
		
	}

	@Override
	public Section getSectionByName(String name) {
		Section s;
		Query query = entityManager.createQuery("SELECT s FROM Section s WHERE s.name ='"+name+"'", Section.class);
		s = (Section) query.getSingleResult();
		return s;	
	}

	@Override
	public void add(Document d) {
		try {
			EntityTransaction tr = entityManager.getTransaction();
			boolean b = tr.isActive();
			
          	tr.begin();
            entityManager.persist(d);
            boolean c = tr.isActive();
            tr.commit();
            
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            ex.printStackTrace();
        }
		
		
	}
	
	@Override
	public void add(Publisher p) {
		try {
			EntityTransaction tr = entityManager.getTransaction();
			boolean b = tr.isActive();
			
          	tr.begin();
            entityManager.persist(p);
            boolean c = tr.isActive();
            tr.commit();
            
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            ex.printStackTrace();
        }
		
		
	}

	@Override
	public List<Document> searchByInvNumbList(String pattern) {
		List<Document> list = new ArrayList<>();
		Query query = entityManager.createQuery("SELECT d FROM Document d", Document.class);
		list = query.getResultList();
		List <Document> searchList = new ArrayList<>();
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getInventaryNumber().contains(pattern)){
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}
	
	public List<Document> searchByName(String pattern) {
		List<Document> list = new ArrayList<>();
		Query query = entityManager.createQuery("SELECT d FROM Document d", Document.class);
		list = query.getResultList();
		List <Document> searchList = new ArrayList<>();
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getName().contains(pattern)){
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}
	
	public List<Document> searchByPublisher(String pattern) {
		List<Publisher> list = new ArrayList<>();
		Query query = entityManager.createQuery("SELECT p FROM Publisher p", Publisher.class);
		list = query.getResultList();
		List <Publisher> searchList = new ArrayList<>();
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getName().contains(pattern)){
				searchList.add(list.get(i));
			}
		}
		List <Document> docList = new ArrayList <Document>();
		for(int i=0; i<searchList.size(); i++){
			List <Document> tempList = searchList.get(i).getDocuments();
			for(int j=0; j<tempList.size(); j++){
				docList.add(tempList.get(j));
			}
			
		}
		
		return docList;
	}

	@Override
	public List<Publisher> PublisherList() {
		List<Publisher> list = new ArrayList<>();
		Query query = entityManager.createQuery("SELECT p FROM Publisher p", Publisher.class);
		list = query.getResultList();
		return list;
	}

	@Override
	public Publisher getPublisherByName(String name) {
		Query query = entityManager.createQuery("SELECT p FROM Publisher p WHERE p.name = '"+name+"'");
		Publisher p = (Publisher) query.getSingleResult();
		return p;
	}

	@Override
	public Document getDocByInvNym(String inventaryNumber) {
		Query query = entityManager.createQuery("SELECT d FROM Document d WHERE d.inventaryNumber = '"+inventaryNumber+"'");
		Document d = (Document) query.getSingleResult();
		return d;
	}

	@Override
	public void deleteDocByInvNum(String [] invNum) {
		List <Document> docList = new ArrayList<>();
		for(int i=0; i<invNum.length; i++){
			Query query = entityManager.createQuery("SELECT d FROM Document d WHERE d.inventaryNumber = '"+invNum[i]+"'");
			Document d = (Document) query.getSingleResult();
			docList.add(d);
		}
		
		entityManager.getTransaction().begin();
		
		for(Document d:docList){
		entityManager.remove(d);
		}
		entityManager.getTransaction().commit();
	}
	
	
	
	

}
