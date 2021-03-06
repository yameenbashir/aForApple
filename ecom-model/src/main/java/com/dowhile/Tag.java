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
 * Tag generated by hbm2java
 */
@Entity
@Table(name="tag"
    ,catalog="ecom"
)
public class Tag  implements java.io.Serializable {


     private Integer tagId;
     private User userByCreatedBy;
     private User userByUpdatedBy;
     private Company company;
     private String tagName;
     private boolean activeIndicator;
     private Date createdDate;
     private Date lastUpdated;
     private Set<ProductTag> productTags = new HashSet<ProductTag>(0);

    public Tag() {
    }

	
    public Tag(Company company, String tagName, boolean activeIndicator, Date createdDate, Date lastUpdated) {
        this.company = company;
        this.tagName = tagName;
        this.activeIndicator = activeIndicator;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
    }
    public Tag(User userByCreatedBy, User userByUpdatedBy, Company company, String tagName, boolean activeIndicator, Date createdDate, Date lastUpdated, Set<ProductTag> productTags) {
       this.userByCreatedBy = userByCreatedBy;
       this.userByUpdatedBy = userByUpdatedBy;
       this.company = company;
       this.tagName = tagName;
       this.activeIndicator = activeIndicator;
       this.createdDate = createdDate;
       this.lastUpdated = lastUpdated;
       this.productTags = productTags;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="TAG_ID", unique=true, nullable=false)
    public Integer getTagId() {
        return this.tagId;
    }
    
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CREATED_BY")
    public User getUserByCreatedBy() {
        return this.userByCreatedBy;
    }
    
    public void setUserByCreatedBy(User userByCreatedBy) {
        this.userByCreatedBy = userByCreatedBy;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="UPDATED_BY")
    public User getUserByUpdatedBy() {
        return this.userByUpdatedBy;
    }
    
    public void setUserByUpdatedBy(User userByUpdatedBy) {
        this.userByUpdatedBy = userByUpdatedBy;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COMPANY_ASSOCIATION_ID", nullable=false)
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }

    
    @Column(name="TAG_NAME", nullable=false, length=200)
    public String getTagName() {
        return this.tagName;
    }
    
    public void setTagName(String tagName) {
        this.tagName = tagName;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="tag")
    public Set<ProductTag> getProductTags() {
        return this.productTags;
    }
    
    public void setProductTags(Set<ProductTag> productTags) {
        this.productTags = productTags;
    }




}


