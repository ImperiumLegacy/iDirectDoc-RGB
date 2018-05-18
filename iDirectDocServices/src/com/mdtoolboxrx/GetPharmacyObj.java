
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
 *         &lt;element name="PharmacyObj" type="{http://mdtoolboxrx.com/}Pharmacy" minOccurs="0"/>
 *         &lt;element name="ActiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeRetail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeMailOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeFax" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeSpecialty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeLongTerm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeTwentyFourHour" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "pharmacyObj",
    "activeOnly",
    "includeRetail",
    "includeMailOrder",
    "includeFax",
    "includeSpecialty",
    "includeLongTerm",
    "includeTwentyFourHour",
    "accountObj"
})
@XmlRootElement(name = "GetPharmacyObj")
public class GetPharmacyObj
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PharmacyObj")
    protected Pharmacy pharmacyObj;
    @XmlElement(name = "ActiveOnly")
    protected boolean activeOnly;
    @XmlElement(name = "IncludeRetail")
    protected boolean includeRetail;
    @XmlElement(name = "IncludeMailOrder")
    protected boolean includeMailOrder;
    @XmlElement(name = "IncludeFax")
    protected boolean includeFax;
    @XmlElement(name = "IncludeSpecialty")
    protected boolean includeSpecialty;
    @XmlElement(name = "IncludeLongTerm")
    protected boolean includeLongTerm;
    @XmlElement(name = "IncludeTwentyFourHour")
    protected boolean includeTwentyFourHour;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the pharmacyObj property.
     * 
     * @return
     *     possible object is
     *     {@link Pharmacy }
     *     
     */
    public Pharmacy getPharmacyObj() {
        return pharmacyObj;
    }

    /**
     * Sets the value of the pharmacyObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pharmacy }
     *     
     */
    public void setPharmacyObj(Pharmacy value) {
        this.pharmacyObj = value;
    }

    /**
     * Gets the value of the activeOnly property.
     * 
     */
    public boolean isActiveOnly() {
        return activeOnly;
    }

    /**
     * Sets the value of the activeOnly property.
     * 
     */
    public void setActiveOnly(boolean value) {
        this.activeOnly = value;
    }

    /**
     * Gets the value of the includeRetail property.
     * 
     */
    public boolean isIncludeRetail() {
        return includeRetail;
    }

    /**
     * Sets the value of the includeRetail property.
     * 
     */
    public void setIncludeRetail(boolean value) {
        this.includeRetail = value;
    }

    /**
     * Gets the value of the includeMailOrder property.
     * 
     */
    public boolean isIncludeMailOrder() {
        return includeMailOrder;
    }

    /**
     * Sets the value of the includeMailOrder property.
     * 
     */
    public void setIncludeMailOrder(boolean value) {
        this.includeMailOrder = value;
    }

    /**
     * Gets the value of the includeFax property.
     * 
     */
    public boolean isIncludeFax() {
        return includeFax;
    }

    /**
     * Sets the value of the includeFax property.
     * 
     */
    public void setIncludeFax(boolean value) {
        this.includeFax = value;
    }

    /**
     * Gets the value of the includeSpecialty property.
     * 
     */
    public boolean isIncludeSpecialty() {
        return includeSpecialty;
    }

    /**
     * Sets the value of the includeSpecialty property.
     * 
     */
    public void setIncludeSpecialty(boolean value) {
        this.includeSpecialty = value;
    }

    /**
     * Gets the value of the includeLongTerm property.
     * 
     */
    public boolean isIncludeLongTerm() {
        return includeLongTerm;
    }

    /**
     * Sets the value of the includeLongTerm property.
     * 
     */
    public void setIncludeLongTerm(boolean value) {
        this.includeLongTerm = value;
    }

    /**
     * Gets the value of the includeTwentyFourHour property.
     * 
     */
    public boolean isIncludeTwentyFourHour() {
        return includeTwentyFourHour;
    }

    /**
     * Sets the value of the includeTwentyFourHour property.
     * 
     */
    public void setIncludeTwentyFourHour(boolean value) {
        this.includeTwentyFourHour = value;
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
