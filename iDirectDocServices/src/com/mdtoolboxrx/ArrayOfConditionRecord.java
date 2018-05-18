
package com.mdtoolboxrx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConditionRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConditionRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionRecord" type="{http://mdtoolboxrx.com/}ConditionRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConditionRecord", propOrder = {
    "conditionRecord"
})
public class ArrayOfConditionRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConditionRecord", nillable = true)
    protected List<ConditionRecord> conditionRecord;

    /**
     * Gets the value of the conditionRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionRecord }
     * 
     * 
     */
    public List<ConditionRecord> getConditionRecord() {
        if (conditionRecord == null) {
            conditionRecord = new ArrayList<ConditionRecord>();
        }
        return this.conditionRecord;
    }

}
