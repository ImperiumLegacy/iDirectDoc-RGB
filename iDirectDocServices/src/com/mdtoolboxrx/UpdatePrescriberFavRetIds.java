
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Favs" type="{http://mdtoolboxrx.com/}ArrayOfMedicationRecord" minOccurs="0"/>
 *         &lt;element name="AccountObj" type="{http://mdtoolboxrx.com/}Account" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "favs",
    "accountObj"
})
@XmlRootElement(name = "UpdatePrescriberFavRetIds")
public class UpdatePrescriberFavRetIds
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Favs")
    protected ArrayOfMedicationRecord favs;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the favs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMedicationRecord }
     *     
     */
    public ArrayOfMedicationRecord getFavs() {
        return favs;
    }

    /**
     * Sets the value of the favs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMedicationRecord }
     *     
     */
    public void setFavs(ArrayOfMedicationRecord value) {
        this.favs = value;
    }

    /**
     * Gets the value of the accountObj property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccountObj() {
        return accountObj;
    }

    /**
     * Sets the value of the accountObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccountObj(Account value) {
        this.accountObj = value;
    }

}
