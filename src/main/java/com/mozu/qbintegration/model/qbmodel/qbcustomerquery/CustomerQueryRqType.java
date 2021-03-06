//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.04 at 01:59:17 PM IST 
//


package com.mozu.qbintegration.model.qbmodel.qbcustomerquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerQueryRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerQueryRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaxReturned" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActiveStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameFilter" type="{}NameFilterType"/>
 *         &lt;element name="NameRangeFilter" type="{}NameRangeFilterType"/>
 *         &lt;element name="TotalBalanceFilter" type="{}TotalBalanceFilterType"/>
 *         &lt;element name="CurrencyFilter" type="{}CurrencyFilterType"/>
 *         &lt;element name="ClassFilter" type="{}ClassFilterType"/>
 *         &lt;element name="IncludeRetElement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwnerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="metaData" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="iterator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="iteratorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerQueryRqType", propOrder = {
    "listID",
    "fullName",
    "maxReturned",
    "activeStatus",
    "fromModifiedDate",
    "toModifiedDate",
    "nameFilter",
    "nameRangeFilter",
    "totalBalanceFilter",
    "currencyFilter",
    "classFilter",
    "includeRetElement",
    "ownerID"
})
public class CustomerQueryRqType {

    @XmlElement(name = "ListID", required = true)
    protected String listID;
    @XmlElement(name = "FullName", required = true)
    protected String fullName;
    @XmlElement(name = "MaxReturned", required = true)
    protected String maxReturned;
    @XmlElement(name = "ActiveStatus", required = true)
    protected String activeStatus;
    @XmlElement(name = "FromModifiedDate", required = true)
    protected String fromModifiedDate;
    @XmlElement(name = "ToModifiedDate", required = true)
    protected String toModifiedDate;
    @XmlElement(name = "NameFilter", required = true)
    protected NameFilterType nameFilter;
    @XmlElement(name = "NameRangeFilter", required = true)
    protected NameRangeFilterType nameRangeFilter;
    @XmlElement(name = "TotalBalanceFilter", required = true)
    protected TotalBalanceFilterType totalBalanceFilter;
    @XmlElement(name = "CurrencyFilter", required = true)
    protected CurrencyFilterType currencyFilter;
    @XmlElement(name = "ClassFilter", required = true)
    protected ClassFilterType classFilter;
    @XmlElement(name = "IncludeRetElement", required = true)
    protected String includeRetElement;
    @XmlElement(name = "OwnerID", required = true)
    protected String ownerID;
    @XmlAttribute(name = "metaData")
    protected String metaData;
    @XmlAttribute(name = "iterator")
    protected String iterator;
    @XmlAttribute(name = "iteratorID")
    protected String iteratorID;

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
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the maxReturned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxReturned() {
        return maxReturned;
    }

    /**
     * Sets the value of the maxReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxReturned(String value) {
        this.maxReturned = value;
    }

    /**
     * Gets the value of the activeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of the activeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStatus(String value) {
        this.activeStatus = value;
    }

    /**
     * Gets the value of the fromModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromModifiedDate() {
        return fromModifiedDate;
    }

    /**
     * Sets the value of the fromModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromModifiedDate(String value) {
        this.fromModifiedDate = value;
    }

    /**
     * Gets the value of the toModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToModifiedDate() {
        return toModifiedDate;
    }

    /**
     * Sets the value of the toModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToModifiedDate(String value) {
        this.toModifiedDate = value;
    }

    /**
     * Gets the value of the nameFilter property.
     * 
     * @return
     *     possible object is
     *     {@link NameFilterType }
     *     
     */
    public NameFilterType getNameFilter() {
        return nameFilter;
    }

    /**
     * Sets the value of the nameFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameFilterType }
     *     
     */
    public void setNameFilter(NameFilterType value) {
        this.nameFilter = value;
    }

    /**
     * Gets the value of the nameRangeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link NameRangeFilterType }
     *     
     */
    public NameRangeFilterType getNameRangeFilter() {
        return nameRangeFilter;
    }

    /**
     * Sets the value of the nameRangeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameRangeFilterType }
     *     
     */
    public void setNameRangeFilter(NameRangeFilterType value) {
        this.nameRangeFilter = value;
    }

    /**
     * Gets the value of the totalBalanceFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TotalBalanceFilterType }
     *     
     */
    public TotalBalanceFilterType getTotalBalanceFilter() {
        return totalBalanceFilter;
    }

    /**
     * Sets the value of the totalBalanceFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalBalanceFilterType }
     *     
     */
    public void setTotalBalanceFilter(TotalBalanceFilterType value) {
        this.totalBalanceFilter = value;
    }

    /**
     * Gets the value of the currencyFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyFilterType }
     *     
     */
    public CurrencyFilterType getCurrencyFilter() {
        return currencyFilter;
    }

    /**
     * Sets the value of the currencyFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyFilterType }
     *     
     */
    public void setCurrencyFilter(CurrencyFilterType value) {
        this.currencyFilter = value;
    }

    /**
     * Gets the value of the classFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ClassFilterType }
     *     
     */
    public ClassFilterType getClassFilter() {
        return classFilter;
    }

    /**
     * Sets the value of the classFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassFilterType }
     *     
     */
    public void setClassFilter(ClassFilterType value) {
        this.classFilter = value;
    }

    /**
     * Gets the value of the includeRetElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeRetElement() {
        return includeRetElement;
    }

    /**
     * Sets the value of the includeRetElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeRetElement(String value) {
        this.includeRetElement = value;
    }

    /**
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerID(String value) {
        this.ownerID = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaData(String value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the iterator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterator() {
        return iterator;
    }

    /**
     * Sets the value of the iterator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterator(String value) {
        this.iterator = value;
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
