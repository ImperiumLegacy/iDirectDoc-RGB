
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllergyRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllergyRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllergyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllergyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SeverityLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Reaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllergyRecord", propOrder = {
    "allergyName",
    "allergyId",
    "severityLevel",
    "reaction"
})
public class AllergyRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AllergyName")
    protected String allergyName;
    @XmlElement(name = "AllergyId")
    protected int allergyId;
    @XmlElement(name = "SeverityLevel")
    protected int severityLevel;
    @XmlElement(name = "Reaction")
    protected String reaction;

    /**
     * Gets the value of the allergyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllergyName() {
        return allergyName;
    }

    /**
     * Sets the value of the allergyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergyName(String value) {
        this.allergyName = value;
    }

    /**
     * Gets the value of the allergyId property.
     * 
     */
    public int getAllergyId() {
        return allergyId;
    }

    /**
     * Sets the value of the allergyId property.
     * 
     */
    public void setAllergyId(int value) {
        this.allergyId = value;
    }

    /**
     * Gets the value of the severityLevel property.
     * 
     */
    public int getSeverityLevel() {
        return severityLevel;
    }

    /**
     * Sets the value of the severityLevel property.
     * 
     */
    public void setSeverityLevel(int value) {
        this.severityLevel = value;
    }

    /**
     * Gets the value of the reaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReaction() {
        return reaction;
    }

    /**
     * Sets the value of the reaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReaction(String value) {
        this.reaction = value;
    }

}
