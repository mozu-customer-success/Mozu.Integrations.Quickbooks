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
 * <p>Java class for BarCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BarCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BarCodeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AssignEvenIfUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AllowOverride" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarCodeType", propOrder = {
    "barCodeValue",
    "assignEvenIfUsed",
    "allowOverride"
})
public class BarCodeType {

    @XmlElement(name = "BarCodeValue", required = true)
    protected String barCodeValue;
    @XmlElement(name = "AssignEvenIfUsed", required = true)
    protected String assignEvenIfUsed;
    @XmlElement(name = "AllowOverride", required = true)
    protected String allowOverride;

    /**
     * Gets the value of the barCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCodeValue() {
        return barCodeValue;
    }

    /**
     * Sets the value of the barCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCodeValue(String value) {
        this.barCodeValue = value;
    }

    /**
     * Gets the value of the assignEvenIfUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignEvenIfUsed() {
        return assignEvenIfUsed;
    }

    /**
     * Sets the value of the assignEvenIfUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignEvenIfUsed(String value) {
        this.assignEvenIfUsed = value;
    }

    /**
     * Gets the value of the allowOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowOverride() {
        return allowOverride;
    }

    /**
     * Sets the value of the allowOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowOverride(String value) {
        this.allowOverride = value;
    }

}
