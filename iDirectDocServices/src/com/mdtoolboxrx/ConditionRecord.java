
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
 * <p>Java class for ConditionRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConditionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ICD9Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConditionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionRecord", propOrder = {
    "conditionName",
    "conditionId",
    "icd9Code",
    "conditionDate"
})
public class ConditionRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConditionName")
    protected String conditionName;
    @XmlElement(name = "ConditionId")
    protected int conditionId;
    @XmlElement(name = "ICD9Code")
    protected String icd9Code;
    @XmlElement(name = "ConditionDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar conditionDate;

    /**
     * Gets the value of the conditionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionName() {
        return conditionName;
    }

    /**
     * Sets the value of the conditionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionName(String value) {
        this.conditionName = value;
    }

    /**
     * Gets the value of the conditionId property.
     * 
     */
    public int getConditionId() {
        return conditionId;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     */
    public void setConditionId(int value) {
        this.conditionId = value;
    }

    /**
     * Gets the value of the icd9Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICD9Code() {
        return icd9Code;
    }

    /**
     * Sets the value of the icd9Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICD9Code(String value) {
        this.icd9Code = value;
    }

    /**
     * Gets the value of the conditionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getConditionDate() {
        return conditionDate;
    }

    /**
     * Sets the value of the conditionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionDate(Calendar value) {
        this.conditionDate = value;
    }

}
