
package com.mdtoolboxrx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPrescriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrescriber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prescriber" type="{http://mdtoolboxrx.com/}Prescriber" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrescriber", propOrder = {
    "prescriber"
})
public class ArrayOfPrescriber
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Prescriber", nillable = true)
    protected List<Prescriber> prescriber;

    /**
     * Gets the value of the prescriber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prescriber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrescriber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prescriber }
     * 
     * 
     */
    public List<Prescriber> getPrescriber() {
        if (prescriber == null) {
            prescriber = new ArrayList<Prescriber>();
        }
        return this.prescriber;
    }

}
