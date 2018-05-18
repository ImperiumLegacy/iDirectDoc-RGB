
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
 *         &lt;element name="UnqDrugId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SupplyNDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PbmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormularyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoverageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopayId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "unqDrugId",
    "supplyNDC",
    "pbmId",
    "formularyId",
    "coverageId",
    "copayId",
    "accountObj"
})
@XmlRootElement(name = "GetDrugAltsDS")
public class GetDrugAltsDS
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UnqDrugId")
    protected int unqDrugId;
    @XmlElement(name = "SupplyNDC")
    protected String supplyNDC;
    @XmlElement(name = "PbmId")
    protected String pbmId;
    @XmlElement(name = "FormularyId")
    protected String formularyId;
    @XmlElement(name = "CoverageId")
    protected String coverageId;
    @XmlElement(name = "CopayId")
    protected String copayId;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the unqDrugId property.
     * 
     */
    public int getUnqDrugId() {
        return unqDrugId;
    }

    /**
     * Sets the value of the unqDrugId property.
     * 
     */
    public void setUnqDrugId(int value) {
        this.unqDrugId = value;
    }

    /**
     * Gets the value of the supplyNDC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplyNDC() {
        return supplyNDC;
    }

    /**
     * Sets the value of the supplyNDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplyNDC(String value) {
        this.supplyNDC = value;
    }

    /**
     * Gets the value of the pbmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPbmId() {
        return pbmId;
    }

    /**
     * Sets the value of the pbmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPbmId(String value) {
        this.pbmId = value;
    }

    /**
     * Gets the value of the formularyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormularyId() {
        return formularyId;
    }

    /**
     * Sets the value of the formularyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormularyId(String value) {
        this.formularyId = value;
    }

    /**
     * Gets the value of the coverageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageId() {
        return coverageId;
    }

    /**
     * Sets the value of the coverageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageId(String value) {
        this.coverageId = value;
    }

    /**
     * Gets the value of the copayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopayId() {
        return copayId;
    }

    /**
     * Sets the value of the copayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopayId(String value) {
        this.copayId = value;
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
