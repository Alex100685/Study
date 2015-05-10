package ua.kiev.prog;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "advertisements")
@XmlAccessorType (XmlAccessType.FIELD)
public class Advertisements
{
    @XmlElement(name = "advertisement")
    private List<Advertisement> advertisements = null;
 
    public List<Advertisement> getAdvertisements() {
        return advertisements;
    }
 
    public void setAdvertisements(List<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }
}