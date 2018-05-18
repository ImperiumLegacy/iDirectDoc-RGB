
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
 *         &lt;element name="SearchOrgFields" type="{http://mdtoolboxrx.com/}Organization" minOccurs="0"/>
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
    "searchOrgFields",
    "accountObj"
})
@XmlRootElement(name = "GetPharmacyGeoWTypeObj")
public class GetPharmacyGeoWTypeObj
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SearchOrgFields")
    protected Organization searchOrgFields;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the searchOrgFields property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getSearchOrgFields() {
        return searchOrgFields;
    }

    /**
     * Sets the value of the searchOrgFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setSearchOrgFields(Organization value) {
        this.searchOrgFields = value;
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
