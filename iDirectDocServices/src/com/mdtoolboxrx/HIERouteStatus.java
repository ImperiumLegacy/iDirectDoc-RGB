
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIERouteStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HIERouteStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotRouted"/>
 *     &lt;enumeration value="Sent"/>
 *     &lt;enumeration value="SentVerified"/>
 *     &lt;enumeration value="Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HIERouteStatus")
@XmlEnum
public enum HIERouteStatus {

    @XmlEnumValue("NotRouted")
    NOT_ROUTED("NotRouted"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("SentVerified")
    SENT_VERIFIED("SentVerified"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    HIERouteStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HIERouteStatus fromValue(String v) {
        for (HIERouteStatus c: HIERouteStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
