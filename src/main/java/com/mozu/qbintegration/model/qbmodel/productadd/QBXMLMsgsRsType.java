//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.04 at 02:52:52 PM IST 
//


package com.mozu.qbintegration.model.qbmodel.productadd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QBXMLMsgsRsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QBXMLMsgsRsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemInventoryAddRs" type="{}ItemInventoryAddRsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QBXMLMsgsRsType", propOrder = {
    "itemInventoryAddRs"
})
public class QBXMLMsgsRsType {

    @XmlElement(name = "ItemInventoryAddRs", required = true)
    protected ItemInventoryAddRsType itemInventoryAddRs;

    /**
     * Gets the value of the itemInventoryAddRs property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInventoryAddRsType }
     *     
     */
    public ItemInventoryAddRsType getItemInventoryAddRs() {
        return itemInventoryAddRs;
    }

    /**
     * Sets the value of the itemInventoryAddRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInventoryAddRsType }
     *     
     */
    public void setItemInventoryAddRs(ItemInventoryAddRsType value) {
        this.itemInventoryAddRs = value;
    }

}
