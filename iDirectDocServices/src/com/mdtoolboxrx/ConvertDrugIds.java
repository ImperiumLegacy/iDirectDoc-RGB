
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
 *         &lt;element name="DrugIdsToConvert" type="{http://mdtoolboxrx.com/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="DrugIdSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "drugIdsToConvert",
    "drugIdSource",
    "accountObj"
})
@XmlRootElement(name = "ConvertDrugIds")
public class ConvertDrugIds
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DrugIdsToConvert")
    protected ArrayOfString drugIdsToConvert;
    @XmlElement(name = "DrugIdSource")
    protected String drugIdSource;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the drugIdsToConvert property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDrugIdsToConvert() {
        return drugIdsToConvert;
    }

    /**
     * Sets the value of the drugIdsToConvert property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDrugIdsToConvert(ArrayOfString value) {
        this.drugIdsToConvert = value;
    }

    /**
     * Gets the value of the drugIdSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugIdSource() {
        return drugIdSource;
    }

    /**
     * Sets the value of the drugIdSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugIdSource(String value) {
        this.drugIdSource = value;
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
