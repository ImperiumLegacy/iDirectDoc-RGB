
package com.mdtoolboxrx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHIEMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHIEMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HIEMessage" type="{http://mdtoolboxrx.com/}HIEMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHIEMessage", propOrder = {
    "hieMessage"
})
public class ArrayOfHIEMessage
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "HIEMessage", nillable = true)
    protected List<HIEMessage> hieMessage;

    /**
     * Gets the value of the hieMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hieMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHIEMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HIEMessage }
     * 
     * 
     */
    public List<HIEMessage> getHIEMessage() {
        if (hieMessage == null) {
            hieMessage = new ArrayList<HIEMessage>();
        }
        return this.hieMessage;
    }

}
