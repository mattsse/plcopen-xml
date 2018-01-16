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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * List of variable declarations that share the same memory attributes
 * (CONSTANT, RETAIN, NON_RETAIN, PERSISTENT)
 * 
 * 
 * <p>
 * Java-Klasse für varList complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="varList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varListPlain"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="constant" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="retain" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="nonretain" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="persistent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="nonpersistent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "varList")
@XmlSeeAlso({ org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.LocalVars.class,
		org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.TempVars.class,
		org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.InputVars.class,
		org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.OutputVars.class,
		org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.InOutVars.class,
		org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.ExternalVars.class,
		org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.GlobalVars.class })
public class VarList extends VarListPlain {

	@XmlAttribute(name = "name")
	protected String name;
	@XmlAttribute(name = "constant")
	protected Boolean constant;
	@XmlAttribute(name = "retain")
	protected Boolean retain;
	@XmlAttribute(name = "nonretain")
	protected Boolean nonretain;
	@XmlAttribute(name = "persistent")
	protected Boolean persistent;
	@XmlAttribute(name = "nonpersistent")
	protected Boolean nonpersistent;

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
	 * Ruft den Wert der constant-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isConstant() {
		if (constant == null) {
			return false;
		} else {
			return constant;
		}
	}

	/**
	 * Legt den Wert der constant-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link Boolean }
	 * 
	 */
	public void setConstant(Boolean value) {
		this.constant = value;
	}

	/**
	 * Ruft den Wert der retain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isRetain() {
		if (retain == null) {
			return false;
		} else {
			return retain;
		}
	}

	/**
	 * Legt den Wert der retain-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link Boolean }
	 * 
	 */
	public void setRetain(Boolean value) {
		this.retain = value;
	}

	/**
	 * Ruft den Wert der nonretain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isNonretain() {
		if (nonretain == null) {
			return false;
		} else {
			return nonretain;
		}
	}

	/**
	 * Legt den Wert der nonretain-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link Boolean }
	 * 
	 */
	public void setNonretain(Boolean value) {
		this.nonretain = value;
	}

	/**
	 * Ruft den Wert der persistent-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isPersistent() {
		if (persistent == null) {
			return false;
		} else {
			return persistent;
		}
	}

	/**
	 * Legt den Wert der persistent-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link Boolean }
	 * 
	 */
	public void setPersistent(Boolean value) {
		this.persistent = value;
	}

	/**
	 * Ruft den Wert der nonpersistent-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isNonpersistent() {
		if (nonpersistent == null) {
			return false;
		} else {
			return nonpersistent;
		}
	}

	/**
	 * Legt den Wert der nonpersistent-Eigenschaft fest.
	 * 
	 * @param value
	 * allowed object is {@link Boolean }
	 * 
	 */
	public void setNonpersistent(Boolean value) {
		this.nonpersistent = value;
	}

}
