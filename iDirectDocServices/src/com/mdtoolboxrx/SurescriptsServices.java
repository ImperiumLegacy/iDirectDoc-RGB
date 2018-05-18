
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurescriptsServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurescriptsServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewRx" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RefillReq" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EPCS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Fill" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ePA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurescriptsServices", propOrder = {
    "newRx",
    "refillReq",
    "epcs",
    "cancel",
    "fill",
    "epa"
})
public class SurescriptsServices
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NewRx")
    protected boolean newRx;
    @XmlElement(name = "RefillReq")
    protected boolean refillReq;
    @XmlElement(name = "EPCS")
    protected boolean epcs;
    @XmlElement(name = "Cancel")
    protected boolean cancel;
    @XmlElement(name = "Fill")
    protected boolean fill;
    @XmlElement(name = "ePA")
    protected boolean epa;

    /**
     * Gets the value of the newRx property.
     * 
     */
    public boolean isNewRx() {
        return newRx;
    }

    /**
     * Sets the value of the newRx property.
     * 
     */
    public void setNewRx(boolean value) {
        this.newRx = value;
    }

    /**
     * Gets the value of the refillReq property.
     * 
     */
    public boolean isRefillReq() {
        return refillReq;
    }

    /**
     * Sets the value of the refillReq property.
     * 
     */
    public void setRefillReq(boolean value) {
        this.refillReq = value;
    }

    /**
     * Gets the value of the epcs property.
     * 
     */
    public boolean isEPCS() {
        return epcs;
    }

    /**
     * Sets the value of the epcs property.
     * 
     */
    public void setEPCS(boolean value) {
        this.epcs = value;
    }

    /**
     * Gets the value of the cancel property.
     * 
     */
    public boolean isCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     */
    public void setCancel(boolean value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the fill property.
     * 
     */
    public boolean isFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     */
    public void setFill(boolean value) {
        this.fill = value;
    }

    /**
     * Gets the value of the epa property.
     * 
     */
    public boolean isEPA() {
        return epa;
    }

    /**
     * Sets the value of the epa property.
     * 
     */
    public void setEPA(boolean value) {
        this.epa = value;
    }

}
