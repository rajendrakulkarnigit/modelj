package com.hsbc.gpb.sil.message.web.struts.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.maa.core.web.struts.action.BaseDispatchAction;
import com.maa.core.service.spring.ServiceFinder;
import com.hsbc.gpb.sil.message.service.AccountBalanceService;
import com.hsbc.gpb.sil.message.web.struts.form.AccountBalanceForm;
import com.hsbc.gpb.sil.message.model.AccountBalanceModel;
import com.maa.core.exception.BusinessException;
import com.maa.core.exception.ExceptionConstant;
import com.maa.core.log.BaseLogger;
import com.maa.core.exception.AddException;
import com.maa.core.exception.BusinessException;
import com.maa.core.exception.DeleteException;
import com.maa.core.exception.NotFoundException;
import com.maa.core.exception.UpdateException;

/**
 * Action class handles various actions AccountBalance 
 */
public class AccountBalanceAction extends BaseDispatchAction {

	private static final BaseLogger log = BaseLogger.getInstance(AccountBalanceAction.class);

	private AccountBalanceService accountBalanceService;

	public AccountBalanceService getAccountBalanceService(){
		return accountBalanceService;
	}
	
	public void setAccountBalanceService (AccountBalanceService accountBalanceService) {
		this.accountBalanceService = accountBalanceService; 
	}

	public AccountBalanceAction() {
		
	}
	
	public ActionForward dashboard(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		System.out.println("Inside dashboard");		
		return mapping.findForward("DASHBOARD_ACCOUNTBALANCE");
	}

	public ActionForward showAdd(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
		ActionErrors errors = new ActionErrors();			
		try {
			System.out.println("Inside showAdd");
			request.setAttribute("addUpdateFlag", "add");
			return mapping.findForward("SHOW_ADD_ACCOUNTBALANCE");
		}
		catch (Exception e) {
			errors.add(ExceptionConstant.GENERIC_EXCEPTION,
				new ActionError(ExceptionConstant.GENERIC_EXCEPTION));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}		
	}
	
	public ActionForward saveAdd(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ActionErrors errors = new ActionErrors();			
		try {
			AccountBalanceForm accountBalanceForm = (AccountBalanceForm) form;
			accountBalanceService = (AccountBalanceService)ServiceFinder.getContext(request).getBean("accountBalanceService");
			accountBalanceService.add(accountBalanceForm.populateModel());
		}
		catch (AddException be) {
			errors.add(be.getErrorCode(),
				new ActionError(be.getErrorCode(), be.getCause().getMessage()));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}
		catch (Exception e) {
			errors.add(ExceptionConstant.GENERIC_EXCEPTION,
				new ActionError(ExceptionConstant.GENERIC_EXCEPTION));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}	
		return mapping.findForward("LIST_ACCOUNTBALANCE");
	}
	
	public ActionForward showUpdate(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		ActionErrors errors = new ActionErrors();
		request.setAttribute("addUpdateFlag", "update");
		AccountBalanceForm accountBalanceForm = (AccountBalanceForm) form;
		
		try {
			int accountBalanceId = Integer.parseInt(request.getParameter("accountBalanceId"));
			accountBalanceService = (AccountBalanceService)ServiceFinder.getContext(request).getBean("accountBalanceService");
			accountBalanceForm.populateForm(accountBalanceService.findByPrimaryKey(accountBalanceId));
		}
		catch (Exception e) {
			errors.add(ExceptionConstant.GENERIC_EXCEPTION,
				new ActionError(ExceptionConstant.GENERIC_EXCEPTION));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}			
		
		return mapping.findForward("SHOW_UPDATE_ACCOUNTBALANCE");
	}

	public ActionForward saveUpdate(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
		ActionErrors errors = new ActionErrors();			
		
		try {
			AccountBalanceForm accountBalanceForm = (AccountBalanceForm) form;
			accountBalanceService = (AccountBalanceService)ServiceFinder.getContext(request).getBean("accountBalanceService");
			accountBalanceService.update(accountBalanceForm.populateModel());
		}
		catch (UpdateException be) {
			errors.add(be.getErrorCode(),
				new ActionError(be.getErrorCode(), be.getCause().getMessage()));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}
		catch (Exception e) {
			errors.add(ExceptionConstant.GENERIC_EXCEPTION,
				new ActionError(ExceptionConstant.GENERIC_EXCEPTION));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}			
		
		return mapping.findForward("LIST_ACCOUNTBALANCE");
	}

