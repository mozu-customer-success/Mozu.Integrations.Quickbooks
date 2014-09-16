//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.05 at 06:41:40 PM IST 
//


package com.mozu.qbintegration.model.qbmodel.productquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSalesTaxGroupRetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSalesTaxGroupRetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimeCreated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimeModified" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EditSequence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BarCodeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExternalGUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemSalesTaxRef" type="{}ItemSalesTaxRefType"/>
 *         &lt;element name="DataExtRet" type="{}DataExtRetType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSalesTaxGroupRetType", propOrder = {
    "listID",
    "timeCreated",
    "timeModified",
    "editSequence",
    "name",
    "barCodeValue",
    "isActive",
    "itemDesc",
    "externalGUID",
    "itemSalesTaxRef",
    "dataExtRet"
})
public class ItemSalesTaxGroupRetType {

    @XmlElement(name = "ListID", required = true)
    protected String listID;
    @XmlElement(name = "TimeCreated", required = true)
    protected String timeCreated;
    @XmlElement(name = "TimeModified", required = true)
    protected String timeModified;
    @XmlElement(name = "EditSequence", required = true)
    protected String editSequence;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "BarCodeValue", required = true)
    protected String barCodeValue;
    @XmlElement(name = "IsActive", required = true)
    protected String isActive;
    @XmlElement(name = "ItemDesc", required = true)
    protected String itemDesc;
    @XmlElement(name = "ExternalGUID", required = true)
    protected String externalGUID;
    @XmlElement(name = "ItemSalesTaxRef", required = true)
    protected ItemSalesTaxRefType itemSalesTaxRef;
    @XmlElement(name = "DataExtRet", required = true)
    protected DataExtRetType dataExtRet;

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the timeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCreated() {
        return timeCreated;
    }

    /**
     * Sets the value of the timeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCreated(String value) {
        this.timeCreated = value;
    }

    /**
     * Gets the value of the timeModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeModified() {
        return timeModified;
    }

    /**
     * Sets the value of the timeModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeModified(String value) {
        this.timeModified = value;
    }

    /**
     * Gets the value of the editSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditSequence() {
        return editSequence;
    }

    /**
     * Sets the value of the editSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditSequence(String value) {
        this.editSequence = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the itemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * Sets the value of the itemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDesc(String value) {
        this.itemDesc = value;
    }

    /**
     * Gets the value of the externalGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalGUID() {
        return externalGUID;
    }

    /**
     * Sets the value of the externalGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalGUID(String value) {
        this.externalGUID = value;
    }

    /**
     * Gets the value of the itemSalesTaxRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSalesTaxRefType }
     *     
     */
    public ItemSalesTaxRefType getItemSalesTaxRef() {
        return itemSalesTaxRef;
    }

    /**
     * Sets the value of the itemSalesTaxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSalesTaxRefType }
     *     
     */
    public void setItemSalesTaxRef(ItemSalesTaxRefType value) {
        this.itemSalesTaxRef = value;
    }

    /**
     * Gets the value of the dataExtRet property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtRetType }
     *     
     */
    public DataExtRetType getDataExtRet() {
        return dataExtRet;
    }

    /**
     * Sets the value of the dataExtRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtRetType }
     *     
     */
    public void setDataExtRet(DataExtRetType value) {
        this.dataExtRet = value;
    }

}
