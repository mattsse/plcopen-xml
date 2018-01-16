//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.16 um 05:54:11 PM CEST 
//

package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.w3c.dom.Element;

import de.tum.ais.xml.plcopen.XMLLiterals;

/**
 * Formatted text according to parts of XHTML 1.1
 * 
 * 
 * <p>
 * Java-Klasse für formattedText complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="formattedText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' namespace='http://www.w3.org/1999/xhtml'/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formattedText", propOrder = { "any", "xhtml", "xmls" })
public class FormattedText {

	@XmlAnyElement(lax = true)
	protected Object any;

	@XmlPath("/xhtml/@xmls/text()")
	protected String xmls = XMLLiterals.XMLNS;

	@XmlPath("/xhtml/text()")
	protected String xhtml = "";

	public String getXhtml() {
		return xhtml;
	}

	public void setXhtml(String xhtml) {
		this.xhtml = xhtml;
	}

	/**
	 * Ruft den Wert der any-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Element } {@link Object }
	 * 
	 */
	public Object getAny() {
		return any;
	}

	/**
	 * Legt den Wert der any-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link Element } {@link Object }
	 * 
	 */
	public void setAny(Object value) {
		this.any = value;
	}
}
