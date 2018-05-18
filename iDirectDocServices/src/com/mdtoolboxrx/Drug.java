
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Drug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Drug">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GenericID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RxNorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEAClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Drug", propOrder = {
    "id",
    "genericID",
    "rxNorm",
    "name",
    "deaClass"
})
public class Drug
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "GenericID")
    protected String genericID;
    @XmlElement(name = "RxNorm")
    protected String rxNorm;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "DEAClass")
    protected String deaClass;

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
     * Gets the value of the genericID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericID() {
        return genericID;
    }

    /**
     * Sets the value of the genericID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericID(String value) {
        this.genericID = value;
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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the deaClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEAClass() {
        return deaClass;
    }

    /**
     * Sets the value of the deaClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEAClass(String value) {
        this.deaClass = value;
    }

}
