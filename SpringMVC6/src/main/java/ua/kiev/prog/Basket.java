package ua.kiev.prog;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Basket")
public class Basket {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    @Column(name = "short_desc")
    private String shortDesc;

    @Column(name = "long_desc")
    private String longDesc;

    private String phone;
    private double price;
    
    @Column(name = "photo_name")
    private String photoName;
    
    @Column(name = "photo_body")
    private byte [] photoBody;
    

    

    public Basket() {}

    public Basket(String name, String shortDesc, String longDesc, String phone, double price, String photoName, byte [] photoBody) {
        this.name = name;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.phone = phone;
        this.price = price;
        this.photoName = photoName;
        this.photoBody = photoBody;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public byte[] getPhotoBody() {
		return photoBody;
	}

	public void setPhotoBody(byte[] photoBody) {
		this.photoBody = photoBody;
	}

   
}

