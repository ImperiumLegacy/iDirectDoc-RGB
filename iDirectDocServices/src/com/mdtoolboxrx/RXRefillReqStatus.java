
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RXRefillReqStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RXRefillReqStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NewNotRespondedTo"/>
 *     &lt;enumeration value="SentResponse"/>
 *     &lt;enumeration value="SentResponseVerified"/>
 *     &lt;enumeration value="SentResponseError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RXRefillReqStatus")
@XmlEnum
public enum RXRefillReqStatus {

    @XmlEnumValue("NewNotRespondedTo")
    NEW_NOT_RESPONDED_TO("NewNotRespondedTo"),
    @XmlEnumValue("SentResponse")
    SENT_RESPONSE("SentResponse"),
    @XmlEnumValue("SentResponseVerified")
    SENT_RESPONSE_VERIFIED("SentResponseVerified"),
    @XmlEnumValue("SentResponseError")
    SENT_RESPONSE_ERROR("SentResponseError");
    private final String value;

    RXRefillReqStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RXRefillReqStatus fromValue(String v) {
        for (RXRefillReqStatus c: RXRefillReqStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
