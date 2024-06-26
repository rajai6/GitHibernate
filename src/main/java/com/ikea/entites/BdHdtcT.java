package com.ikea.entites;
// Generated Apr 12, 2021 1:23:08 AM by Hibernate Tools 5.3.6.Final


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * BdHdtcT generated by hbm2java
 */
public class BdHdtcT  implements java.io.Serializable {


     private BigDecimal bdId;
     private BdT bdT;
     private Short tariffTypeId;
     private String currencyCode;
     private Byte delMethodId;
     private Byte calcRefId;
     private BigDecimal totalNetAmount;
     private BigDecimal totalTaxAmount;
     private BigDecimal totalGrossAmount;
     private Set bdHdtcLineTs = new HashSet(0);

    public BdHdtcT() {
    }

	
    public BdHdtcT(BdT bdT) {
        this.bdT = bdT;
    }
    public BdHdtcT(BdT bdT, Short tariffTypeId, String currencyCode, Byte delMethodId, Byte calcRefId, BigDecimal totalNetAmount, BigDecimal totalTaxAmount, BigDecimal totalGrossAmount, Set bdHdtcLineTs) {
       this.bdT = bdT;
       this.tariffTypeId = tariffTypeId;
       this.currencyCode = currencyCode;
       this.delMethodId = delMethodId;
       this.calcRefId = calcRefId;
       this.totalNetAmount = totalNetAmount;
       this.totalTaxAmount = totalTaxAmount;
       this.totalGrossAmount = totalGrossAmount;
       this.bdHdtcLineTs = bdHdtcLineTs;
    }
   
    public BigDecimal getBdId() {
        return this.bdId;
    }
    
    public void setBdId(BigDecimal bdId) {
        this.bdId = bdId;
    }
    public BdT getBdT() {
        return this.bdT;
    }
    
    public void setBdT(BdT bdT) {
        this.bdT = bdT;
    }
    public Short getTariffTypeId() {
        return this.tariffTypeId;
    }
    
    public void setTariffTypeId(Short tariffTypeId) {
        this.tariffTypeId = tariffTypeId;
    }
    public String getCurrencyCode() {
        return this.currencyCode;
    }
    
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public Byte getDelMethodId() {
        return this.delMethodId;
    }
    
    public void setDelMethodId(Byte delMethodId) {
        this.delMethodId = delMethodId;
    }
    public Byte getCalcRefId() {
        return this.calcRefId;
    }
    
    public void setCalcRefId(Byte calcRefId) {
        this.calcRefId = calcRefId;
    }
    public BigDecimal getTotalNetAmount() {
        return this.totalNetAmount;
    }
    
    public void setTotalNetAmount(BigDecimal totalNetAmount) {
        this.totalNetAmount = totalNetAmount;
    }
    public BigDecimal getTotalTaxAmount() {
        return this.totalTaxAmount;
    }
    
    public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }
    public BigDecimal getTotalGrossAmount() {
        return this.totalGrossAmount;
    }
    
    public void setTotalGrossAmount(BigDecimal totalGrossAmount) {
        this.totalGrossAmount = totalGrossAmount;
    }
    public Set getBdHdtcLineTs() {
        return this.bdHdtcLineTs;
    }
    
    public void setBdHdtcLineTs(Set bdHdtcLineTs) {
        this.bdHdtcLineTs = bdHdtcLineTs;
    }




}


