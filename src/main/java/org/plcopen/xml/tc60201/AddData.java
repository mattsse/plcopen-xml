//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11-b140731.1112 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.17 um 05:44:19 PM CET 
//


package org.plcopen.xml.tc60201;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Application specific data defined in external
 * schemata
 * <p>
 * <p>Java-Klasse für addData complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="addData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax'/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="handleUnknown" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="preserve"/>
 *                       &lt;enumeration value="discard"/>
 *                       &lt;enumeration value="implementation"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addData", propOrder = {
        "data"
})
public class AddData {

    protected List<AddData.Data> data;

    /**
     * Gets the value of the data property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddData.Data }
     */
    public List<AddData.Data> getData() {
        if (data == null) {
            data = new ArrayList<AddData.Data>();
        }
        return this.data;
    }

    /**
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> List<T> getChildren(Class<T> clazz) {
        return getData().stream()
                        .filter(p -> clazz.isInstance(p))
                        .map(m -> clazz.cast(m))
                        .collect(Collectors.toList());
    }


    /**
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> List<T> getAllChildren(Class<T> clazz) {
        List<T> result = new ArrayList<>();

        for (Data data : getData()) {
            if (clazz.isInstance(data)) {
                result.add(clazz.cast(data));
                continue;
            }
            if (data instanceof AddDataContainer) {
                AddData childAddData = ((AddDataContainer) data).getAddData();
                if (childAddData != null) {
                    result.addAll(childAddData.getAllChildren(clazz));
                }
            }
        }
        return result;
    }


    @Override
    public String toString() {
        return "AddData{" +
                "data=" + data +
                '}';
    }

    /**
     * <p>Java-Klasse für anonymous complex type.
     * <p>
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='lax'/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="handleUnknown" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="preserve"/>
     *             &lt;enumeration value="discard"/>
     *             &lt;enumeration value="implementation"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "any"
    })
    public static class Data {

        @XmlAnyElement(lax = true)
        protected Object any;
        @XmlAttribute(name = "name", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String name;
        @XmlAttribute(name = "handleUnknown", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String handleUnknown;

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
         * Ruft den Wert der handleUnknown-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getHandleUnknown() {
            return handleUnknown;
        }

        /**
         * Legt den Wert der handleUnknown-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setHandleUnknown(String value) {
            this.handleUnknown = value;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "any=" + any +
                    ", name='" + name + '\'' +
                    ", handleUnknown='" + handleUnknown + '\'' +
                    '}';
        }
    }
}
