package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class AdvDAOImpl implements AdvDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Advertisement> list() {
        Query query = entityManager.createQuery("SELECT a FROM Advertisement a", Advertisement.class);
        return (List<Advertisement>) query.getResultList();
    }

    @Override
    public List<Advertisement> list(String pattern) {
        Query query = entityManager.createQuery("SELECT a FROM Advertisement a WHERE a.shortDesc LIKE :pattern", Advertisement.class);
        query.setParameter("pattern", "%" + pattern + "%");
        return (List<Advertisement>) query.getResultList();
    }
    
    
    @Override
    public List<Basket> listDeleted(String pattern) {
        Query query = entityManager.createQuery("SELECT b FROM Basket b WHERE b.shortDesc LIKE :pattern", Basket.class);
        query.setParameter("pattern", "%" + pattern + "%");
        return (List<Basket>) query.getResultList();
    }
    
    @Override
    public List<Basket> listDeleted() {
    	Query query = entityManager.createQuery("SELECT b FROM Basket b", Basket.class);
        return (List<Basket>) query.getResultList();
    }

    @Override
    public void add(Advertisement adv) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(adv);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            ex.printStackTrace();
        }
    }

    @Override
    public void delete() {
    	try{
    	entityManager.getTransaction().begin();
    	Query query = entityManager.createNativeQuery("DELETE FROM basket");
    	query.executeUpdate();
    	entityManager.getTransaction().commit();
    	}catch (Exception ex){
    		entityManager.getTransaction().rollback();
            ex.printStackTrace();
    	}
    }
    @Override
    public void toBasket(long [] id){
    	
    	 try {
    		 entityManager.getTransaction().begin();
             for(int i=0; i<id.length; i++){
            	 
             Advertisement adv = entityManager.find(Advertisement.class, id [i]);
             
             Basket basket = new Basket();
             basket.setName(adv.getName());
             basket.setLongDesc(adv.getLongDesc());
             basket.setPhone(adv.getPhone());
             basket.setPrice(adv.getPrice());
             basket.setShortDesc(adv.getLongDesc());
             basket.setPhotoName(adv.getPhoto().getName());
             basket.setPhotoBody(adv.getPhoto().getBody());
             
             entityManager.remove(adv);
             
             entityManager.persist(basket);
             }
             entityManager.getTransaction().commit();
         } catch (Exception ex) {
             entityManager.getTransaction().rollback();
             ex.printStackTrace();
         }
    	
    	
    	
    }
    
    

    @Override
    public byte[] getPhoto(long id) {
        try {
            Photo photo = entityManager.find(Photo.class, id);
            return photo.getBody();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    @Override
    public byte[] getPhotoDeleted(long id) {
        try {
            Basket basket = entityManager.find(Basket.class, id);
            return basket.getPhotoBody();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    
    
    
    
    

	@Override
	public void restore(long[] id) {
		 try {
    		 entityManager.getTransaction().begin();
             for(int i=0; i<id.length; i++){
            	 
             Basket basket = entityManager.find(Basket.class, id [i]);
             
             Advertisement adv = new Advertisement();
             adv.setName(basket.getName());
             adv.setLongDesc(basket.getLongDesc());
             adv.setPhone(basket.getPhone());
             adv.setPrice(basket.getPrice());
             adv.setShortDesc(basket.getLongDesc());
             Photo photo = new Photo();
             photo.setName(basket.getPhotoName());
             photo.setBody(basket.getPhotoBody());
             adv.setPhoto(photo);
             
             entityManager.remove(basket);
             
             entityManager.persist(adv);
             }
             entityManager.getTransaction().commit();
         } catch (Exception ex) {
             entityManager.getTransaction().rollback();
             ex.printStackTrace();
         }
		
	}
}
