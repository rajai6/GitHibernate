package com.ikea.entites;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BdLineTId generated by hbm2java
 */
@Embeddable
public class BdLineTId implements java.io.Serializable {

    private BigDecimal bdId;
    private int bdlNo;

    public BdLineTId() {
    }

    public BdLineTId(BigDecimal bdId, int bdlNo) {
        this.bdId = bdId;
        this.bdlNo = bdlNo;
    }

    @Column(name = "BD_ID", nullable = false, scale = 0)
    public BigDecimal getBdId() {
        return this.bdId;
    }

    public void setBdId(BigDecimal bdId) {
        this.bdId = bdId;
    }

    @Column(name = "BDL_NO", nullable = false, precision = 9, scale = 0)
    public int getBdlNo() {
        return this.bdlNo;
    }

    public void setBdlNo(int bdlNo) {
        this.bdlNo = bdlNo;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof BdLineTId))
            return false;
        BdLineTId castOther = (BdLineTId) other;

        return ((this.getBdId() == castOther.getBdId()) || (this.getBdId() != null && castOther.getBdId() != null
                && this.getBdId().equals(castOther.getBdId()))) && (this.getBdlNo() == castOther.getBdlNo());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getBdId() == null ? 0 : this.getBdId().hashCode());
        result = 37 * result + this.getBdlNo();
        return result;
    }

}
