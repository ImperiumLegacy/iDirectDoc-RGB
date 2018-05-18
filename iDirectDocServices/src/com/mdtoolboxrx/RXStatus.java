
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RXStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RXStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Ordered"/>
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="Historical"/>
 *     &lt;enumeration value="Discontinued"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RXStatus")
@XmlEnum
public enum RXStatus {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Ordered")
    ORDERED("Ordered"),
    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Historical")
    HISTORICAL("Historical"),
    @XmlEnumValue("Discontinued")
    DISCONTINUED("Discontinued"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    RXStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RXStatus fromValue(String v) {
        for (RXStatus c: RXStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
