package com.hsbc.gpb.sil.message.dao;

import java.sql.SQLException;
import java.util.*;
import com.maa.core.exception.BusinessException;
import com.hsbc.gpb.sil.message.model.AccountBalanceModel;

/**
 * DAO Interface for the AccountBalance. 
 */
public interface AccountBalanceDAO {

    public void add (AccountBalanceModel model) throws BusinessException;
	
    public void update (AccountBalanceModel model) throws BusinessException;
    
    public void delete(String[] accountBalanceIds)  throws BusinessException;
    
    public List findAll() throws BusinessException;
    
    public AccountBalanceModel findByPrimaryKey(Integer id) throws BusinessException;
    
    public List findByPropertyValues (AccountBalanceModel accountBalanceModel) throws BusinessException;
    
} // end AccountBalanceDAO