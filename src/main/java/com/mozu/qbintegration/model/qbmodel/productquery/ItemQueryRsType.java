//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.05 at 06:41:40 PM IST 
//


package com.mozu.qbintegration.model.qbmodel.productquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemQueryRsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemQueryRsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemServiceRet" type="{}ItemServiceRetType"/>
 *         &lt;element name="ItemNonInventoryRet" type="{}ItemNonInventoryRetType"/>
 *         &lt;element name="ItemOtherChargeRet" type="{}ItemOtherChargeRetType"/>
 *         &lt;element name="ItemInventoryRet" type="{}ItemInventoryRetType"/>
 *         &lt;element name="ItemInventoryAssemblyRet" type="{}ItemInventoryAssemblyRetType"/>
 *         &lt;element name="ItemFixedAssetRet" type="{}ItemFixedAssetRetType"/>
 *         &lt;element name="ItemSubtotalRet" type="{}ItemSubtotalRetType"/>
 *         &lt;element name="ItemDiscountRet" type="{}ItemDiscountRetType"/>
 *         &lt;element name="ItemPaymentRet" type="{}ItemPaymentRetType"/>
 *         &lt;element name="ItemSalesTaxRet" type="{}ItemSalesTaxRetType"/>
 *         &lt;element name="ItemSalesTaxGroupRet" type="{}ItemSalesTaxGroupRetType"/>
 *         &lt;element name="ItemGroupRet" type="{}ItemGroupRetType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statusSeverity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="retCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="iteratorRemainingCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="iteratorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemQueryRsType", propOrder = {
    "itemServiceRet",
    "itemNonInventoryRet",
    "itemOtherChargeRet",
    "itemInventoryRet",
    "itemInventoryAssemblyRet",
    "itemFixedAssetRet",
    "itemSubtotalRet",
    "itemDiscountRet",
    "itemPaymentRet",
    "itemSalesTaxRet",
    "itemSalesTaxGroupRet",
    "itemGroupRet"
})
public class ItemQueryRsType {

    @XmlElement(name = "ItemServiceRet", required = true)
    protected ItemServiceRetType itemServiceRet;
    @XmlElement(name = "ItemNonInventoryRet", required = true)
    protected ItemNonInventoryRetType itemNonInventoryRet;
    @XmlElement(name = "ItemOtherChargeRet", required = true)
    protected ItemOtherChargeRetType itemOtherChargeRet;
    @XmlElement(name = "ItemInventoryRet", required = true)
    protected ItemInventoryRetType itemInventoryRet;
    @XmlElement(name = "ItemInventoryAssemblyRet", required = true)
    protected ItemInventoryAssemblyRetType itemInventoryAssemblyRet;
    @XmlElement(name = "ItemFixedAssetRet", required = true)
    protected ItemFixedAssetRetType itemFixedAssetRet;
    @XmlElement(name = "ItemSubtotalRet", required = true)
    protected ItemSubtotalRetType itemSubtotalRet;
    @XmlElement(name = "ItemDiscountRet", required = true)
    protected ItemDiscountRetType itemDiscountRet;
    @XmlElement(name = "ItemPaymentRet", required = true)
    protected ItemPaymentRetType itemPaymentRet;
    @XmlElement(name = "ItemSalesTaxRet", required = true)
    protected ItemSalesTaxRetType itemSalesTaxRet;
    @XmlElement(name = "ItemSalesTaxGroupRet", required = true)
    protected ItemSalesTaxGroupRetType itemSalesTaxGroupRet;
    @XmlElement(name = "ItemGroupRet", required = true)
    protected ItemGroupRetType itemGroupRet;
    @XmlAttribute(name = "statusCode")
    protected String statusCode;
    @XmlAttribute(name = "statusSeverity")
    protected String statusSeverity;
    @XmlAttribute(name = "statusMessage")
    protected String statusMessage;
    @XmlAttribute(name = "retCount")
    protected String retCount;
    @XmlAttribute(name = "iteratorRemainingCount")
    protected String iteratorRemainingCount;
    @XmlAttribute(name = "iteratorID")
    protected String iteratorID;

    /**
     * Gets the value of the itemServiceRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemServiceRetType }
     *     
     */
    public ItemServiceRetType getItemServiceRet() {
        return itemServiceRet;
    }

    /**
     * Sets the value of the itemServiceRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemServiceRetType }
     *     
     */
    public void setItemServiceRet(ItemServiceRetType value) {
        this.itemServiceRet = value;
    }

    /**
     * Gets the value of the itemNonInventoryRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNonInventoryRetType }
     *     
     */
    public ItemNonInventoryRetType getItemNonInventoryRet() {
        return itemNonInventoryRet;
    }

    /**
     * Sets the value of the itemNonInventoryRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNonInventoryRetType }
     *     
     */
    public void setItemNonInventoryRet(ItemNonInventoryRetType value) {
        this.itemNonInventoryRet = value;
    }

    /**
     * Gets the value of the itemOtherChargeRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemOtherChargeRetType }
     *     
     */
    public ItemOtherChargeRetType getItemOtherChargeRet() {
        return itemOtherChargeRet;
    }

