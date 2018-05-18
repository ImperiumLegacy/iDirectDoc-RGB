
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RXChangeResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RXChangeResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotAnswered"/>
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="ApprovedWithChanges"/>
 *     &lt;enumeration value="DeniedKeep"/>
 *     &lt;enumeration value="DeniedCancel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RXChangeResponse")
@XmlEnum
public enum RXChangeResponse {

    @XmlEnumValue("NotAnswered")
    NOT_ANSWERED("NotAnswered"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("ApprovedWithChanges")
    APPROVED_WITH_CHANGES("ApprovedWithChanges"),
    @XmlEnumValue("DeniedKeep")
    DENIED_KEEP("DeniedKeep"),
    @XmlEnumValue("DeniedCancel")
    DENIED_CANCEL("DeniedCancel");
    private final String value;

    RXChangeResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RXChangeResponse fromValue(String v) {
        for (RXChangeResponse c: RXChangeResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
