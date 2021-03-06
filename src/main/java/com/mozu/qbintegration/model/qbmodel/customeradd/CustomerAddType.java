//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.04 at 01:39:25 PM IST 
//


package com.mozu.qbintegration.model.qbmodel.customeradd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAddType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAddType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClassRef" type="{}ClassRefType"/>
 *         &lt;element name="ParentRef" type="{}ParentRefType"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillAddress" type="{}BillAddressType"/>
 *         &lt;element name="ShipAddress" type="{}ShipAddressType"/>
 *         &lt;element name="ShipToAddress" type="{}ShipToAddressType"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AltPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AltContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdditionalContactRef" type="{}AdditionalContactRefType"/>
 *         &lt;element name="Contacts" type="{}ContactsType"/>
 *         &lt;element name="CustomerTypeRef" type="{}CustomerTypeRefType"/>
 *         &lt;element name="TermsRef" type="{}TermsRefType"/>
 *         &lt;element name="SalesRepRef" type="{}SalesRepRefType"/>
 *         &lt;element name="OpenBalance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OpenBalanceDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SalesTaxCodeRef" type="{}SalesTaxCodeRefType"/>
 *         &lt;element name="ItemSalesTaxRef" type="{}ItemSalesTaxRefType"/>
 *         &lt;element name="ResaleNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreditLimit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PreferredPaymentMethodRef" type="{}PreferredPaymentMethodRefType"/>
 *         &lt;element name="CreditCardInfo" type="{}CreditCardInfoType"/>
 *         &lt;element name="JobStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JobStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JobProjectedEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JobEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JobDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JobTypeRef" type="{}JobTypeRefType"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdditionalNotes" type="{}AdditionalNotesType"/>
 *         &lt;element name="PreferredDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PriceLevelRef" type="{}PriceLevelRefType"/>
 *         &lt;element name="ExternalGUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyRef" type="{}CurrencyRefType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAddType", propOrder = {
    "name",
    "isActive",
    "classRef",
    "parentRef",
    "companyName",
    "salutation",
    "firstName",
    "middleName",
    "lastName",
    "jobTitle",
    "billAddress",
    "shipAddress",
    "shipToAddress",
    "phone",
    "altPhone",
    "fax",
    "email",
    "cc",
    "contact",
    "altContact",
    "additionalContactRef",
    "contacts",
    "customerTypeRef",
    "termsRef",
    "salesRepRef",
    "openBalance",
    "openBalanceDate",
    "salesTaxCodeRef",
    "itemSalesTaxRef",
    "resaleNumber",
    "accountNumber",
    "creditLimit",
    "preferredPaymentMethodRef",
    "creditCardInfo",
    "jobStatus",
    "jobStartDate",
    "jobProjectedEndDate",
    "jobEndDate",
    "jobDesc",
    "jobTypeRef",
    "notes",
    "additionalNotes",
    "preferredDeliveryMethod",
    "priceLevelRef",
    "externalGUID",
    "currencyRef"
})
public class CustomerAddType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "IsActive", required = true)
    protected String isActive;
    @XmlElement(name = "ClassRef", required = true)
    protected ClassRefType classRef;
    @XmlElement(name = "ParentRef", required = true)
    protected ParentRefType parentRef;
    @XmlElement(name = "CompanyName", required = true)
    protected String companyName;
    @XmlElement(name = "Salutation", required = true)
    protected String salutation;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "MiddleName", required = true)
    protected String middleName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "JobTitle", required = true)
    protected String jobTitle;
    @XmlElement(name = "BillAddress", required = true)
    protected BillAddressType billAddress;
    @XmlElement(name = "ShipAddress", required = true)
    protected ShipAddressType shipAddress;
    @XmlElement(name = "ShipToAddress", required = true)
    protected ShipToAddressType shipToAddress;
    @XmlElement(name = "Phone", required = true)
    protected String phone;
    @XmlElement(name = "AltPhone", required = true)
    protected String altPhone;
    @XmlElement(name = "Fax", required = true)
    protected String fax;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Cc", required = true)
    protected String cc;
    @XmlElement(name = "Contact", required = true)
    protected String contact;
    @XmlElement(name = "AltContact", required = true)
    protected String altContact;
    @XmlElement(name = "AdditionalContactRef", required = true)
    protected AdditionalContactRefType additionalContactRef;
    @XmlElement(name = "Contacts", required = true)
    protected ContactsType contacts;
    @XmlElement(name = "CustomerTypeRef", required = true)
    protected CustomerTypeRefType customerTypeRef;
    @XmlElement(name = "TermsRef", required = true)
    protected TermsRefType termsRef;
    @XmlElement(name = "SalesRepRef", required = true)
    protected SalesRepRefType salesRepRef;
    @XmlElement(name = "OpenBalance", required = true)
    protected String openBalance;
    @XmlElement(name = "OpenBalanceDate", required = true)
    protected String openBalanceDate;
    @XmlElement(name = "SalesTaxCodeRef", required = true)
    protected SalesTaxCodeRefType salesTaxCodeRef;
    @XmlElement(name = "ItemSalesTaxRef", required = true)
    protected ItemSalesTaxRefType itemSalesTaxRef;
    @XmlElement(name = "ResaleNumber", required = true)
    protected String resaleNumber;
    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;
    @XmlElement(name = "CreditLimit", required = true)
    protected String creditLimit;
    @XmlElement(name = "PreferredPaymentMethodRef", required = true)
    protected PreferredPaymentMethodRefType preferredPaymentMethodRef;
    @XmlElement(name = "CreditCardInfo", required = true)
    protected CreditCardInfoType creditCardInfo;
    @XmlElement(name = "JobStatus", required = true)
    protected String jobStatus;
    @XmlElement(name = "JobStartDate", required = true)
    protected String jobStartDate;
    @XmlElement(name = "JobProjectedEndDate", required = true)
    protected String jobProjectedEndDate;
    @XmlElement(name = "JobEndDate", required = true)
    protected String jobEndDate;
    @XmlElement(name = "JobDesc", required = true)
    protected String jobDesc;
    @XmlElement(name = "JobTypeRef", required = true)
    protected JobTypeRefType jobTypeRef;
    @XmlElement(name = "Notes", required = true)
    protected String notes;
    @XmlElement(name = "AdditionalNotes", required = true)
    protected AdditionalNotesType additionalNotes;
    @XmlElement(name = "PreferredDeliveryMethod", required = true)
    protected String preferredDeliveryMethod;
    @XmlElement(name = "PriceLevelRef", required = true)
    protected PriceLevelRefType priceLevelRef;
    @XmlElement(name = "ExternalGUID", required = true)
    protected String externalGUID;
    @XmlElement(name = "CurrencyRef", required = true)
    protected CurrencyRefType currencyRef;

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
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassRefType }
     *     
     */
    public ClassRefType getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRefType }
     *     
     */
    public void setClassRef(ClassRefType value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the parentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParentRefType }
     *     
     */
    public ParentRefType getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentRefType }
     *     
     */
    public void setParentRef(ParentRefType value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the billAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BillAddressType }
     *     
     */
    public BillAddressType getBillAddress() {
        return billAddress;
    }

    /**
     * Sets the value of the billAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillAddressType }
     *     
     */
    public void setBillAddress(BillAddressType value) {
        this.billAddress = value;
    }

    /**
     * Gets the value of the shipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShipAddressType }
     *     
     */
    public ShipAddressType getShipAddress() {
        return shipAddress;
    }

    /**
     * Sets the value of the shipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipAddressType }
     *     
     */
    public void setShipAddress(ShipAddressType value) {
        this.shipAddress = value;
    }

    /**
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToAddressType }
     *     
     */
    public ShipToAddressType getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToAddressType }
     *     
     */
    public void setShipToAddress(ShipToAddressType value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the altPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhone() {
        return altPhone;
    }

    /**
     * Sets the value of the altPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhone(String value) {
        this.altPhone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCc() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCc(String value) {
        this.cc = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the altContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltContact() {
        return altContact;
    }

    /**
     * Sets the value of the altContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltContact(String value) {
        this.altContact = value;
    }

    /**
     * Gets the value of the additionalContactRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalContactRefType }
     *     
     */
    public AdditionalContactRefType getAdditionalContactRef() {
        return additionalContactRef;
    }

    /**
     * Sets the value of the additionalContactRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalContactRefType }
     *     
     */
    public void setAdditionalContactRef(AdditionalContactRefType value) {
        this.additionalContactRef = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ContactsType }
     *     
     */
    public ContactsType getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactsType }
     *     
     */
    public void setContacts(ContactsType value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the customerTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerTypeRefType }
     *     
     */
    public CustomerTypeRefType getCustomerTypeRef() {
        return customerTypeRef;
    }

    /**
     * Sets the value of the customerTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerTypeRefType }
     *     
     */
    public void setCustomerTypeRef(CustomerTypeRefType value) {
        this.customerTypeRef = value;
    }

    /**
     * Gets the value of the termsRef property.
     * 
     * @return
     *     possible object is
     *     {@link TermsRefType }
     *     
     */
    public TermsRefType getTermsRef() {
        return termsRef;
    }

    /**
     * Sets the value of the termsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsRefType }
     *     
     */
    public void setTermsRef(TermsRefType value) {
        this.termsRef = value;
    }

    /**
     * Gets the value of the salesRepRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesRepRefType }
     *     
     */
    public SalesRepRefType getSalesRepRef() {
        return salesRepRef;
    }

    /**
     * Sets the value of the salesRepRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRepRefType }
     *     
     */
    public void setSalesRepRef(SalesRepRefType value) {
        this.salesRepRef = value;
    }

    /**
     * Gets the value of the openBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenBalance() {
        return openBalance;
    }

    /**
     * Sets the value of the openBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenBalance(String value) {
        this.openBalance = value;
    }

    /**
     * Gets the value of the openBalanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenBalanceDate() {
        return openBalanceDate;
    }

    /**
     * Sets the value of the openBalanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenBalanceDate(String value) {
        this.openBalanceDate = value;
    }

    /**
     * Gets the value of the salesTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxCodeRefType }
     *     
     */
    public SalesTaxCodeRefType getSalesTaxCodeRef() {
        return salesTaxCodeRef;
    }

    /**
     * Sets the value of the salesTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxCodeRefType }
     *     
     */
    public void setSalesTaxCodeRef(SalesTaxCodeRefType value) {
        this.salesTaxCodeRef = value;
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
     * Gets the value of the resaleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResaleNumber() {
        return resaleNumber;
    }

    /**
     * Sets the value of the resaleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResaleNumber(String value) {
        this.resaleNumber = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the preferredPaymentMethodRef property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredPaymentMethodRefType }
     *     
     */
    public PreferredPaymentMethodRefType getPreferredPaymentMethodRef() {
        return preferredPaymentMethodRef;
    }

    /**
     * Sets the value of the preferredPaymentMethodRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredPaymentMethodRefType }
     *     
     */
    public void setPreferredPaymentMethodRef(PreferredPaymentMethodRefType value) {
        this.preferredPaymentMethodRef = value;
    }

    /**
     * Gets the value of the creditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInfoType }
     *     
     */
    public CreditCardInfoType getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * Sets the value of the creditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInfoType }
     *     
     */
    public void setCreditCardInfo(CreditCardInfoType value) {
        this.creditCardInfo = value;
    }

    /**
     * Gets the value of the jobStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * Sets the value of the jobStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStatus(String value) {
        this.jobStatus = value;
    }

    /**
     * Gets the value of the jobStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStartDate() {
        return jobStartDate;
    }

    /**
     * Sets the value of the jobStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStartDate(String value) {
        this.jobStartDate = value;
    }

    /**
     * Gets the value of the jobProjectedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobProjectedEndDate() {
        return jobProjectedEndDate;
    }

    /**
     * Sets the value of the jobProjectedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobProjectedEndDate(String value) {
        this.jobProjectedEndDate = value;
    }

    /**
     * Gets the value of the jobEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobEndDate() {
        return jobEndDate;
    }

    /**
     * Sets the value of the jobEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobEndDate(String value) {
        this.jobEndDate = value;
    }

    /**
     * Gets the value of the jobDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * Sets the value of the jobDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDesc(String value) {
        this.jobDesc = value;
    }

    /**
     * Gets the value of the jobTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link JobTypeRefType }
     *     
     */
    public JobTypeRefType getJobTypeRef() {
        return jobTypeRef;
    }

    /**
     * Sets the value of the jobTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTypeRefType }
     *     
     */
    public void setJobTypeRef(JobTypeRefType value) {
        this.jobTypeRef = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the additionalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalNotesType }
     *     
     */
    public AdditionalNotesType getAdditionalNotes() {
        return additionalNotes;
    }

    /**
     * Sets the value of the additionalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalNotesType }
     *     
     */
    public void setAdditionalNotes(AdditionalNotesType value) {
        this.additionalNotes = value;
    }

    /**
     * Gets the value of the preferredDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredDeliveryMethod() {
        return preferredDeliveryMethod;
    }

    /**
     * Sets the value of the preferredDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredDeliveryMethod(String value) {
        this.preferredDeliveryMethod = value;
    }

    /**
     * Gets the value of the priceLevelRef property.
     * 
     * @return
     *     possible object is
     *     {@link PriceLevelRefType }
     *     
     */
    public PriceLevelRefType getPriceLevelRef() {
        return priceLevelRef;
    }

    /**
     * Sets the value of the priceLevelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceLevelRefType }
     *     
     */
    public void setPriceLevelRef(PriceLevelRefType value) {
        this.priceLevelRef = value;
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
     * Gets the value of the currencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRefType }
     *     
     */
    public CurrencyRefType getCurrencyRef() {
        return currencyRef;
    }

    /**
     * Sets the value of the currencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRefType }
     *     
     */
    public void setCurrencyRef(CurrencyRefType value) {
        this.currencyRef = value;
    }

}
