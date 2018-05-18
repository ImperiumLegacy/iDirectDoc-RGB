
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
 *         &lt;element name="NameFlag" type="{http://mdtoolboxrx.com/}NameType"/>
 *         &lt;element name="RxFlag" type="{http://mdtoolboxrx.com/}RXType"/>
 *         &lt;element name="SearchNameFields" type="{http://mdtoolboxrx.com/}SearchName"/>
 *         &lt;element name="PrescriberId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ActiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReturnPageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "nameFlag",
    "rxFlag",
    "searchNameFields",
    "prescriberId",
    "activeOnly",
    "pageSize",
    "returnPageNumber",
    "accountObj"
})
@XmlRootElement(name = "GetDrugListWithPagingObj")
public class GetDrugListWithPagingObj
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SearchName")
    protected String searchName;
    @XmlElement(name = "BeginsContains", required = true)
    @XmlSchemaType(name = "string")
    protected SearchLike beginsContains;
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
    protected int prescriberId;
    @XmlElement(name = "ActiveOnly")
    protected boolean activeOnly;
    @XmlElement(name = "PageSize")
    protected int pageSize;
    @XmlElement(name = "ReturnPageNumber")
    protected int returnPageNumber;
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
     */
    public int getPrescriberId() {
        return prescriberId;
    }

    /**
     * Sets the value of the prescriberId property.
     * 
     */
    public void setPrescriberId(int value) {
        this.prescriberId = value;
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
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the returnPageNumber property.
     * 
     */
    public int getReturnPageNumber() {
        return returnPageNumber;
    }

    /**
     * Sets the value of the returnPageNumber property.
     * 
     */
    public void setReturnPageNumber(int value) {
        this.returnPageNumber = value;
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
