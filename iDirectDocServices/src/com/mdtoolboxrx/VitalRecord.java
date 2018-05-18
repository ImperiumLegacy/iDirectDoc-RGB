
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
 * <p>Java class for VitalRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VitalRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VitalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="BMI" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="BPSys" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BPDia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Temp" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Pulse" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VitalRecord", propOrder = {
    "vitalDate",
    "weight",
    "height",
    "bmi",
    "bpSys",
    "bpDia",
    "temp",
    "pulse",
    "notes"
})
public class VitalRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VitalDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar vitalDate;
    @XmlElement(name = "Weight")
    protected float weight;
    @XmlElement(name = "Height")
    protected float height;
    @XmlElement(name = "BMI")
    protected float bmi;
    @XmlElement(name = "BPSys")
    protected int bpSys;
    @XmlElement(name = "BPDia")
    protected int bpDia;
    @XmlElement(name = "Temp")
    protected float temp;
    @XmlElement(name = "Pulse")
    protected float pulse;
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     * Gets the value of the vitalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getVitalDate() {
        return vitalDate;
    }

    /**
     * Sets the value of the vitalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVitalDate(Calendar value) {
        this.vitalDate = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(float value) {
        this.height = value;
    }

    /**
     * Gets the value of the bmi property.
     * 
     */
    public float getBMI() {
        return bmi;
    }

    /**
     * Sets the value of the bmi property.
     * 
     */
    public void setBMI(float value) {
        this.bmi = value;
    }

    /**
     * Gets the value of the bpSys property.
     * 
     */
    public int getBPSys() {
        return bpSys;
    }

    /**
     * Sets the value of the bpSys property.
     * 
     */
    public void setBPSys(int value) {
        this.bpSys = value;
    }

    /**
     * Gets the value of the bpDia property.
     * 
     */
    public int getBPDia() {
        return bpDia;
    }

    /**
     * Sets the value of the bpDia property.
     * 
     */
    public void setBPDia(int value) {
        this.bpDia = value;
    }

    /**
     * Gets the value of the temp property.
     * 
     */
    public float getTemp() {
        return temp;
    }

    /**
     * Sets the value of the temp property.
     * 
     */
    public void setTemp(float value) {
        this.temp = value;
    }

    /**
     * Gets the value of the pulse property.
     * 
     */
    public float getPulse() {
        return pulse;
    }

    /**
     * Sets the value of the pulse property.
     * 
     */
    public void setPulse(float value) {
        this.pulse = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
