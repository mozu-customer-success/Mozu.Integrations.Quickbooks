//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.07 at 08:01:35 PM IST 
//


package com.mozu.qbintegration.model.qbmodel.allgen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}TxnLineID"/>
 *         &lt;group ref="{}TxnLineGroupCoreMod"/>
 *         &lt;element ref="{}CreditMemoLineMod" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "txnLineID",
    "itemGroupRef",
    "quantity",
    "unitOfMeasure",
    "overrideUOMSetRef",
    "creditMemoLineMod"
})
@XmlRootElement(name = "CreditMemoLineGroupMod")
public class CreditMemoLineGroupMod {

    @XmlElement(name = "TxnLineID", required = true)
    protected String txnLineID;
    @XmlElement(name = "ItemGroupRef")
    protected ItemGroupRef itemGroupRef;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "OverrideUOMSetRef")
    protected OverrideUOMSetRef overrideUOMSetRef;
    @XmlElement(name = "CreditMemoLineMod")
    protected List<CreditMemoLineMod> creditMemoLineMod;

    /**
     * Gets the value of the txnLineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnLineID() {
        return txnLineID;
    }

    /**
     * Sets the value of the txnLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnLineID(String value) {
        this.txnLineID = value;
    }

    /**
     * Gets the value of the itemGroupRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemGroupRef }
     *     
     */
    public ItemGroupRef getItemGroupRef() {
        return itemGroupRef;
    }

    /**
     * Sets the value of the itemGroupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemGroupRef }
     *     
     */
    public void setItemGroupRef(ItemGroupRef value) {
        this.itemGroupRef = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the overrideUOMSetRef property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideUOMSetRef }
     *     
     */
    public OverrideUOMSetRef getOverrideUOMSetRef() {
        return overrideUOMSetRef;
    }

    /**
     * Sets the value of the overrideUOMSetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideUOMSetRef }
     *     
     */
    public void setOverrideUOMSetRef(OverrideUOMSetRef value) {
        this.overrideUOMSetRef = value;
    }

    /**
     * Gets the value of the creditMemoLineMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditMemoLineMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditMemoLineMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditMemoLineMod }
     * 
     * 
     */
    public List<CreditMemoLineMod> getCreditMemoLineMod() {
        if (creditMemoLineMod == null) {
            creditMemoLineMod = new ArrayList<CreditMemoLineMod>();
        }
        return this.creditMemoLineMod;
    }

}
