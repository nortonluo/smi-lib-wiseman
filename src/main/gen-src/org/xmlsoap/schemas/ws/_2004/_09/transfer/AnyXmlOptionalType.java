//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-382 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.29 at 01:59:34 PM EDT 
//

package org.xmlsoap.schemas.ws._2004._09.transfer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for AnyXmlOptionalType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnyXmlOptionalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyXmlOptionalType", propOrder = { "any" })
public class AnyXmlOptionalType {

    @XmlAnyElement(lax = true)
    protected Object any;


    /**
     * Gets the value of the any property.
     * 
     * @return possible object is {@link Object } {@link Element }
     * 
     */
    public Object getAny() {
        return any;
    }


    /**
     * Sets the value of the any property.
     * 
     * @param value allowed object is {@link Object } {@link Element }
     * 
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
