//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.04 at 02:45:08 PM IST 
//


package com.mozu.qbintegration.model.qbmodel.qborderquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QBXMLMsgsRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QBXMLMsgsRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderQueryRq" type="{}SalesOrderQueryRqType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="onError" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QBXMLMsgsRqType", propOrder = {
    "salesOrderQueryRq"
})
public class QBXMLMsgsRqType {

    @XmlElement(name = "SalesOrderQueryRq", required = true)
    protected SalesOrderQueryRqType salesOrderQueryRq;
    @XmlAttribute(name = "onError")
    protected String onError;

    /**
     * Gets the value of the salesOrderQueryRq property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderQueryRqType }
     *     
     */
    public SalesOrderQueryRqType getSalesOrderQueryRq() {
        return salesOrderQueryRq;
    }

    /**
     * Sets the value of the salesOrderQueryRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderQueryRqType }
     *     
     */
    public void setSalesOrderQueryRq(SalesOrderQueryRqType value) {
        this.salesOrderQueryRq = value;
    }

    /**
     * Gets the value of the onError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnError() {
        return onError;
    }

    /**
     * Sets the value of the onError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnError(String value) {
        this.onError = value;
    }

}