    /**
     * Sets the value of the itemOtherChargeRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemOtherChargeRetType }
     *     
     */
    public void setItemOtherChargeRet(ItemOtherChargeRetType value) {
        this.itemOtherChargeRet = value;
    }

    /**
     * Gets the value of the itemInventoryRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInventoryRetType }
     *     
     */
    public ItemInventoryRetType getItemInventoryRet() {
        return itemInventoryRet;
    }

    /**
     * Sets the value of the itemInventoryRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInventoryRetType }
     *     
     */
    public void setItemInventoryRet(ItemInventoryRetType value) {
        this.itemInventoryRet = value;
    }

    /**
     * Gets the value of the itemInventoryAssemblyRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInventoryAssemblyRetType }
     *     
     */
    public ItemInventoryAssemblyRetType getItemInventoryAssemblyRet() {
        return itemInventoryAssemblyRet;
    }

    /**
     * Sets the value of the itemInventoryAssemblyRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInventoryAssemblyRetType }
     *     
     */
    public void setItemInventoryAssemblyRet(ItemInventoryAssemblyRetType value) {
        this.itemInventoryAssemblyRet = value;
    }

    /**
     * Gets the value of the itemFixedAssetRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFixedAssetRetType }
     *     
     */
    public ItemFixedAssetRetType getItemFixedAssetRet() {
        return itemFixedAssetRet;
    }

    /**
     * Sets the value of the itemFixedAssetRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFixedAssetRetType }
     *     
     */
    public void setItemFixedAssetRet(ItemFixedAssetRetType value) {
        this.itemFixedAssetRet = value;
    }

    /**
     * Gets the value of the itemSubtotalRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSubtotalRetType }
     *     
     */
    public ItemSubtotalRetType getItemSubtotalRet() {
        return itemSubtotalRet;
    }

    /**
     * Sets the value of the itemSubtotalRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSubtotalRetType }
     *     
     */
    public void setItemSubtotalRet(ItemSubtotalRetType value) {
        this.itemSubtotalRet = value;
    }

    /**
     * Gets the value of the itemDiscountRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDiscountRetType }
     *     
     */
    public ItemDiscountRetType getItemDiscountRet() {
        return itemDiscountRet;
    }

    /**
     * Sets the value of the itemDiscountRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDiscountRetType }
     *     
     */
    public void setItemDiscountRet(ItemDiscountRetType value) {
        this.itemDiscountRet = value;
    }

    /**
     * Gets the value of the itemPaymentRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPaymentRetType }
     *     
     */
    public ItemPaymentRetType getItemPaymentRet() {
        return itemPaymentRet;
    }

    /**
     * Sets the value of the itemPaymentRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPaymentRetType }
     *     
     */
    public void setItemPaymentRet(ItemPaymentRetType value) {
        this.itemPaymentRet = value;
    }

    /**
     * Gets the value of the itemSalesTaxRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSalesTaxRetType }
     *     
     */
    public ItemSalesTaxRetType getItemSalesTaxRet() {
        return itemSalesTaxRet;
    }

    /**
     * Sets the value of the itemSalesTaxRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSalesTaxRetType }
     *     
     */
    public void setItemSalesTaxRet(ItemSalesTaxRetType value) {
        this.itemSalesTaxRet = value;
    }

    /**
     * Gets the value of the itemSalesTaxGroupRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSalesTaxGroupRetType }
     *     
     */
    public ItemSalesTaxGroupRetType getItemSalesTaxGroupRet() {
        return itemSalesTaxGroupRet;
    }

    /**
     * Sets the value of the itemSalesTaxGroupRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSalesTaxGroupRetType }
     *     
     */
    public void setItemSalesTaxGroupRet(ItemSalesTaxGroupRetType value) {
        this.itemSalesTaxGroupRet = value;
    }

    /**
     * Gets the value of the itemGroupRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemGroupRetType }
     *     
     */
    public ItemGroupRetType getItemGroupRet() {
        return itemGroupRet;
    }

    /**
     * Sets the value of the itemGroupRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemGroupRetType }
     *     
     */
    public void setItemGroupRet(ItemGroupRetType value) {
        this.itemGroupRet = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSeverity() {
        return statusSeverity;
    }

    /**
     * Sets the value of the statusSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSeverity(String value) {
        this.statusSeverity = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the retCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetCount() {
        return retCount;
    }

    /**
     * Sets the value of the retCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetCount(String value) {
        this.retCount = value;
    }

    /**
     * Gets the value of the iteratorRemainingCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIteratorRemainingCount() {
        return iteratorRemainingCount;
    }

    /**
     * Sets the value of the iteratorRemainingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIteratorRemainingCount(String value) {
        this.iteratorRemainingCount = value;
    }

    /**
     * Gets the value of the iteratorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIteratorID() {
        return iteratorID;
    }

    /**
     * Sets the value of the iteratorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIteratorID(String value) {
        this.iteratorID = value;
    }

}
