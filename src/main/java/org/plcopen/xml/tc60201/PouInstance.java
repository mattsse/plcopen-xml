//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.16 um 05:54:11 PM CEST 
//

package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Represents a program or function block instance either running with or
 * without a task
 * 
 * <p>
 * Java-Klasse für pouInstance complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="pouInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/&gt;
 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="typeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pouInstance", propOrder = { "addData", "documentation" })
public class PouInstance implements AddDataable {

	protected AddData addData;
	protected FormattedText documentation;
	@XmlAttribute(name = "name", required = true)
	protected String name;
	@XmlAttribute(name = "typeName", required = true)
	protected String typeName;
	@XmlAttribute(name = "globalId")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String globalId;

	/**
	 * Ruft den Wert der addData-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AddData }
	 * 
	 */
	public AddData getAddData() {
		return addData;
	}

	/**
	 * Legt den Wert der addData-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link AddData }
	 * 
	 */
	public void setAddData(AddData value) {
		this.addData = value;
	}

	/**
	 * Ruft den Wert der documentation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FormattedText }
	 * 
	 */
	public FormattedText getDocumentation() {
		return documentation;
	}

	/**
	 * Legt den Wert der documentation-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link FormattedText }
	 * 
	 */
	public void setDocumentation(FormattedText value) {
		this.documentation = value;
	}

	/**
	 * Ruft den Wert der name-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Legt den Wert der name-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Ruft den Wert der typeName-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * Legt den Wert der typeName-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link String }
	 * 
	 */
	public void setTypeName(String value) {
		this.typeName = value;
	}

	/**
	 * Ruft den Wert der globalId-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGlobalId() {
		return globalId;
	}

	/**
	 * Legt den Wert der globalId-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link String }
	 * 
	 */
	public void setGlobalId(String value) {
		this.globalId = value;
	}

}
