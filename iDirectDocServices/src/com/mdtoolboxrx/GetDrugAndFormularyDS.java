
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
 *         &lt;element name="DrugId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrugProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnqProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RxNorm_CUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "drugId",
    "drugProductId",
    "unqProductId",
    "rxNormCUI",
    "activeOnly",
    "optionalPbmId",
    "optionalFormularyId",
    "optionalCoverageListId",
    "accountObj"
})
@XmlRootElement(name = "GetDrugAndFormularyDS")
public class GetDrugAndFormularyDS
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DrugId")
    protected String drugId;
    @XmlElement(name = "DrugProductId")
    protected int drugProductId;
    @XmlElement(name = "UnqProductId")
    protected int unqProductId;
    @XmlElement(name = "RxNorm_CUI")
    protected String rxNormCUI;
    @XmlElement(name = "ActiveOnly")
    protected boolean activeOnly;
    @XmlElement(name = "OptionalPbmId")
    protected String optionalPbmId;
    @XmlElement(name = "OptionalFormularyId")
    protected String optionalFormularyId;
    @XmlElement(name = "OptionalCoverageListId")
    protected String optionalCoverageListId;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the drugId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugId() {
        return drugId;
    }

    /**
     * Sets the value of the drugId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugId(String value) {
        this.drugId = value;
    }

    /**
     * Gets the value of the drugProductId property.
     * 
     */
    public int getDrugProductId() {
        return drugProductId;
    }

    /**
     * Sets the value of the drugProductId property.
     * 
     */
    public void setDrugProductId(int value) {
        this.drugProductId = value;
    }

    /**
     * Gets the value of the unqProductId property.
     * 
     */
    public int getUnqProductId() {
        return unqProductId;
    }

    /**
     * Sets the value of the unqProductId property.
     * 
     */
    public void setUnqProductId(int value) {
        this.unqProductId = value;
    }

    /**
     * Gets the value of the rxNormCUI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxNormCUI() {
        return rxNormCUI;
    }

    /**
     * Sets the value of the rxNormCUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxNormCUI(String value) {
        this.rxNormCUI = value;
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
