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
import java.util.ArrayList;
import java.util.List;


/**
 * Defines a connection point on the consumer side
 * <p>
 * <p>
 * <p>Java-Klasse für connectionPointIn complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="connectionPointIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relPosition" type="{http://www.plcopen.org/xml/tc6_0201}position" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="connection" type="{http://www.plcopen.org/xml/tc6_0201}connection" maxOccurs="unbounded"/>
 *           &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectionPointIn", propOrder = {
        "relPosition",
        "connection",
        "expression",
        "addData"
})
@XmlSeeAlso({
        org.plcopen.xml.tc60201.Body.SFC.SelectionConvergence.ConnectionPointIn.class
})
public class ConnectionPointIn {

    protected Position relPosition;
    protected List<Connection> connection;
    protected String expression;
    protected AddData addData;
    @XmlAttribute(name = "globalId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String globalId;

    /**
     * Ruft den Wert der relPosition-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Position }
     */
    public Position getRelPosition() {
        return relPosition;
    }

    /**
     * Legt den Wert der relPosition-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Position }
     */
    public void setRelPosition(Position value) {
        this.relPosition = value;
    }

    /**
     * Gets the value of the connection property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnection().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connection }
     */
    public List<Connection> getConnection() {
        if (connection == null) {
            connection = new ArrayList<Connection>();
        }
        return this.connection;
    }

    /**
     * Ruft den Wert der expression-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Legt den Wert der expression-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExpression(String value) {
        this.expression = value;
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

}
