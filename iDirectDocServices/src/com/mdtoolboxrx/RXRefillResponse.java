
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RXRefillResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RXRefillResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotAnswered"/>
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Denied"/>
 *     &lt;enumeration value="DeniedNewRxToFollow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RXRefillResponse")
@XmlEnum
public enum RXRefillResponse {

    @XmlEnumValue("NotAnswered")
    NOT_ANSWERED("NotAnswered"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Denied")
    DENIED("Denied"),
    @XmlEnumValue("DeniedNewRxToFollow")
    DENIED_NEW_RX_TO_FOLLOW("DeniedNewRxToFollow");
    private final String value;

    RXRefillResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RXRefillResponse fromValue(String v) {
        for (RXRefillResponse c: RXRefillResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
