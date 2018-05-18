
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrugAlt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrugAlt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrugId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RxNorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrugAlt", propOrder = {
    "description",
    "drugId",
    "rxNorm"
})
public class DrugAlt
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DrugId")
    protected int drugId;
    @XmlElement(name = "RxNorm")
    protected String rxNorm;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the drugId property.
     * 
     */
    public int getDrugId() {
        return drugId;
    }

    /**
     * Sets the value of the drugId property.
     * 
     */
    public void setDrugId(int value) {
        this.drugId = value;
    }

    /**
     * Gets the value of the rxNorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxNorm() {
        return rxNorm;
    }

    /**
     * Sets the value of the rxNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxNorm(String value) {
        this.rxNorm = value;
    }

}
