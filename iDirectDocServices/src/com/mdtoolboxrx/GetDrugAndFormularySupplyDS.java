
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
 *         &lt;element name="NDC11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionalPbmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionalFormularyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionalCoverageListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ndc11",
    "optionalPbmId",
    "optionalFormularyId",
    "optionalCoverageListId",
    "accountObj"
})
@XmlRootElement(name = "GetDrugAndFormularySupplyDS")
public class GetDrugAndFormularySupplyDS
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NDC11")
    protected String ndc11;
    @XmlElement(name = "OptionalPbmId")
    protected String optionalPbmId;
    @XmlElement(name = "OptionalFormularyId")
    protected String optionalFormularyId;
    @XmlElement(name = "OptionalCoverageListId")
    protected String optionalCoverageListId;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the ndc11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDC11() {
        return ndc11;
    }

    /**
     * Sets the value of the ndc11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDC11(String value) {
        this.ndc11 = value;
    }

    /**
     * Gets the value of the optionalPbmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalPbmId() {
        return optionalPbmId;
    }

    /**
     * Sets the value of the optionalPbmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalPbmId(String value) {
        this.optionalPbmId = value;
    }

    /**
     * Gets the value of the optionalFormularyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalFormularyId() {
        return optionalFormularyId;
    }

    /**
     * Sets the value of the optionalFormularyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalFormularyId(String value) {
        this.optionalFormularyId = value;
    }

    /**
     * Gets the value of the optionalCoverageListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalCoverageListId() {
        return optionalCoverageListId;
    }

    /**
     * Sets the value of the optionalCoverageListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalCoverageListId(String value) {
        this.optionalCoverageListId = value;
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
