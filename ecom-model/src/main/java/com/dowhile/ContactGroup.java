package com.dowhile;
// Generated Aug 17, 2017 1:48:25 PM by Hibernate Tools 3.4.0.CR1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ContactGroup generated by hbm2java
 */
@Entity
@Table(name="contact_group"
    ,catalog="ecom"
)
public class ContactGroup  implements java.io.Serializable {


     private Integer contactGroupId;
     private Country country;
     private Company company;
     private String contactGroupName;
     private boolean activeIndicator;
     private Date createdDate;
     private Date lastUpdated;
     private Integer createdBy;
     private Integer updatedBy;
     private Set<PriceBook> priceBooks = new HashSet<PriceBook>(0);
     private Set<Contact> contacts = new HashSet<Contact>(0);

    public ContactGroup() {
    }

	
    public ContactGroup(Company company, String contactGroupName, boolean activeIndicator, Date createdDate, Date lastUpdated) {
        this.company = company;
        this.contactGroupName = contactGroupName;
        this.activeIndicator = activeIndicator;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
    }
    public ContactGroup(Country country, Company company, String contactGroupName, boolean activeIndicator, Date createdDate, Date lastUpdated, Integer createdBy, Integer updatedBy, Set<PriceBook> priceBooks, Set<Contact> contacts) {
       this.country = country;
       this.company = company;
       this.contactGroupName = contactGroupName;
       this.activeIndicator = activeIndicator;
       this.createdDate = createdDate;
       this.lastUpdated = lastUpdated;
       this.createdBy = createdBy;
       this.updatedBy = updatedBy;
       this.priceBooks = priceBooks;
       this.contacts = contacts;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="CONTACT_GROUP_ID", unique=true, nullable=false)
    public Integer getContactGroupId() {
        return this.contactGroupId;
    }
    
    public void setContactGroupId(Integer contactGroupId) {
        this.contactGroupId = contactGroupId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COUNTRY_ASSOCICATION_ID")
    public Country getCountry() {
        return this.country;
    }
    
    public void setCountry(Country country) {
        this.country = country;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COMPANY_ASSOCIATION_ID", nullable=false)
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }

    
    @Column(name="CONTACT_GROUP_NAME", nullable=false, length=200)
    public String getContactGroupName() {
        return this.contactGroupName;
    }
    
    public void setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
    }

    
    @Column(name="ACTIVE_INDICATOR", nullable=false)
    public boolean isActiveIndicator() {
        return this.activeIndicator;
    }
    
    public void setActiveIndicator(boolean activeIndicator) {
        this.activeIndicator = activeIndicator;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED_DATE", nullable=false, length=19)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LAST_UPDATED", nullable=false, length=19)
    public Date getLastUpdated() {
        return this.lastUpdated;
    }
    
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    
    @Column(name="CREATED_BY")
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    
    @Column(name="UPDATED_BY")
    public Integer getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contactGroup")
    public Set<PriceBook> getPriceBooks() {
        return this.priceBooks;
    }
    
    public void setPriceBooks(Set<PriceBook> priceBooks) {
        this.priceBooks = priceBooks;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contactGroup")
    public Set<Contact> getContacts() {
        return this.contacts;
    }
    
    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }




}


