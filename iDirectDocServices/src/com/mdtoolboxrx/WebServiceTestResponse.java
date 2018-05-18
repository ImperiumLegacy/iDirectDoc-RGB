
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebServiceTestResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "webServiceTestResult"
})
@XmlRootElement(name = "WebServiceTestResponse")
public class WebServiceTestResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "WebServiceTestResult")
    protected String webServiceTestResult;

    /**
     * Gets the value of the webServiceTestResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebServiceTestResult() {
        return webServiceTestResult;
    }

    /**
     * Sets the value of the webServiceTestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebServiceTestResult(String value) {
        this.webServiceTestResult = value;
    }

}
