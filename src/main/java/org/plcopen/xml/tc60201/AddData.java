//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11-b140731.1112 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.17 um 05:44:19 PM CET 
//


package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
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
public class AddData implements org.plcopen.xml.tc60201.PlcNode {

    protected List<Data> data;

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
     * {@link Data }
     */
    public List<Data> getData() {
        if (data == null) {
            data = new ArrayList<Data>();
        }
        return this.data;
    }

    /**
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> List<T> getContents(Class<T> clazz) {
        return getData().stream()
                        .filter(p -> p.getAny() != null && clazz.isInstance(p.getAny()))
                        .map(m -> clazz.cast(m.getAny()))
                        .collect(Collectors.toList());
    }


    /**
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> List<T> getAllContents(Class<T> clazz) {
        List<T> result = new ArrayList<>();

        for (Data data : getData()) {
            Object any = data.getAny();
            if (clazz.isInstance(any)) {
                result.add(clazz.cast(any));
                continue;
            }
            if (any instanceof AddDataContainer) {
                AddData childAddData = ((AddDataContainer) any).getAddData();
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

}
