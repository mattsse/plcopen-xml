package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java-Klasse für anonymous complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}commonObjects"/>
 *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}fbdObjects"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "commentOrErrorOrConnector"
})
public class FBD implements PlcNode{

    @XmlElements({
            @XmlElement(name = "comment", type = SFC.Comment.class),
            @XmlElement(name = "error", type = SFC.Error.class),
            @XmlElement(name = "connector", type = SFC.Connector.class),
            @XmlElement(name = "continuation", type = SFC.Continuation.class),
            @XmlElement(name = "actionBlock", type = SFC.ActionBlock.class),
            @XmlElement(name = "vendorElement", type = SFC.VendorElement.class),
            @XmlElement(name = "block", type = SFC.Block.class),
            @XmlElement(name = "inVariable", type = SFC.InVariable.class),
            @XmlElement(name = "outVariable", type = SFC.OutVariable.class),
            @XmlElement(name = "inOutVariable", type = SFC.InOutVariable.class),
            @XmlElement(name = "label", type = SFC.Label.class),
            @XmlElement(name = "jump", type = SFC.Jump.class),
            @XmlElement(name = "return", type = SFC.Return.class)
    })
    protected List<Object> commentOrErrorOrConnector;

    /**
     * Gets the value of the commentOrErrorOrConnector property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentOrErrorOrConnector property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentOrErrorOrConnector().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SFC.Comment }
     * {@link SFC.Error }
     * {@link SFC.Connector }
     * {@link SFC.Continuation }
     * {@link SFC.ActionBlock }
     * {@link SFC.VendorElement }
     * {@link SFC.Block }
     * {@link SFC.InVariable }
     * {@link SFC.OutVariable }
     * {@link SFC.InOutVariable }
     * {@link SFC.Label }
     * {@link SFC.Jump }
     * {@link SFC.Return }
     */
    public List<Object> getCommentOrErrorOrConnector() {
        if (commentOrErrorOrConnector == null) {
            commentOrErrorOrConnector = new ArrayList<Object>();
        }
        return this.commentOrErrorOrConnector;
    }

}
