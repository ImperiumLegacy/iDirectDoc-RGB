
package com.mdtoolboxrx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAllergyRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAllergyRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllergyRecord" type="{http://mdtoolboxrx.com/}AllergyRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAllergyRecord", propOrder = {
    "allergyRecord"
})
public class ArrayOfAllergyRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AllergyRecord", nillable = true)
    protected List<AllergyRecord> allergyRecord;

    /**
     * Gets the value of the allergyRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allergyRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllergyRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllergyRecord }
     * 
     * 
     */
    public List<AllergyRecord> getAllergyRecord() {
        if (allergyRecord == null) {
            allergyRecord = new ArrayList<AllergyRecord>();
        }
        return this.allergyRecord;
    }

}
