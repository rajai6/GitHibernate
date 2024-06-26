package com.ikea.entites;
// Generated Apr 12, 2021 1:23:08 AM by Hibernate Tools 5.3.6.Final


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * BdHdtcLineT generated by hbm2java
 */
public class BdHdtcLineT  implements java.io.Serializable {


     private BdHdtcLineTId id;
     private BdHdtcT bdHdtcT;
     private BigDecimal bdIdRefBasis;
     private Integer lineNoRefBasis;
     private BigDecimal netAmountOrig;
     private BigDecimal netAmount;
     private BigDecimal taxAmount1;
     private BigDecimal taxAmount2;
     private BigDecimal grossAmount1;
     private BigDecimal grossAmount2;
     private BigDecimal calcBasePrice;
     private BigDecimal calcBaseValue;
     private String hdtcLineCurrency;
     private Byte calcBaseUomId;
     private String billingCode;
     private Set bdHdtcTaxLineTs = new HashSet(0);

    public BdHdtcLineT() {
    }

	
    public BdHdtcLineT(BdHdtcLineTId id, BdHdtcT bdHdtcT) {
        this.id = id;
        this.bdHdtcT = bdHdtcT;
    }
    public BdHdtcLineT(BdHdtcLineTId id, BdHdtcT bdHdtcT, BigDecimal bdIdRefBasis, Integer lineNoRefBasis, BigDecimal netAmountOrig, BigDecimal netAmount, BigDecimal taxAmount1, BigDecimal taxAmount2, BigDecimal grossAmount1, BigDecimal grossAmount2, BigDecimal calcBasePrice, BigDecimal calcBaseValue, String hdtcLineCurrency, Byte calcBaseUomId, String billingCode, Set bdHdtcTaxLineTs) {
       this.id = id;
       this.bdHdtcT = bdHdtcT;
       this.bdIdRefBasis = bdIdRefBasis;
       this.lineNoRefBasis = lineNoRefBasis;
       this.netAmountOrig = netAmountOrig;
       this.netAmount = netAmount;
       this.taxAmount1 = taxAmount1;
       this.taxAmount2 = taxAmount2;
       this.grossAmount1 = grossAmount1;
       this.grossAmount2 = grossAmount2;
       this.calcBasePrice = calcBasePrice;
       this.calcBaseValue = calcBaseValue;
       this.hdtcLineCurrency = hdtcLineCurrency;
       this.calcBaseUomId = calcBaseUomId;
       this.billingCode = billingCode;
       this.bdHdtcTaxLineTs = bdHdtcTaxLineTs;
    }
   
    public BdHdtcLineTId getId() {
        return this.id;
    }
    
    public void setId(BdHdtcLineTId id) {
        this.id = id;
    }
    public BdHdtcT getBdHdtcT() {
        return this.bdHdtcT;
    }
    
    public void setBdHdtcT(BdHdtcT bdHdtcT) {
        this.bdHdtcT = bdHdtcT;
    }
    public BigDecimal getBdIdRefBasis() {
        return this.bdIdRefBasis;
    }
    
    public void setBdIdRefBasis(BigDecimal bdIdRefBasis) {
        this.bdIdRefBasis = bdIdRefBasis;
    }
    public Integer getLineNoRefBasis() {
        return this.lineNoRefBasis;
    }
    
    public void setLineNoRefBasis(Integer lineNoRefBasis) {
        this.lineNoRefBasis = lineNoRefBasis;
    }
    public BigDecimal getNetAmountOrig() {
        return this.netAmountOrig;
    }
    
    public void setNetAmountOrig(BigDecimal netAmountOrig) {
        this.netAmountOrig = netAmountOrig;
    }
    public BigDecimal getNetAmount() {
        return this.netAmount;
    }
    
    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }
    public BigDecimal getTaxAmount1() {
        return this.taxAmount1;
    }
    
    public void setTaxAmount1(BigDecimal taxAmount1) {
        this.taxAmount1 = taxAmount1;
    }
    public BigDecimal getTaxAmount2() {
        return this.taxAmount2;
    }
    
    public void setTaxAmount2(BigDecimal taxAmount2) {
        this.taxAmount2 = taxAmount2;
    }
    public BigDecimal getGrossAmount1() {
        return this.grossAmount1;
    }
    
    public void setGrossAmount1(BigDecimal grossAmount1) {
        this.grossAmount1 = grossAmount1;
    }
    public BigDecimal getGrossAmount2() {
        return this.grossAmount2;
    }
    
    public void setGrossAmount2(BigDecimal grossAmount2) {
        this.grossAmount2 = grossAmount2;
    }
    public BigDecimal getCalcBasePrice() {
        return this.calcBasePrice;
    }
    
    public void setCalcBasePrice(BigDecimal calcBasePrice) {
        this.calcBasePrice = calcBasePrice;
    }
    public BigDecimal getCalcBaseValue() {
        return this.calcBaseValue;
    }
    
    public void setCalcBaseValue(BigDecimal calcBaseValue) {
        this.calcBaseValue = calcBaseValue;
    }
    public String getHdtcLineCurrency() {
        return this.hdtcLineCurrency;
    }
    
    public void setHdtcLineCurrency(String hdtcLineCurrency) {
        this.hdtcLineCurrency = hdtcLineCurrency;
    }
    public Byte getCalcBaseUomId() {
        return this.calcBaseUomId;
    }
    
    public void setCalcBaseUomId(Byte calcBaseUomId) {
        this.calcBaseUomId = calcBaseUomId;
    }
    public String getBillingCode() {
        return this.billingCode;
    }
    
    public void setBillingCode(String billingCode) {
        this.billingCode = billingCode;
    }
    public Set getBdHdtcTaxLineTs() {
        return this.bdHdtcTaxLineTs;
    }
    
    public void setBdHdtcTaxLineTs(Set bdHdtcTaxLineTs) {
        this.bdHdtcTaxLineTs = bdHdtcTaxLineTs;
    }




}


