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
 * AccountType generated by hbm2java
 */
@Entity
@Table(name="account_type"
    ,catalog="ecom"
)
public class AccountType  implements java.io.Serializable {


     private Integer accountTypeId;
     private User userByCreatedBy;
     private User userByUpdatedBy;
     private Company company;
     private String accountTypeName;
     private boolean mainAccountTypeIndicator;
     private boolean activeIndicator;
     private Date createdDate;
     private Date lastUpdated;
     private Set<ChartOfAccount> chartOfAccounts = new HashSet<ChartOfAccount>(0);

    public AccountType() {
    }

	
    public AccountType(User userByCreatedBy, User userByUpdatedBy, Company company, String accountTypeName, boolean mainAccountTypeIndicator, boolean activeIndicator, Date createdDate, Date lastUpdated) {
        this.userByCreatedBy = userByCreatedBy;
        this.userByUpdatedBy = userByUpdatedBy;
        this.company = company;
        this.accountTypeName = accountTypeName;
        this.mainAccountTypeIndicator = mainAccountTypeIndicator;
        this.activeIndicator = activeIndicator;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
    }
    public AccountType(User userByCreatedBy, User userByUpdatedBy, Company company, String accountTypeName, boolean mainAccountTypeIndicator, boolean activeIndicator, Date createdDate, Date lastUpdated, Set<ChartOfAccount> chartOfAccounts) {
       this.userByCreatedBy = userByCreatedBy;
       this.userByUpdatedBy = userByUpdatedBy;
       this.company = company;
       this.accountTypeName = accountTypeName;
       this.mainAccountTypeIndicator = mainAccountTypeIndicator;
       this.activeIndicator = activeIndicator;
       this.createdDate = createdDate;
       this.lastUpdated = lastUpdated;
       this.chartOfAccounts = chartOfAccounts;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ACCOUNT_TYPE_ID", unique=true, nullable=false)
    public Integer getAccountTypeId() {
        return this.accountTypeId;
    }
    
    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CREATED_BY", nullable=false)
    public User getUserByCreatedBy() {
        return this.userByCreatedBy;
    }
    
    public void setUserByCreatedBy(User userByCreatedBy) {
        this.userByCreatedBy = userByCreatedBy;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="UPDATED_BY", nullable=false)
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

    
    @Column(name="ACCOUNT_TYPE_NAME", nullable=false, length=256)
    public String getAccountTypeName() {
        return this.accountTypeName;
    }
    
    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    
    @Column(name="MAIN_ACCOUNT_TYPE_INDICATOR", nullable=false)
    public boolean isMainAccountTypeIndicator() {
        return this.mainAccountTypeIndicator;
    }
    
    public void setMainAccountTypeIndicator(boolean mainAccountTypeIndicator) {
        this.mainAccountTypeIndicator = mainAccountTypeIndicator;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="accountType")
    public Set<ChartOfAccount> getChartOfAccounts() {
        return this.chartOfAccounts;
    }
    
    public void setChartOfAccounts(Set<ChartOfAccount> chartOfAccounts) {
        this.chartOfAccounts = chartOfAccounts;
    }




}


