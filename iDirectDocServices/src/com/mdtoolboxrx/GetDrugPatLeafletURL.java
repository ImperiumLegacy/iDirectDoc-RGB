
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="DrugId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Lang" type="{http://mdtoolboxrx.com/}Language"/>
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
    "drugId",
    "lang",
    "accountObj"
})
@XmlRootElement(name = "GetDrugPatLeafletURL")
public class GetDrugPatLeafletURL
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DrugId")
    protected int drugId;
    @XmlElement(name = "Lang", required = true)
    @XmlSchemaType(name = "string")
    protected Language lang;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the drugId property.
     * 
     */
    public int getDrugId() {
        return drugId;
    }

    /**
     * Sets the value of the drugId property.
     * 
     */
    public void setDrugId(int value) {
        this.drugId = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLang(Language value) {
        this.lang = value;
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