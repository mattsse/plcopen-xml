//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11-b140731.1112 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.17 um 05:44:19 PM CET 
//


package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;


/**
 * List of variable declarations that share the same
 * memory attributes (CONSTANT, RETAIN, NON_RETAIN, PERSISTENT)
 * <p>
 * <p>
 * <p>Java-Klasse für varList complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="varList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varListPlain">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="constant" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="retain" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nonretain" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="persistent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nonpersistent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "varList")
@XmlSeeAlso({
        org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.LocalVars.class,
        org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.TempVars.class,
        org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.InputVars.class,
        org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.OutputVars.class,
        org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.InOutVars.class,
        org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.ExternalVars.class,
        org.plcopen.xml.tc60201.Project.Types.Pous.Pou.Interface.GlobalVars.class
})
public class VarList
        extends VarListPlain {

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
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der constant-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
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
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setConstant(Boolean value) {
        this.constant = value;
    }

    /**
     * Ruft den Wert der retain-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
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
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRetain(Boolean value) {
        this.retain = value;
    }

    /**
     * Ruft den Wert der nonretain-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
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
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setNonretain(Boolean value) {
        this.nonretain = value;
    }

    /**
     * Ruft den Wert der persistent-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
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
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPersistent(Boolean value) {
        this.persistent = value;
    }

    /**
     * Ruft den Wert der nonpersistent-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
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
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setNonpersistent(Boolean value) {
        this.nonpersistent = value;
    }

}
