
package dhbwka.wwi.vertsys.javaee.giftit.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für search complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="search"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="search" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://soap.giftit.javaee.vertsys.wwi.dhbwka/}categoryGiftit" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://soap.giftit.javaee.vertsys.wwi.dhbwka/}giftStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "search", propOrder = {
    "search",
    "category",
    "status"
})
public class Search {

    protected String search;
    protected CategoryGiftit category;
    @XmlSchemaType(name = "string")
    protected GiftStatus status;

    /**
     * Ruft den Wert der search-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearch() {
        return search;
    }

    /**
     * Legt den Wert der search-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearch(String value) {
        this.search = value;
    }

    /**
     * Ruft den Wert der category-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CategoryGiftit }
     *     
     */
    public CategoryGiftit getCategory() {
        return category;
    }

    /**
     * Legt den Wert der category-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryGiftit }
     *     
     */
    public void setCategory(CategoryGiftit value) {
        this.category = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GiftStatus }
     *     
     */
    public GiftStatus getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftStatus }
     *     
     */
    public void setStatus(GiftStatus value) {
        this.status = value;
    }

}