	public ActionForward view(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
		ActionErrors errors = new ActionErrors();		

		try {
			AccountBalanceForm accountBalanceForm = (AccountBalanceForm) form;
			int accountBalanceId = Integer.parseInt(request.getParameter("accountBalanceId"));
			accountBalanceService = (AccountBalanceService) ServiceFinder.getContext(request).getBean("accountBalanceService");
			accountBalanceForm.populateForm(accountBalanceService.findByPrimaryKey(accountBalanceId));
		}
		catch (Exception e)
		{
			errors.add(ExceptionConstant.GENERIC_EXCEPTION,
				new ActionError(ExceptionConstant.GENERIC_EXCEPTION));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}	
		return mapping.findForward("VIEW_ACCOUNTBALANCE");
	}
	
	public ActionForward list(ActionMapping mapping,ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
		ActionErrors errors = new ActionErrors();		
		System.out.println("Inside search");
		AccountBalanceForm accountBalanceForm = (AccountBalanceForm) form;
		AccountBalanceModel model = new AccountBalanceModel();
		
		String pattern = "DD/mm/yyyy";
		Locale locale = Locale.getDefault();
		DateLocaleConverter converter = new DateLocaleConverter(locale,pattern);
		converter.setLenient(true);
		ConvertUtils.register(converter, java.util.Date.class);
		
		String strError = "";
		AccountBalanceService accountBalanceService = (AccountBalanceService) ServiceFinder.getContext(request).getBean("accountBalanceService");
	
		List accountBalanceList = new ArrayList();
		
		try {
			accountBalanceForm.setAccountBalanceList(accountBalanceService.findAll());
		} 
		catch (Exception e) {
			errors.add(ExceptionConstant.GENERIC_EXCEPTION,
				new ActionError(ExceptionConstant.GENERIC_EXCEPTION));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}		
		
		return mapping.findForward("LIST_ACCOUNTBALANCE");

	}
	


	public ActionForward search(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
		ActionErrors errors = new ActionErrors();		
		System.out.println("Inside search");
		AccountBalanceForm accountBalanceForm = (AccountBalanceForm) form;
		AccountBalanceModel accountBalance = new AccountBalanceModel();
		
		String pattern = "DD/mm/yyyy";
		Locale locale = Locale.getDefault();
		DateLocaleConverter converter = new DateLocaleConverter(locale,pattern);
		converter.setLenient(true);
		ConvertUtils.register(converter, java.util.Date.class);
		
		String strError = "";
		AccountBalanceService accountBalanceService = (AccountBalanceService)ServiceFinder.getContext(request).getBean("accountBalanceService");
		List accountBalanceList = new ArrayList();
		
		try {
			//mapFormToBean(accountBalanceForm,accountBalance);
			accountBalanceForm.setAccountBalanceList( accountBalanceService.findByPropertyValues(accountBalance));
			
		} 
		catch (BusinessException be) {
			errors.add(be.getErrorCode(),
				new ActionError(be.getErrorCode(), be.getCause().getMessage()));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}
		catch (Exception e) {
			errors.add(ExceptionConstant.GENERIC_EXCEPTION,
				new ActionError(ExceptionConstant.GENERIC_EXCEPTION));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}		
		
		return mapping.findForward("LIST_ACCOUNTBALANCE");
	}
	

	public ActionForward delete(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
		System.out.println("Inside delete");
		
		ActionErrors errors = new ActionErrors();
		
		try {
			AccountBalanceForm accountBalanceForm = (AccountBalanceForm) form;
			accountBalanceService = (AccountBalanceService)ServiceFinder.getContext(request).getBean("accountBalanceService");
			System.out.println("CheckBox Values" + accountBalanceForm.getAccountBalanceIds());
			accountBalanceService.delete(accountBalanceForm.getAccountBalanceIds());
		}
		catch (BusinessException be) {
			errors.add(be.getErrorCode(),
				new ActionError(be.getErrorCode(), be.getCause().getMessage()));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}
		catch (Exception e) {
			errors.add(ExceptionConstant.GENERIC_EXCEPTION,
				new ActionError(ExceptionConstant.GENERIC_EXCEPTION));
			saveErrors(request, errors);
			return mapping.findForward("LIST_ACCOUNTBALANCE");
		}				
		
		return mapping.findForward("LIST_ACCOUNTBALANCE");
	}
     
	private void resetForm(AccountBalanceForm form) {
	}

	private ActionErrors validate(AccountBalanceForm form, int subaction) {
		ActionErrors errors = new ActionErrors();
		return errors;
	}
}
