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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{}SignonMsgsRq" minOccurs="0"/>
 *           &lt;choice>
 *             &lt;element ref="{}QBXMLMsgsRq" minOccurs="0"/>
 *             &lt;element ref="{}QBXMLSubscriptionMsgsRq" minOccurs="0"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}SignonMsgsRs" minOccurs="0"/>
 *           &lt;choice>
 *             &lt;element ref="{}QBXMLMsgsRs" minOccurs="0"/>
 *             &lt;element ref="{}QBXMLSubscriptionMsgsRs" minOccurs="0"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signonMsgsRq",
    "qbxmlMsgsRq",
    "qbxmlSubscriptionMsgsRq",
    "signonMsgsRs",
    "qbxmlMsgsRs",
    "qbxmlSubscriptionMsgsRs"
})
@XmlRootElement(name = "QBXML")
public class QBXML {

    @XmlElement(name = "SignonMsgsRq")
    protected SignonMsgsRq signonMsgsRq;
    @XmlElement(name = "QBXMLMsgsRq")
    protected QBXMLMsgsRq qbxmlMsgsRq;
    @XmlElement(name = "QBXMLSubscriptionMsgsRq")
    protected QBXMLSubscriptionMsgsRq qbxmlSubscriptionMsgsRq;
    @XmlElement(name = "SignonMsgsRs")
    protected SignonMsgsRs signonMsgsRs;
    @XmlElement(name = "QBXMLMsgsRs")
    protected QBXMLMsgsRs qbxmlMsgsRs;
    @XmlElement(name = "QBXMLSubscriptionMsgsRs")
    protected QBXMLSubscriptionMsgsRs qbxmlSubscriptionMsgsRs;

    /**
     * Gets the value of the signonMsgsRq property.
     * 
     * @return
     *     possible object is
     *     {@link SignonMsgsRq }
     *     
     */
    public SignonMsgsRq getSignonMsgsRq() {
        return signonMsgsRq;
    }

    /**
     * Sets the value of the signonMsgsRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonMsgsRq }
     *     
     */
    public void setSignonMsgsRq(SignonMsgsRq value) {
        this.signonMsgsRq = value;
    }

    /**
     * Gets the value of the qbxmlMsgsRq property.
     * 
     * @return
     *     possible object is
     *     {@link QBXMLMsgsRq }
     *     
     */
    public QBXMLMsgsRq getQBXMLMsgsRq() {
        return qbxmlMsgsRq;
    }

    /**
     * Sets the value of the qbxmlMsgsRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link QBXMLMsgsRq }
     *     
     */
    public void setQBXMLMsgsRq(QBXMLMsgsRq value) {
        this.qbxmlMsgsRq = value;
    }

    /**
     * Gets the value of the qbxmlSubscriptionMsgsRq property.
     * 
     * @return
     *     possible object is
     *     {@link QBXMLSubscriptionMsgsRq }
     *     
     */
    public QBXMLSubscriptionMsgsRq getQBXMLSubscriptionMsgsRq() {
        return qbxmlSubscriptionMsgsRq;
    }

    /**
     * Sets the value of the qbxmlSubscriptionMsgsRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link QBXMLSubscriptionMsgsRq }
     *     
     */
    public void setQBXMLSubscriptionMsgsRq(QBXMLSubscriptionMsgsRq value) {
        this.qbxmlSubscriptionMsgsRq = value;
    }

    /**
     * Gets the value of the signonMsgsRs property.
     * 
     * @return
     *     possible object is
     *     {@link SignonMsgsRs }
     *     
     */
    public SignonMsgsRs getSignonMsgsRs() {
        return signonMsgsRs;
    }

    /**
     * Sets the value of the signonMsgsRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonMsgsRs }
     *     
     */
    public void setSignonMsgsRs(SignonMsgsRs value) {
        this.signonMsgsRs = value;
    }

    /**
     * Gets the value of the qbxmlMsgsRs property.
     * 
     * @return
     *     possible object is
     *     {@link QBXMLMsgsRs }
     *     
     */
    public QBXMLMsgsRs getQBXMLMsgsRs() {
        return qbxmlMsgsRs;
    }

    /**
     * Sets the value of the qbxmlMsgsRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link QBXMLMsgsRs }
     *     
     */
    public void setQBXMLMsgsRs(QBXMLMsgsRs value) {
        this.qbxmlMsgsRs = value;
    }

    /**
     * Gets the value of the qbxmlSubscriptionMsgsRs property.
     * 
     * @return
     *     possible object is
     *     {@link QBXMLSubscriptionMsgsRs }
     *     
     */
    public QBXMLSubscriptionMsgsRs getQBXMLSubscriptionMsgsRs() {
        return qbxmlSubscriptionMsgsRs;
    }

    /**
     * Sets the value of the qbxmlSubscriptionMsgsRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link QBXMLSubscriptionMsgsRs }
     *     
     */
    public void setQBXMLSubscriptionMsgsRs(QBXMLSubscriptionMsgsRs value) {
        this.qbxmlSubscriptionMsgsRs = value;
    }

}
