
package com.mdtoolboxrx;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for MedicationRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrugID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RxNormCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Drug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Supply" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Compound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Directions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="QtyQual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Refills" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysSupply" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubstitutionAllowedFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Schedule" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PharmacyNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrescriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrescriptionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SignDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Status" type="{http://mdtoolboxrx.com/}RXStatus"/>
 *         &lt;element name="PharmacyNcpdpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RouteDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerMedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationRecord", propOrder = {
    "id",
    "drugID",
    "ndc",
    "rxNormCode",
    "drug",
    "supply",
    "compound",
    "directions",
    "qty",
    "qtyQual",
    "refills",
    "daysSupply",
    "substitutionAllowedFlag",
    "schedule",
    "pharmacyNote",
    "internalNote",
    "prescriberId",
    "locationId",
    "prescriptionDate",
    "signDate",
    "status",
    "pharmacyNcpdpId",
    "routeDetail",
    "partnerMedID"
})
public class MedicationRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "DrugID")
    protected String drugID;
    @XmlElement(name = "NDC")
    protected String ndc;
    @XmlElement(name = "RxNormCode")
    protected String rxNormCode;
    @XmlElement(name = "Drug")
    protected String drug;
    @XmlElement(name = "Supply")
    protected boolean supply;
    @XmlElement(name = "Compound")
    protected boolean compound;
    @XmlElement(name = "Directions")
    protected String directions;
    @XmlElement(name = "Qty")
    protected double qty;
    @XmlElement(name = "QtyQual")
    protected String qtyQual;
    @XmlElement(name = "Refills")
    protected int refills;
    @XmlElement(name = "DaysSupply")
    protected int daysSupply;
    @XmlElement(name = "SubstitutionAllowedFlag")
    protected int substitutionAllowedFlag;
    @XmlElement(name = "Schedule")
    protected int schedule;
    @XmlElement(name = "PharmacyNote")
    protected String pharmacyNote;
    @XmlElement(name = "InternalNote")
    protected String internalNote;
    @XmlElement(name = "PrescriberId")
    protected String prescriberId;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "PrescriptionDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar prescriptionDate;
    @XmlElement(name = "SignDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar signDate;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected RXStatus status;
    @XmlElement(name = "PharmacyNcpdpId")
    protected String pharmacyNcpdpId;
    @XmlElement(name = "RouteDetail")
    protected String routeDetail;
    @XmlElement(name = "PartnerMedID")
    protected String partnerMedID;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * Gets the value of the rxNormCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxNormCode() {
        return rxNormCode;
    }

    /**
     * Sets the value of the rxNormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxNormCode(String value) {
        this.rxNormCode = value;
    }

    /**
     * Gets the value of the drug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrug() {
        return drug;
    }

    /**
     * Sets the value of the drug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrug(String value) {
        this.drug = value;
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
     */
    public double getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     */
    public void setQty(double value) {
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
     */
    public int getSubstitutionAllowedFlag() {
        return substitutionAllowedFlag;
    }

    /**
     * Sets the value of the substitutionAllowedFlag property.
     * 
     */
    public void setSubstitutionAllowedFlag(int value) {
        this.substitutionAllowedFlag = value;
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
     * Gets the value of the internalNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalNote() {
        return internalNote;
    }

    /**
     * Sets the value of the internalNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalNote(String value) {
        this.internalNote = value;
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
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the prescriptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPrescriptionDate() {
        return prescriptionDate;
    }

    /**
     * Sets the value of the prescriptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionDate(Calendar value) {
        this.prescriptionDate = value;
    }

    /**
     * Gets the value of the signDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSignDate() {
        return signDate;
    }

    /**
     * Sets the value of the signDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignDate(Calendar value) {
        this.signDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RXStatus }
     *     
     */
    public RXStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXStatus }
     *     
     */
    public void setStatus(RXStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the pharmacyNcpdpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyNcpdpId() {
        return pharmacyNcpdpId;
    }

    /**
     * Sets the value of the pharmacyNcpdpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyNcpdpId(String value) {
        this.pharmacyNcpdpId = value;
    }

    /**
     * Gets the value of the routeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDetail() {
        return routeDetail;
    }

    /**
     * Sets the value of the routeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteDetail(String value) {
        this.routeDetail = value;
    }

    /**
     * Gets the value of the partnerMedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerMedID() {
        return partnerMedID;
    }

    /**
     * Sets the value of the partnerMedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerMedID(String value) {
        this.partnerMedID = value;
    }

}
