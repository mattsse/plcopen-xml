//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11-b140731.1112 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.17 um 05:44:19 PM CET 
//


package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * Describes a connection between the consumer
 * element (eg. input variable of a function block) and the producer
 * element (eg. output variable of a function block). It may contain a
 * list of positions that describes the path of the connection.
 * <p>
 * <p>
 * <p>Java-Klasse für connection complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="connection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="refLocalId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="formalParameter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connection", propOrder = {
        "position",
        "addData"
})
public class Connection {

    protected List<Position> position;
    protected AddData addData;
    @XmlAttribute(name = "globalId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String globalId;
    @XmlAttribute(name = "refLocalId", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger refLocalId;
    @XmlAttribute(name = "formalParameter")
    protected String formalParameter;

    /**
     * Gets the value of the position property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     */
    public List<Position> getPosition() {
        if (position == null) {
            position = new ArrayList<Position>();
        }
        return this.position;
    }

    /**
     * Ruft den Wert der addData-Eigenschaft ab.
     *
     * @return possible object is
     * {@link AddData }
     */
    public AddData getAddData() {
        return addData;
    }

    /**
     * Legt den Wert der addData-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link AddData }
     */
    public void setAddData(AddData value) {
        this.addData = value;
    }

    /**
     * Ruft den Wert der globalId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGlobalId() {
        return globalId;
    }

    /**
     * Legt den Wert der globalId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGlobalId(String value) {
        this.globalId = value;
    }

    /**
     * Ruft den Wert der refLocalId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getRefLocalId() {
        return refLocalId;
    }

    /**
     * Legt den Wert der refLocalId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setRefLocalId(BigInteger value) {
        this.refLocalId = value;
    }

    /**
     * Ruft den Wert der formalParameter-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFormalParameter() {
        return formalParameter;
    }

    /**
     * Legt den Wert der formalParameter-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFormalParameter(String value) {
        this.formalParameter = value;
    }

}
