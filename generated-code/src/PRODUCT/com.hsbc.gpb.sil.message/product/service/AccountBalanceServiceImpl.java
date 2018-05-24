package com.hsbc.gpb.sil.message.service;

import java.util.List;
import com.maa.core.exception.BusinessException;
import com.maa.core.exception.ExceptionConstant;
import com.maa.core.log.BaseLogger;

import com.hsbc.gpb.sil.message.dao.AccountBalanceDAO;
import com.hsbc.gpb.sil.message.model.AccountBalanceModel;
import com.maa.core.exception.AddException;
import com.maa.core.exception.DeleteException;
import com.maa.core.exception.DuplicateException;
import com.maa.core.exception.NotFoundException;
import com.maa.core.exception.UpdateException;

public class AccountBalanceServiceImpl 
	implements AccountBalanceService{

	private static final BaseLogger log = BaseLogger.getInstance(AccountBalanceServiceImpl.class);
	
	private AccountBalanceDAO accountBalanceDAO;
	
	public AccountBalanceDAO getAccountBalanceDAO(){
		return accountBalanceDAO;
	}
	
	public void setAccountBalanceDAO (AccountBalanceDAO accountBalanceDAO) {
		this.accountBalanceDAO = accountBalanceDAO; 
	}

	public void add (AccountBalanceModel model) 
		throws AddException {

		try {
			accountBalanceDAO.add(model);
		}
		catch (BusinessException be) {
			log.error(be.toString(), be.getCause());
			throw new AddException(be.getMessage(), be);
		}
		catch (Exception ex) {
			log.error(ex.toString(), ex.getCause());
			throw new AddException(ExceptionConstant.ADD_EXCEPTION, ex);
		}		
	}

	public void update(AccountBalanceModel model) 
		throws UpdateException {
		
		try {
			accountBalanceDAO.update(model);
		}
		catch (BusinessException be) {
			log.error(be.toString(), be.getCause());
			throw new UpdateException(be.getMessage(), be);
		}
		catch (Exception ex) {
			log.error(ex.toString(), ex.getCause());
			throw new UpdateException(ExceptionConstant.UPDATE_EXCEPTION, ex);
		}	
	}

	public void delete(String[] accountBalanceIds) 
		throws BusinessException, DeleteException {
		
		try {
			accountBalanceDAO.delete(accountBalanceIds);
		}
		catch (BusinessException be) {
			log.error(be.toString(), be.getCause());
			throw new BusinessException(be.getMessage(), be);
		}
		catch (Exception ex) {
			log.error(ex.toString(), ex.getCause());
			throw new DeleteException(ExceptionConstant.DELETE_EXCEPTION, ex);
		}
	}
	
	public AccountBalanceModel findByPrimaryKey(Integer id) 
		throws NotFoundException {
		
		try {
			return accountBalanceDAO.findByPrimaryKey(id);
		} 
		catch (BusinessException be) {
			log.error(be.toString(), be.getCause());
			throw new NotFoundException(be.getMessage(), be);
		}
		catch (Exception ex) {
			log.error(ex.toString(), ex.getCause());
			throw new NotFoundException(ExceptionConstant.NOTFOUND_EXCEPTION, ex);
		}	
	}
	
	public List findByPropertyValues(AccountBalanceModel model) 
		throws BusinessException,NotFoundException {
		
		try {
			return accountBalanceDAO.findByPropertyValues(model);
		}
		catch (BusinessException be) {
			log.error(be.toString(), be.getCause());
			throw new NotFoundException(be.getMessage(), be);
		}
		catch (Exception ex) {
			log.error(ex.toString(), ex.getCause());
			throw new NotFoundException(ExceptionConstant.NOTFOUND_EXCEPTION, ex);
		}
	}
	
	public List findAll() 
		throws NotFoundException  {
		
		try {
			return accountBalanceDAO.findAll();
		}
		catch (BusinessException be) {
			log.error(be.toString(), be.getCause());
			throw new NotFoundException(be.getMessage(), be);
		}
		catch (Exception ex) {
			log.error(ex.toString(), ex.getCause());
			throw new NotFoundException(ExceptionConstant.NOTFOUND_EXCEPTION, ex);
		}	
	}
}
