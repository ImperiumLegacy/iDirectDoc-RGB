
package com.mdtoolboxrx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPharmacyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPharmacyDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PharmacyDetail" type="{http://mdtoolboxrx.com/}PharmacyDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPharmacyDetail", propOrder = {
    "pharmacyDetail"
})
public class ArrayOfPharmacyDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PharmacyDetail", nillable = true)
    protected List<PharmacyDetail> pharmacyDetail;

    /**
     * Gets the value of the pharmacyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pharmacyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPharmacyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PharmacyDetail }
     * 
     * 
     */
    public List<PharmacyDetail> getPharmacyDetail() {
        if (pharmacyDetail == null) {
            pharmacyDetail = new ArrayList<PharmacyDetail>();
        }
        return this.pharmacyDetail;
    }

}
