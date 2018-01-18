//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11-b140731.1112 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.17 um 05:44:19 PM CET 
//


package org.plcopen.xml.tc60201;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Formatted text according to parts of XHTML 1.1
 * <p>
 * <p>
 * <p>Java-Klasse für formattedText complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="formattedText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' namespace='http://www.w3.org/1999/xhtml'/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formattedText", propOrder = {
        "any"
})
public class FormattedText implements org.plcopen.xml.tc60201.PlcNode{

    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Ruft den Wert der any-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Element }
     * {@link Object }
     */
    public Object getAny() {
        return any;
    }

    /**
     * Legt den Wert der any-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Element }
     *              {@link Object }
     */
    public void setAny(Object value) {
        this.any = value;
    }

    @Override
    public String toString() {
        return "FormattedText{" +
                "any=" + any +
                '}';
    }
}
