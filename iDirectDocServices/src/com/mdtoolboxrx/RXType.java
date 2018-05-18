
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RXType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RXType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RX"/>
 *     &lt;enumeration value="OTC"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RXType")
@XmlEnum
public enum RXType {

    RX("RX"),
    OTC("OTC"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    RXType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RXType fromValue(String v) {
        for (RXType c: RXType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
