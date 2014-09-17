//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.07 at 08:01:35 PM IST 
//


package com.mozu.qbintegration.model.qbmodel.allgen;

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
 *         &lt;element name="CompanyFilePath">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="260"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}HostInfo"/>
 *         &lt;choice>
 *           &lt;element ref="{}ListEvent"/>
 *           &lt;element ref="{}TxnEvent"/>
 *         &lt;/choice>
 *         &lt;element ref="{}LastRestoreTime" minOccurs="0"/>
 *         &lt;element ref="{}LastCondenseTime" minOccurs="0"/>
 *         &lt;element ref="{}DataEventRecoveryTime" minOccurs="0"/>
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
    "companyFilePath",
    "hostInfo",
    "listEvent",
    "txnEvent",
    "lastRestoreTime",
    "lastCondenseTime",
    "dataEventRecoveryTime"
})
@XmlRootElement(name = "DataEvent")
public class DataEvent {

    @XmlElement(name = "CompanyFilePath", required = true)
    protected String companyFilePath;
    @XmlElement(name = "HostInfo", required = true)
    protected HostInfo hostInfo;
    @XmlElement(name = "ListEvent")
    protected ListEvent listEvent;
    @XmlElement(name = "TxnEvent")
    protected TxnEvent txnEvent;
    @XmlElement(name = "LastRestoreTime")
    protected String lastRestoreTime;
    @XmlElement(name = "LastCondenseTime")
    protected String lastCondenseTime;
    @XmlElement(name = "DataEventRecoveryTime")
    protected String dataEventRecoveryTime;

    /**
     * Gets the value of the companyFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyFilePath() {
        return companyFilePath;
    }

    /**
     * Sets the value of the companyFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyFilePath(String value) {
        this.companyFilePath = value;
    }

    /**
     * Gets the value of the hostInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostInfo }
     *     
     */
    public HostInfo getHostInfo() {
        return hostInfo;
    }

    /**
     * Sets the value of the hostInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInfo }
     *     
     */
    public void setHostInfo(HostInfo value) {
        this.hostInfo = value;
    }

    /**
     * Gets the value of the listEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ListEvent }
     *     
     */
    public ListEvent getListEvent() {
        return listEvent;
    }

    /**
     * Sets the value of the listEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListEvent }
     *     
     */
    public void setListEvent(ListEvent value) {
        this.listEvent = value;
    }

    /**
     * Gets the value of the txnEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TxnEvent }
     *     
     */
    public TxnEvent getTxnEvent() {
        return txnEvent;
    }

    /**
     * Sets the value of the txnEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnEvent }
     *     
     */
    public void setTxnEvent(TxnEvent value) {
        this.txnEvent = value;
    }

    /**
     * Gets the value of the lastRestoreTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRestoreTime() {
        return lastRestoreTime;
    }

    /**
     * Sets the value of the lastRestoreTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRestoreTime(String value) {
        this.lastRestoreTime = value;
    }

    /**
     * Gets the value of the lastCondenseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCondenseTime() {
        return lastCondenseTime;
    }

    /**
     * Sets the value of the lastCondenseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCondenseTime(String value) {
        this.lastCondenseTime = value;
    }

    /**
     * Gets the value of the dataEventRecoveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEventRecoveryTime() {
        return dataEventRecoveryTime;
    }

    /**
     * Sets the value of the dataEventRecoveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEventRecoveryTime(String value) {
        this.dataEventRecoveryTime = value;
    }

}
