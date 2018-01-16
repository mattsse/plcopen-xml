//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.16 um 05:54:11 PM CEST 
//

package org.plcopen.xml.tc60201;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * List of variable declarations without attributes
 * 
 * 
 * <p>
 * Java-Klasse für varListPlain complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="varListPlain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="variable" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="type" type="{http://www.plcopen.org/xml/tc6_0201}dataType"/&gt;
 *                   &lt;element name="initialValue" type="{http://www.plcopen.org/xml/tc6_0201}value" minOccurs="0"/&gt;
 *                   &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/&gt;
 *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/&gt;
 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "varListPlain", propOrder = { "variable", "addData", "documentation" })
@XmlSeeAlso({ VarList.class })
public class VarListPlain implements AddDataable {

	protected List<VarListPlain.Variable> variable;
	protected AddData addData;
	protected FormattedText documentation;

	/**
	 * Gets the value of the variable property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the variable property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getVariable().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link VarListPlain.Variable }
	 * 
	 * 
	 */
	public List<VarListPlain.Variable> getVariable() {
		if (variable == null) {
			variable = new ArrayList<VarListPlain.Variable>();
		}
		return this.variable;
	}

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
	 * Declaration of a variable
	 * 
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
	 *         &lt;element name="type" type="{http://www.plcopen.org/xml/tc6_0201}dataType"/&gt;
	 *         &lt;element name="initialValue" type="{http://www.plcopen.org/xml/tc6_0201}value" minOccurs="0"/&gt;
	 *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/&gt;
	 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/&gt;
	 *       &lt;/sequence&gt;
	 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
	 *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
	 *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "type", "initialValue", "addData", "documentation" })
	public static class Variable implements AddDataable {

		@XmlElement(required = true)
		protected DataType type;
		protected Value initialValue;
		protected AddData addData;
		protected FormattedText documentation;
		@XmlAttribute(name = "name", required = true)
		protected String name;
		@XmlAttribute(name = "address")
		protected String address;
		@XmlAttribute(name = "globalId")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String globalId;

		/**
		 * Ruft den Wert der type-Eigenschaft ab.
		 * 
		 * @return possible object is {@link DataType }
		 * 
		 */
		public DataType getType() {
			return type;
		}

		/**
		 * Legt den Wert der type-Eigenschaft fest.
		 * 
		 * @param value
		 * allowed object is {@link DataType }
		 * 
		 */
		public void setType(DataType value) {
			this.type = value;
		}

		/**
		 * Ruft den Wert der initialValue-Eigenschaft ab.
		 * 
		 * @return possible object is {@link Value }
		 * 
		 */
		public Value getInitialValue() {
			return initialValue;
		}

		/**
		 * Legt den Wert der initialValue-Eigenschaft fest.
		 * 
		 * @param value
		 * allowed object is {@link Value }
		 * 
		 */
		public void setInitialValue(Value value) {
			this.initialValue = value;
		}

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
		 * Ruft den Wert der address-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAddress() {
			return address;
		}

		/**
		 * Legt den Wert der address-Eigenschaft fest.
		 * 
		 * @param value
		 * allowed object is {@link String }
		 * 
		 */
		public void setAddress(String value) {
			this.address = value;
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

	@Override
	public String toString() {
		return "VarListPlain{" +
				"variable=" + variable +
				", addData=" + addData +
				", documentation=" + documentation +
				'}';
	}
}
