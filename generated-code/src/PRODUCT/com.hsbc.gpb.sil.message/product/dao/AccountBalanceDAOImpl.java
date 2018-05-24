package com.hsbc.gpb.sil.message.dao;

import java.util.*;
import java.sql.SQLException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.maa.core.log.BaseLogger;
import com.maa.core.exception.BusinessException;
import com.maa.core.log.BaseLogger;
import com.hsbc.gpb.sil.message.model.AccountBalanceModel;

/**
 * DAO Interface for the accountBalance. 
 */
public class AccountBalanceDAOImpl extends HibernateDaoSupport implements AccountBalanceDAO {

    private static final BaseLogger log = BaseLogger.getInstance(AccountBalanceDAOImpl.class);
    
    private Connection conn;
    
    public Connection getConnection() {
        conn = this.getSession().connection();
        return conn;
    }
    
    public void add (AccountBalanceModel model) throws BusinessException {
		getHibernateTemplate().save(model);
		log.debug("save successful");
    }

    public void update (AccountBalanceModel model) throws BusinessException {
        getHibernateTemplate().update(model);
    }

    public void delete(Integer id) throws BusinessException {
		getHibernateTemplate().delete(id);
    }

    public void delete(String[] accountBalanceIds) throws BusinessException {
	
		Connection conn = getConnection();
		String accountBalanceList ="";
		for(String accountBalance:accountBalanceIds) {
			accountBalanceList+=accountBalance+",";
		}
	
		accountBalanceList = accountBalanceList.substring(0, accountBalanceList.lastIndexOf(','));
	
		String query = null;
	
		try {
			Statement smt = conn.createStatement();
		
									System.out.println("delete Query = "+query);
			smt.executeUpdate(query);
			smt.close();
			conn.close();
		} 
		catch (SQLException sqe) {
			log.error(sqe.toString(), sqe.getCause());
			throw new BusinessException("error text", sqe);
    	}
		catch(Exception e){
			log.error(e.getMessage(), e);
		}    	
    }

    public AccountBalanceModel findByPrimaryKey(Integer id) throws BusinessException {
		return (AccountBalanceModel) getHibernateTemplate().get("com.hsbc.gpb.sil.message.model.AccountBalanceModel", id);
    }

    public List findByPropertyValues (AccountBalanceModel model) throws BusinessException {
		// model.setDeleteFlag("f");
		return getHibernateTemplate().findByExample(model);
    }

    public List findByProperty(String propertyName, Object value) throws BusinessException {
		String queryString = " from AccountBalanceModel as AccountBalanceModel "
			+ " where AccountBalanceModel." + propertyName + "= ?";
		return getHibernateTemplate().find(queryString, value);
    }

    public List findAll() throws BusinessException {
		String queryString = " from AccountBalanceModel as AccountBalanceModel ";
		return getHibernateTemplate().find(queryString);
    }
} // end AccountBalanceDAO