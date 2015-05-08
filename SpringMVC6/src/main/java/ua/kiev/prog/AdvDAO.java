package ua.kiev.prog;

import java.util.List;

public interface AdvDAO {
	List<Advertisement> list();
    List<Advertisement> list(String pattern);
    List<Basket> listDeleted(String pattern);
    List<Basket> listDeleted();
	void add(Advertisement adv);
    void delete();
    byte[] getPhoto(long id);
    byte[] getPhotoDeleted(long id);
    void toBasket(long [] id);
    void restore(long [] id);
}
