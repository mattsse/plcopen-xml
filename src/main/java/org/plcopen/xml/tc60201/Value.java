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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * A generic value
 * 
 * <p>
 * Java-Klasse für value complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="value"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="simpleValue"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="arrayValue"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                   &lt;element name="value"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value"&gt;
 *                           &lt;attribute name="repetitionValue" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="structValue"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                   &lt;element name="value"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value"&gt;
 *                           &lt;attribute name="member" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "value", propOrder = { "simpleValue", "arrayValue", "structValue" })
@XmlSeeAlso({ Value.ArrayValue.InnerValue.class, Value.StructValue.InnerValue.class })
public class Value {

	protected Value.SimpleValue simpleValue;
	protected Value.ArrayValue arrayValue;
	protected Value.StructValue structValue;

	/**
	 * Ruft den Wert der simpleValue-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Value.SimpleValue }
	 * 
	 */
	public Value.SimpleValue getSimpleValue() {
		return simpleValue;
	}

	/**
	 * Legt den Wert der simpleValue-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link Value.SimpleValue }
	 * 
	 */
	public void setSimpleValue(Value.SimpleValue value) {
		this.simpleValue = value;
	}

	/**
	 * Ruft den Wert der arrayValue-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Value.ArrayValue }
	 * 
	 */
	public Value.ArrayValue getArrayValue() {
		return arrayValue;
	}

	/**
	 * Legt den Wert der arrayValue-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link Value.ArrayValue }
	 * 
	 */
	public void setArrayValue(Value.ArrayValue value) {
		this.arrayValue = value;
	}

	/**
	 * Ruft den Wert der structValue-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Value.StructValue }
	 * 
	 */
	public Value.StructValue getStructValue() {
		return structValue;
	}

	/**
	 * Legt den Wert der structValue-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link Value.StructValue }
	 * 
	 */
	public void setStructValue(Value.StructValue value) {
		this.structValue = value;
	}

	/**
	 * Array value consisting of a list of occurrances - value pairs
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
	 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
	 *         &lt;element name="value"&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value"&gt;
	 *                 &lt;attribute name="repetitionValue" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
	 *               &lt;/extension&gt;
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
	@XmlType(name = "", propOrder = { "value" })
	public static class ArrayValue {

		protected List<Value.ArrayValue.InnerValue> value;

		/**
		 * Gets the value of the value property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the value property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getValue().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link Value.ArrayValue.Value }
		 * 
		 * 
		 */
		public List<Value.ArrayValue.InnerValue> getValue() {
			if (value == null) {
				value = new ArrayList<Value.ArrayValue.InnerValue>();
			}
			return this.value;
		}

		/**
		 * <p>
		 * Java-Klasse für anonymous complex type.
		 * 
		 * <p>
		 * Das folgende Schemafragment gibt den erwarteten Content an, der in
		 * dieser Klasse enthalten ist.
		 * 
		 * <pre>
		 * &lt;complexType&gt;
		 *   &lt;complexContent&gt;
		 *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value"&gt;
		 *       &lt;attribute name="repetitionValue" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
		 *     &lt;/extension&gt;
		 *   &lt;/complexContent&gt;
		 * &lt;/complexType&gt;
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		public static class InnerValue extends Value {

			@XmlAttribute(name = "repetitionValue")
			protected String repetitionValue;

			/**
			 * Ruft den Wert der repetitionValue-Eigenschaft ab.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRepetitionValue() {
				if (repetitionValue == null) {
					return "1";
				} else {
					return repetitionValue;
				}
			}

			/**
			 * Legt den Wert der repetitionValue-Eigenschaft fest.
			 * 
			 * @param value
			 * allowed object is {@link String }
			 * 
			 */
			public void setRepetitionValue(String value) {
				this.repetitionValue = value;
			}

		}

	}

	/**
	 * Value that can be represented as a single token string
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
	 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class SimpleValue {

		@XmlAttribute(name = "value")
		protected String value;

		/**
		 * Ruft den Wert der value-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Legt den Wert der value-Eigenschaft fest.
		 * 
		 * @param value
		 * allowed object is {@link String }
		 * 
		 */
		public void setValue(String value) {
			this.value = value;
		}

	}

	/**
	 * Struct value consisting of a list of member - value pairs
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
	 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
	 *         &lt;element name="value"&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value"&gt;
	 *                 &lt;attribute name="member" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
	 *               &lt;/extension&gt;
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
	@XmlType(name = "", propOrder = { "value" })
	public static class StructValue {

		protected List<Value.StructValue.InnerValue> value;

		/**
		 * Gets the value of the value property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the value property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getValue().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link Value.StructValue.Value }
		 * 
		 * 
		 */
		public List<Value.StructValue.InnerValue> getValue() {
			if (value == null) {
				value = new ArrayList<Value.StructValue.InnerValue>();
			}
			return this.value;
		}

		/**
		 * <p>
		 * Java-Klasse für anonymous complex type.
		 * 
		 * <p>
		 * Das folgende Schemafragment gibt den erwarteten Content an, der in
		 * dieser Klasse enthalten ist.
		 * 
		 * <pre>
		 * &lt;complexType&gt;
		 *   &lt;complexContent&gt;
		 *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value"&gt;
		 *       &lt;attribute name="member" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
		 *     &lt;/extension&gt;
		 *   &lt;/complexContent&gt;
		 * &lt;/complexType&gt;
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		public static class InnerValue extends Value {

			@XmlAttribute(name = "member", required = true)
			protected String member;

			/**
			 * Ruft den Wert der member-Eigenschaft ab.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getMember() {
				return member;
			}

			/**
			 * Legt den Wert der member-Eigenschaft fest.
			 * 
			 * @param value
			 * allowed object is {@link String }
			 * 
			 */
			public void setMember(String value) {
				this.member = value;
			}

		}

	}

	@Override
	public String toString() {
		return "Value{" +
				"simpleValue=" + simpleValue +
				", arrayValue=" + arrayValue +
				", structValue=" + structValue +
				'}';
	}
}
