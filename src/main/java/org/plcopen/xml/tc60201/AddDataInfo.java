//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.16 um 05:54:11 PM CEST 
//

package org.plcopen.xml.tc60201;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * List of additional data elements used in the document with description
 * 
 * <p>
 * Java-Klasse für addDataInfo complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="addDataInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="info" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="description" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="vendor" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDataInfo", propOrder = { "info" })
public class AddDataInfo {

	protected List<AddDataInfo.Info> info;

	/**
	 * Gets the value of the info property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the info property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AddDataInfo.Info }
	 * 
	 * 
	 */
	public List<AddDataInfo.Info> getInfo() {
		if (info == null) {
			info = new ArrayList<AddDataInfo.Info>();
		}
		return this.info;
	}

	/**
	 * <p>
	 * Java-Klasse für anonymous complex type.
	 * 
	 * <p>
	 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
	 * Klasse enthalten ist.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;sequence&gt;
	 *         &lt;element name="description" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/&gt;
	 *       &lt;/sequence&gt;
	 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
	 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
	 *       &lt;attribute name="vendor" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "description" })
	public static class Info {

		protected FormattedText description;
		@XmlAttribute(name = "name", required = true)
		@XmlSchemaType(name = "anyURI")
		protected String name;
		@XmlAttribute(name = "version")
		protected BigDecimal version;
		@XmlAttribute(name = "vendor", required = true)
		@XmlSchemaType(name = "anyURI")
		protected String vendor;

		/**
		 * Ruft den Wert der description-Eigenschaft ab.
		 * 
		 * @return possible object is {@link FormattedText }
		 * 
		 */
		public FormattedText getDescription() {
			return description;
		}

		/**
		 * Legt den Wert der description-Eigenschaft fest.
		 * 
		 * @param value
		 * allowed object is {@link FormattedText }
		 * 
		 */
		public void setDescription(FormattedText value) {
			this.description = value;
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
		 * Ruft den Wert der version-Eigenschaft ab.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getVersion() {
			return version;
		}

		/**
		 * Legt den Wert der version-Eigenschaft fest.
		 * 
		 * @param value
		 * allowed object is {@link BigDecimal }
		 * 
		 */
		public void setVersion(BigDecimal value) {
			this.version = value;
		}

		/**
		 * Ruft den Wert der vendor-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVendor() {
			return vendor;
		}

		/**
		 * Legt den Wert der vendor-Eigenschaft fest.
		 * 
		 * @param value
		 * allowed object is {@link String }
		 * 
		 */
		public void setVendor(String value) {
			this.vendor = value;
		}

	}

}
