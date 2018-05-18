
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
 *         &lt;element name="SearchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeginsContains" type="{http://mdtoolboxrx.com/}SearchLike"/>
 *         &lt;element name="SearchFlag" type="{http://mdtoolboxrx.com/}SearchType"/>
 *         &lt;element name="NameFlag" type="{http://mdtoolboxrx.com/}NameType"/>
 *         &lt;element name="RxFlag" type="{http://mdtoolboxrx.com/}RXType"/>
 *         &lt;element name="SearchNameFields" type="{http://mdtoolboxrx.com/}SearchName"/>
 *         &lt;element name="PrescriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prescriber2LetterState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OptionalPbmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionalFormularyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionalCoverageListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoucherAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VouchersOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "searchName",
    "beginsContains",
    "searchFlag",
    "nameFlag",
    "rxFlag",
    "searchNameFields",
    "prescriberId",
    "prescriber2LetterState",
    "activeOnly",
    "optionalPbmId",
    "optionalFormularyId",
    "optionalCoverageListId",
    "patientId",
    "voucherAuth",
    "vouchersOnly",
    "accountObj"
})
@XmlRootElement(name = "GetDrugListwStateDeaPlusVoucherDS")
public class GetDrugListwStateDeaPlusVoucherDS
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SearchName")
    protected String searchName;
    @XmlElement(name = "BeginsContains", required = true)
    @XmlSchemaType(name = "string")
    protected SearchLike beginsContains;
    @XmlElement(name = "SearchFlag", required = true)
    @XmlSchemaType(name = "string")
    protected SearchType searchFlag;
    @XmlElement(name = "NameFlag", required = true)
    @XmlSchemaType(name = "string")
    protected NameType nameFlag;
    @XmlElement(name = "RxFlag", required = true)
    @XmlSchemaType(name = "string")
    protected RXType rxFlag;
    @XmlElement(name = "SearchNameFields", required = true)
    @XmlSchemaType(name = "string")
    protected SearchName searchNameFields;
    @XmlElement(name = "PrescriberId")
    protected String prescriberId;
    @XmlElement(name = "Prescriber2LetterState")
    protected String prescriber2LetterState;
    @XmlElement(name = "ActiveOnly")
    protected boolean activeOnly;
    @XmlElement(name = "OptionalPbmId")
    protected String optionalPbmId;
    @XmlElement(name = "OptionalFormularyId")
    protected String optionalFormularyId;
    @XmlElement(name = "OptionalCoverageListId")
    protected String optionalCoverageListId;
    @XmlElement(name = "PatientId")
    protected String patientId;
    @XmlElement(name = "VoucherAuth")
    protected String voucherAuth;
    @XmlElement(name = "VouchersOnly")
    protected boolean vouchersOnly;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the searchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchName() {
        return searchName;
    }

    /**
     * Sets the value of the searchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchName(String value) {
        this.searchName = value;
    }

    /**
     * Gets the value of the beginsContains property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLike }
     *     
     */
    public SearchLike getBeginsContains() {
        return beginsContains;
    }

    /**
     * Sets the value of the beginsContains property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLike }
     *     
     */
    public void setBeginsContains(SearchLike value) {
        this.beginsContains = value;
    }

    /**
     * Gets the value of the searchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link SearchType }
     *     
     */
    public SearchType getSearchFlag() {
        return searchFlag;
    }

    /**
     * Sets the value of the searchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType }
     *     
     */
    public void setSearchFlag(SearchType value) {
        this.searchFlag = value;
    }

    /**
     * Gets the value of the nameFlag property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getNameFlag() {
        return nameFlag;
    }

    /**
     * Sets the value of the nameFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setNameFlag(NameType value) {
        this.nameFlag = value;
    }

    /**
     * Gets the value of the rxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link RXType }
     *     
     */
    public RXType getRxFlag() {
        return rxFlag;
    }

    /**
     * Sets the value of the rxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXType }
     *     
     */
    public void setRxFlag(RXType value) {
        this.rxFlag = value;
    }

    /**
     * Gets the value of the searchNameFields property.
     * 
     * @return
     *     possible object is
     *     {@link SearchName }
     *     
     */
    public SearchName getSearchNameFields() {
        return searchNameFields;
    }

    /**
     * Sets the value of the searchNameFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchName }
     *     
     */
    public void setSearchNameFields(SearchName value) {
        this.searchNameFields = value;
    }

    /**
     * Gets the value of the prescriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriberId() {
        return prescriberId;
    }

    /**
     * Sets the value of the prescriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriberId(String value) {
        this.prescriberId = value;
    }

    /**
     * Gets the value of the prescriber2LetterState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriber2LetterState() {
        return prescriber2LetterState;
    }

    /**
     * Sets the value of the prescriber2LetterState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriber2LetterState(String value) {
        this.prescriber2LetterState = value;
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
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientId(String value) {
        this.patientId = value;
    }

    /**
     * Gets the value of the voucherAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherAuth() {
        return voucherAuth;
    }

    /**
     * Sets the value of the voucherAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherAuth(String value) {
        this.voucherAuth = value;
    }

    /**
     * Gets the value of the vouchersOnly property.
     * 
     */
    public boolean isVouchersOnly() {
        return vouchersOnly;
    }

    /**
     * Sets the value of the vouchersOnly property.
     * 
     */
    public void setVouchersOnly(boolean value) {
        this.vouchersOnly = value;
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
