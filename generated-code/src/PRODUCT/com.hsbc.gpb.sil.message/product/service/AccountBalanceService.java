package com.hsbc.gpb.sil.message.service;

import java.util.*;

import com.maa.core.exception.AddException;
import com.maa.core.exception.BusinessException;
import com.maa.core.exception.DeleteException;
import com.maa.core.exception.NotFoundException;
import com.maa.core.exception.UpdateException;

import com.maa.core.exception.BusinessException;

import com.hsbc.gpb.sil.message.model.AccountBalanceModel;

/**
 * Business Service Interface for accountBalance. 
 */
public interface AccountBalanceService {
	/**
	 * Add model.
	 * @param model The model object
	 */
    public void add (AccountBalanceModel model) throws AddException;
    
	/**
	 * Update model.
	 * @param model The model object
	 */
    public void update (AccountBalanceModel model) throws UpdateException;

	/**
	 * Delete model.
	 * @param ids Array of ids to Delete
	 */
    public void delete(String[] accountBalanceIds) throws BusinessException,DeleteException;
    
	/**
	 * Find by Primary Key
	 * @param id The primary key
	 */
    public AccountBalanceModel findByPrimaryKey(Integer id) throws NotFoundException;
    
	/**
	 * Find by query filter.
	 * @param model The model object containing filter values
	 */
    public List findByPropertyValues (AccountBalanceModel model) throws BusinessException,NotFoundException;
    
	/**
	 * Find All
	 */
    public List findAll() throws NotFoundException;
    
} // end AccountBalanceService