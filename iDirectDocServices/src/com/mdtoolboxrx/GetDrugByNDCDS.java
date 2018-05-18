
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
 *         &lt;element name="NDC11Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "ndc11Code",
    "activeOnly",
    "accountObj"
})
@XmlRootElement(name = "GetDrugByNDCDS")
public class GetDrugByNDCDS
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NDC11Code")
    protected String ndc11Code;
    @XmlElement(name = "ActiveOnly")
    protected boolean activeOnly;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the ndc11Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDC11Code() {
        return ndc11Code;
    }

    /**
     * Sets the value of the ndc11Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDC11Code(String value) {
        this.ndc11Code = value;
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
