package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Java-Klasse für anonymous complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="companyName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="companyURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="productName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productRelease" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creationDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="contentDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class FileHeader implements PlcNode {

    @XmlAttribute(name = "companyName", required = true)
    protected String companyName;
    @XmlAttribute(name = "companyURL")
    @XmlSchemaType(name = "anyURI")
    protected String companyURL;
    @XmlAttribute(name = "productName", required = true)
    protected String productName;
    @XmlAttribute(name = "productVersion", required = true)
    protected String productVersion;
    @XmlAttribute(name = "productRelease")
    protected String productRelease;
    @XmlAttribute(name = "creationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlAttribute(name = "contentDescription")
    protected String contentDescription;

    /**
     * Ruft den Wert der companyName-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Legt den Wert der companyName-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Ruft den Wert der companyURL-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCompanyURL() {
        return companyURL;
    }

    /**
     * Legt den Wert der companyURL-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCompanyURL(String value) {
        this.companyURL = value;
    }

    /**
     * Ruft den Wert der productName-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Legt den Wert der productName-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Ruft den Wert der productVersion-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProductVersion() {
        return productVersion;
    }

    /**
     * Legt den Wert der productVersion-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProductVersion(String value) {
        this.productVersion = value;
    }

    /**
     * Ruft den Wert der productRelease-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProductRelease() {
        return productRelease;
    }

    /**
     * Legt den Wert der productRelease-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProductRelease(String value) {
        this.productRelease = value;
    }

    /**
     * Ruft den Wert der creationDateTime-Eigenschaft ab.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Legt den Wert der creationDateTime-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Ruft den Wert der contentDescription-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContentDescription() {
        return contentDescription;
    }

    /**
     * Legt den Wert der contentDescription-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContentDescription(String value) {
        this.contentDescription = value;
    }

}
