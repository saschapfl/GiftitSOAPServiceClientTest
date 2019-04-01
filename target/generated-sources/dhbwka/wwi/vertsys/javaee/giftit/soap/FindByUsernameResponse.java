
package dhbwka.wwi.vertsys.javaee.giftit.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für findByUsernameResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="findByUsernameResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gifts" type="{http://soap.giftit.javaee.vertsys.wwi.dhbwka/}giftGiftit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findByUsernameResponse", propOrder = {
    "gifts"
})
public class FindByUsernameResponse {

    protected List<GiftGiftit> gifts;

    /**
     * Gets the value of the gifts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gifts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGifts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiftGiftit }
     * 
     * 
     */
    public List<GiftGiftit> getGifts() {
        if (gifts == null) {
            gifts = new ArrayList<GiftGiftit>();
        }
        return this.gifts;
    }

}
