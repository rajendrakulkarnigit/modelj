package com.hsbc.gpb.sil.message.web.struts.form;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import java.util.List;
import java.util.Date;
import com.maa.core.web.struts.form.BaseActionForm;
import com.hsbc.gpb.sil.message.model.AccountBalanceModel;


/**
 * The ActionForm object is used to hold and validate values for the 
 * accountBalance form.
 */
public class AccountBalanceForm extends BaseActionForm
{

    // attributes
	
    // the accountbalanceid
    private Integer accountBalanceId;

	private List accountBalanceList;
	public List getAccountBalanceList() { return accountBalanceList; }
	public void setAccountBalanceList (List accountBalanceList) { this.accountBalanceList = accountBalanceList; }

    // relationship attributes

    
    /**
     * Returns the value of the accountBalanceId
     * @return the accountBalanceId
     */
    public Integer getAccountBalanceId() {
    	return accountBalanceId;
    }

    /**
     * Sets the value of the accountBalanceId
     * @param accountBalanceId the accountBalanceId
     */
    public void setAccountBalanceId(Integer accountBalanceId) {
    	this.accountBalanceId = accountBalanceId;
    }


    // relationship getter/setters

    /**
     * Validate the submitted values 
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
	return errors;
    } 

    /**
     * This resets all the form values back to defaults, part of struts framework
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
//        accountBalanceId = new Integer(0);

  	} 

  	public AccountBalanceModel populateModel () {
		AccountBalanceModel model = new AccountBalanceModel();
        model.setAccountBalanceId(accountBalanceId);
        
        System.out.println(model);
        return model;
  	}

  	public void populateForm(AccountBalanceModel model) {
		accountBalanceId = model.getAccountBalanceId();
		System.out.println(this);
  	}

    /**
     * A toString method that can be used in any class.
     * uses reflection to dynamically print java class field values one line at a time.
     * Requires the Apache Commons ToStringBuilder class.
     */
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
        ToStringStyle.MULTI_LINE_STYLE);
    }

} // end of AccountBalanceForm