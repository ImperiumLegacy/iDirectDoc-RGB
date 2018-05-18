
package com.mdtoolboxrx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPharmacy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPharmacy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pharmacy" type="{http://mdtoolboxrx.com/}Pharmacy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPharmacy", propOrder = {
    "pharmacy"
})
public class ArrayOfPharmacy
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Pharmacy", nillable = true)
    protected List<Pharmacy> pharmacy;

    /**
     * Gets the value of the pharmacy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pharmacy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPharmacy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pharmacy }
     * 
     * 
     */
    public List<Pharmacy> getPharmacy() {
        if (pharmacy == null) {
            pharmacy = new ArrayList<Pharmacy>();
        }
        return this.pharmacy;
    }

}
