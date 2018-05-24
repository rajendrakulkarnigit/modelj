package com.hsbc.gpb.sil.message.model;
import java.util.Date;
import com.maa.core.model.BaseModel;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Data model for AccountBalance.
 */
public class AccountBalanceModel extends BaseModel {

    // the accountbalanceid
    private Integer accountBalanceId;

    // relationships

    // attribute getters/setters
    /**
     * Returns the value of the accountBalanceId
     * @return The accountBalanceId
     */
    public Integer getAccountBalanceId() {
    	return accountBalanceId;
    }

    /**
     * Sets the value of the accountBalanceId
     * @param accountBalanceId The accountBalanceId
     */
    public void setAccountBalanceId(Integer accountBalanceId) {
    	this.accountBalanceId = accountBalanceId;
    }

    // relationship getters/setters

    /**
     * A toString method that can be used in any class.
     * uses reflection to dynamically print java class field values one line at a time.
     * Requires the Apache Commons ToStringBuilder class.
     */
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
       	ToStringStyle.MULTI_LINE_STYLE);
    }

} // end AccountBalanceModel