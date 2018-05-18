
package com.mdtoolboxrx;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Prescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrescriptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RxRefillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PharmacyNCPDPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrugID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Supply" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Compound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SupplyOrCompoundName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Directions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QtyQual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Refills" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RefillQual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaysSupply" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubstitutionAllowedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PharmacyNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Schedule" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FormularyDisplayFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormularyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prescription", propOrder = {
    "prescriptionID",
    "rxRefillNumber",
    "pharmacyNCPDPID",
    "drugID",
    "supply",
    "compound",
    "supplyOrCompoundName",
    "directions",
    "qty",
    "qtyQual",
    "refills",
    "refillQual",
    "daysSupply",
    "substitutionAllowedFlag",
    "pharmacyNote",
    "schedule",
    "formularyDisplayFlags",
    "formularyStatus"
})
public class Prescription
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PrescriptionID")
    protected String prescriptionID;
    @XmlElement(name = "RxRefillNumber")
    protected String rxRefillNumber;
    @XmlElement(name = "PharmacyNCPDPID")
    protected String pharmacyNCPDPID;
    @XmlElement(name = "DrugID")
    protected String drugID;
    @XmlElement(name = "Supply")
    protected boolean supply;
    @XmlElement(name = "Compound")
    protected boolean compound;
    @XmlElement(name = "SupplyOrCompoundName")
    protected String supplyOrCompoundName;
    @XmlElement(name = "Directions")
    protected String directions;
    @XmlElement(name = "Qty", required = true)
    protected BigDecimal qty;
    @XmlElement(name = "QtyQual")
    protected String qtyQual;
    @XmlElement(name = "Refills")
    protected int refills;
    @XmlElement(name = "RefillQual")
    protected String refillQual;
    @XmlElement(name = "DaysSupply")
    protected int daysSupply;
    @XmlElement(name = "SubstitutionAllowedFlag")
    protected String substitutionAllowedFlag;
    @XmlElement(name = "PharmacyNote")
    protected String pharmacyNote;
    @XmlElement(name = "Schedule")
    protected int schedule;
    @XmlElement(name = "FormularyDisplayFlags")
    protected String formularyDisplayFlags;
    @XmlElement(name = "FormularyStatus")
    protected String formularyStatus;

    /**
     * Gets the value of the prescriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionID() {
        return prescriptionID;
    }

    /**
     * Sets the value of the prescriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionID(String value) {
        this.prescriptionID = value;
    }

    /**
     * Gets the value of the rxRefillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxRefillNumber() {
        return rxRefillNumber;
    }

    /**
     * Sets the value of the rxRefillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxRefillNumber(String value) {
        this.rxRefillNumber = value;
    }

    /**
     * Gets the value of the pharmacyNCPDPID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyNCPDPID() {
        return pharmacyNCPDPID;
    }

    /**
     * Sets the value of the pharmacyNCPDPID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyNCPDPID(String value) {
        this.pharmacyNCPDPID = value;
    }

    /**
     * Gets the value of the drugID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugID() {
        return drugID;
    }

    /**
     * Sets the value of the drugID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugID(String value) {
        this.drugID = value;
    }

    /**
     * Gets the value of the supply property.
     * 
     */
    public boolean isSupply() {
        return supply;
    }

    /**
     * Sets the value of the supply property.
     * 
     */
    public void setSupply(boolean value) {
        this.supply = value;
    }

    /**
     * Gets the value of the compound property.
     * 
     */
    public boolean isCompound() {
        return compound;
    }

    /**
     * Sets the value of the compound property.
     * 
     */
    public void setCompound(boolean value) {
        this.compound = value;
    }

    /**
     * Gets the value of the supplyOrCompoundName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplyOrCompoundName() {
        return supplyOrCompoundName;
    }

    /**
     * Sets the value of the supplyOrCompoundName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplyOrCompoundName(String value) {
        this.supplyOrCompoundName = value;
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
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the qtyQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtyQual() {
        return qtyQual;
    }

    /**
     * Sets the value of the qtyQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtyQual(String value) {
        this.qtyQual = value;
    }

    /**
     * Gets the value of the refills property.
     * 
     */
    public int getRefills() {
        return refills;
    }

    /**
     * Sets the value of the refills property.
     * 
     */
    public void setRefills(int value) {
        this.refills = value;
    }

    /**
     * Gets the value of the refillQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefillQual() {
        return refillQual;
    }

    /**
     * Sets the value of the refillQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefillQual(String value) {
        this.refillQual = value;
    }

    /**
     * Gets the value of the daysSupply property.
     * 
     */
    public int getDaysSupply() {
        return daysSupply;
    }

    /**
     * Sets the value of the daysSupply property.
     * 
     */
    public void setDaysSupply(int value) {
        this.daysSupply = value;
    }

    /**
     * Gets the value of the substitutionAllowedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstitutionAllowedFlag() {
        return substitutionAllowedFlag;
    }

    /**
     * Sets the value of the substitutionAllowedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstitutionAllowedFlag(String value) {
        this.substitutionAllowedFlag = value;
    }

    /**
     * Gets the value of the pharmacyNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyNote() {
        return pharmacyNote;
    }

    /**
     * Sets the value of the pharmacyNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyNote(String value) {
        this.pharmacyNote = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     */
    public int getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     */
    public void setSchedule(int value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the formularyDisplayFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormularyDisplayFlags() {
        return formularyDisplayFlags;
    }

    /**
     * Sets the value of the formularyDisplayFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormularyDisplayFlags(String value) {
        this.formularyDisplayFlags = value;
    }

    /**
     * Gets the value of the formularyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormularyStatus() {
        return formularyStatus;
    }

    /**
     * Sets the value of the formularyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormularyStatus(String value) {
        this.formularyStatus = value;
    }

}
