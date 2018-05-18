
package com.mdtoolboxrx;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


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
 *         &lt;element name="Prescribers" type="{http://mdtoolboxrx.com/}ArrayOfPrescriber" minOccurs="0"/>
 *         &lt;element name="Locations" type="{http://mdtoolboxrx.com/}ArrayOfLocation" minOccurs="0"/>
 *         &lt;element name="PatientObj" type="{http://mdtoolboxrx.com/}Patient" minOccurs="0"/>
 *         &lt;element name="PatientMedications" type="{http://mdtoolboxrx.com/}ArrayOfMedicationRecord" minOccurs="0"/>
 *         &lt;element name="PatientAllergies" type="{http://mdtoolboxrx.com/}ArrayOfAllergyRecord" minOccurs="0"/>
 *         &lt;element name="PatientConditions" type="{http://mdtoolboxrx.com/}ArrayOfConditionRecord" minOccurs="0"/>
 *         &lt;element name="PatientCurrentVitals" type="{http://mdtoolboxrx.com/}VitalRecord" minOccurs="0"/>
 *         &lt;element name="CheckPatEligibility" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EligCheckEncounterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EligCheckPrescriber" type="{http://mdtoolboxrx.com/}Prescriber" minOccurs="0"/>
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
    "prescribers",
    "locations",
    "patientObj",
    "patientMedications",
    "patientAllergies",
    "patientConditions",
    "patientCurrentVitals",
    "checkPatEligibility",
    "eligCheckEncounterDate",
    "eligCheckPrescriber",
    "accountObj"
})
@XmlRootElement(name = "UpdateDataForScreens")
public class UpdateDataForScreens
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Prescribers")
    protected ArrayOfPrescriber prescribers;
    @XmlElement(name = "Locations")
    protected ArrayOfLocation locations;
    @XmlElement(name = "PatientObj")
    protected Patient patientObj;
    @XmlElement(name = "PatientMedications")
    protected ArrayOfMedicationRecord patientMedications;
    @XmlElement(name = "PatientAllergies")
    protected ArrayOfAllergyRecord patientAllergies;
    @XmlElement(name = "PatientConditions")
    protected ArrayOfConditionRecord patientConditions;
    @XmlElement(name = "PatientCurrentVitals")
    protected VitalRecord patientCurrentVitals;
    @XmlElement(name = "CheckPatEligibility")
    protected boolean checkPatEligibility;
    @XmlElement(name = "EligCheckEncounterDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar eligCheckEncounterDate;
    @XmlElement(name = "EligCheckPrescriber")
    protected Prescriber eligCheckPrescriber;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the prescribers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrescriber }
     *     
     */
    public ArrayOfPrescriber getPrescribers() {
        return prescribers;
    }

    /**
     * Sets the value of the prescribers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrescriber }
     *     
     */
    public void setPrescribers(ArrayOfPrescriber value) {
        this.prescribers = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocation }
     *     
     */
    public ArrayOfLocation getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocation }
     *     
     */
    public void setLocations(ArrayOfLocation value) {
        this.locations = value;
    }

    /**
     * Gets the value of the patientObj property.
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getPatientObj() {
        return patientObj;
    }

    /**
     * Sets the value of the patientObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setPatientObj(Patient value) {
        this.patientObj = value;
    }

    /**
     * Gets the value of the patientMedications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMedicationRecord }
     *     
     */
    public ArrayOfMedicationRecord getPatientMedications() {
        return patientMedications;
    }

    /**
     * Sets the value of the patientMedications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMedicationRecord }
     *     
     */
    public void setPatientMedications(ArrayOfMedicationRecord value) {
        this.patientMedications = value;
    }

    /**
     * Gets the value of the patientAllergies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllergyRecord }
     *     
     */
    public ArrayOfAllergyRecord getPatientAllergies() {
        return patientAllergies;
    }

    /**
     * Sets the value of the patientAllergies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllergyRecord }
     *     
     */
    public void setPatientAllergies(ArrayOfAllergyRecord value) {
        this.patientAllergies = value;
    }

    /**
     * Gets the value of the patientConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConditionRecord }
     *     
     */
    public ArrayOfConditionRecord getPatientConditions() {
        return patientConditions;
    }

    /**
     * Sets the value of the patientConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConditionRecord }
     *     
     */
    public void setPatientConditions(ArrayOfConditionRecord value) {
        this.patientConditions = value;
    }

    /**
     * Gets the value of the patientCurrentVitals property.
     * 
     * @return
     *     possible object is
     *     {@link VitalRecord }
     *     
     */
    public VitalRecord getPatientCurrentVitals() {
        return patientCurrentVitals;
    }

    /**
     * Sets the value of the patientCurrentVitals property.
     * 
     * @param value
     *     allowed object is
     *     {@link VitalRecord }
     *     
     */
    public void setPatientCurrentVitals(VitalRecord value) {
        this.patientCurrentVitals = value;
    }

    /**
     * Gets the value of the checkPatEligibility property.
     * 
     */
    public boolean isCheckPatEligibility() {
        return checkPatEligibility;
    }

    /**
     * Sets the value of the checkPatEligibility property.
     * 
     */
    public void setCheckPatEligibility(boolean value) {
        this.checkPatEligibility = value;
    }

    /**
     * Gets the value of the eligCheckEncounterDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEligCheckEncounterDate() {
        return eligCheckEncounterDate;
    }

    /**
     * Sets the value of the eligCheckEncounterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligCheckEncounterDate(Calendar value) {
        this.eligCheckEncounterDate = value;
    }

    /**
     * Gets the value of the eligCheckPrescriber property.
     * 
     * @return
     *     possible object is
     *     {@link Prescriber }
     *     
     */
    public Prescriber getEligCheckPrescriber() {
        return eligCheckPrescriber;
    }

    /**
     * Sets the value of the eligCheckPrescriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prescriber }
     *     
     */
    public void setEligCheckPrescriber(Prescriber value) {
        this.eligCheckPrescriber = value;
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
