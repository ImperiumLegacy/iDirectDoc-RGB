
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoryQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoryQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prescriber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrescriberDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pharmacy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PharmacyDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastFillDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrugDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Directions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaysSupply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispQtyUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MappedDrugId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MappedRxNorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryQuery", propOrder = {
    "source",
    "prescriber",
    "prescriberDetail",
    "pharmacy",
    "pharmacyDetail",
    "lastFillDate",
    "drugDescription",
    "directions",
    "daysSupply",
    "dispQty",
    "dispQtyUnit",
    "ndc",
    "note",
    "mappedDrugId",
    "mappedRxNorm"
})
public class HistoryQuery
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Prescriber")
    protected String prescriber;
    @XmlElement(name = "PrescriberDetail")
    protected String prescriberDetail;
    @XmlElement(name = "Pharmacy")
    protected String pharmacy;
    @XmlElement(name = "PharmacyDetail")
    protected String pharmacyDetail;
    @XmlElement(name = "LastFillDate")
    protected String lastFillDate;
    @XmlElement(name = "DrugDescription")
    protected String drugDescription;
    @XmlElement(name = "Directions")
    protected String directions;
    @XmlElement(name = "DaysSupply")
    protected String daysSupply;
    @XmlElement(name = "DispQty")
    protected String dispQty;
    @XmlElement(name = "DispQtyUnit")
    protected String dispQtyUnit;
    @XmlElement(name = "NDC")
    protected String ndc;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "MappedDrugId")
    protected String mappedDrugId;
    @XmlElement(name = "MappedRxNorm")
    protected String mappedRxNorm;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the prescriber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriber() {
        return prescriber;
    }

    /**
     * Sets the value of the prescriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriber(String value) {
        this.prescriber = value;
    }

    /**
     * Gets the value of the prescriberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriberDetail() {
        return prescriberDetail;
    }

    /**
     * Sets the value of the prescriberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriberDetail(String value) {
        this.prescriberDetail = value;
    }

    /**
     * Gets the value of the pharmacy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacy() {
        return pharmacy;
    }

    /**
     * Sets the value of the pharmacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacy(String value) {
        this.pharmacy = value;
    }

    /**
     * Gets the value of the pharmacyDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyDetail() {
        return pharmacyDetail;
    }

    /**
     * Sets the value of the pharmacyDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyDetail(String value) {
        this.pharmacyDetail = value;
    }

    /**
     * Gets the value of the lastFillDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastFillDate() {
        return lastFillDate;
    }

    /**
     * Sets the value of the lastFillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFillDate(String value) {
        this.lastFillDate = value;
    }

    /**
     * Gets the value of the drugDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugDescription() {
        return drugDescription;
    }

    /**
     * Sets the value of the drugDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugDescription(String value) {
        this.drugDescription = value;
    }

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirections(String value) {
        this.directions = value;
    }

    /**
     * Gets the value of the daysSupply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysSupply() {
        return daysSupply;
    }

    /**
     * Sets the value of the daysSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysSupply(String value) {
        this.daysSupply = value;
    }

    /**
     * Gets the value of the dispQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispQty() {
        return dispQty;
    }

    /**
     * Sets the value of the dispQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispQty(String value) {
        this.dispQty = value;
    }

    /**
     * Gets the value of the dispQtyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispQtyUnit() {
        return dispQtyUnit;
    }

    /**
     * Sets the value of the dispQtyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispQtyUnit(String value) {
        this.dispQtyUnit = value;
    }

    /**
     * Gets the value of the ndc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDC() {
        return ndc;
    }

    /**
     * Sets the value of the ndc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDC(String value) {
        this.ndc = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the mappedDrugId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedDrugId() {
        return mappedDrugId;
    }

    /**
     * Sets the value of the mappedDrugId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedDrugId(String value) {
        this.mappedDrugId = value;
    }

    /**
     * Gets the value of the mappedRxNorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedRxNorm() {
        return mappedRxNorm;
    }

    /**
     * Sets the value of the mappedRxNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedRxNorm(String value) {
        this.mappedRxNorm = value;
    }

}
