package com.swv.oscar.repositories.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.swv.oscar.dataobject.common.Weo0s001;
import com.swv.oscar.dataobject.common.Weo0s001BO;
import com.swv.oscar.exceptions.OscarDataAccessException;
import com.swv.oscar.repositories.IWeo0s001Repository;
import com.swv.oscar.shared.set.AppConstants;
import com.swv.oscar.util.OscarLogger;


/*************************************************************************
 *
 * SWV CONFIDENTIAL
 * _________________________________________________________________________________
 *
 * SWV is a trademark of SWV Company.
 *
 * Copyright © 2017 SWV. All rights reserved.
 *
 * NOTICE: All information contained herein is, and remains the property of SWV
 * and its suppliers, if any. The intellectual and technical concepts contained
 * herein are proprietary to SWV and its suppliers and may be covered by U.S.
 * and Foreign Patents, patents in process, and are protected by trade secret or
 * copyright law. Dissemination of this information or reproduction of this
 * material is strictly forbidden unless prior written permission is obtained
 * from SWV.
 *
 *************************************************************************/
// Author : Generated by ATMA ®
// Revision History :
@Repository
public class Weo0s001RepositoryImpl implements IWeo0s001Repository {

    private static final OscarLogger LOGGER = OscarLogger.create(Weo0s001RepositoryImpl.class);

    @PersistenceContext
    private EntityManager entityMgr;

    /*
      * Method executeNavigateOutQuery0
      * @param weo0s001BOReq
      * @return weo0s001BOResp
      * @throws OscarDataAccessException
    */
    @Override
    public Weo0s001BO executeNavigateOutQuery0(String query) throws OscarDataAccessException {
        LOGGER.debug(AppConstants.REQUEST+ query);
        Weo0s001BO  weo0s001BOResp = new Weo0s001BO();
	    system.out.print("111111111111");
        try {
        	TypedQuery<Object> typedQuery = (TypedQuery<Object>)entityMgr.createNativeQuery(query);
			List<Object>  entityList = typedQuery.getResultList();
            List<Weo0s001> bOList = new ArrayList<>();
    		if(entityList != null && !entityList.isEmpty()) {
    			for (int i = 0; i < entityList.size(); i++ ) {
    				Object[] prcSelect29 = (Object[]) entityList.get(i);
    				Weo0s001 weo0s001 = new Weo0s001();
    				weo0s001.setrPanel(prcSelect29[0].toString());
    				bOList.add(weo0s001);
    			}
    			weo0s001BOResp.setWeo0s001(bOList);
    		}
        } catch (Exception ex) {
            LOGGER.error(AppConstants.ERROR + ex);
            throw new OscarDataAccessException(ex);
        }
        LOGGER.debug(AppConstants.RESPONSE+weo0s001BOResp);
        return weo0s001BOResp;
    }
    /*
      * Method executeNavigateOutQuery1
      * @param weo0s001BOReq
      * @return weo0s001BOResp
      * @throws OscarDataAccessException
    */
    @Override
    public Weo0s001BO executeNavigateOutQuery1(String query) throws OscarDataAccessException {
        LOGGER.debug(AppConstants.REQUEST+ query);
        Weo0s001BO  weo0s001BOResp = new Weo0s001BO();
        try {
        	TypedQuery<Object> typedQuery = (TypedQuery<Object>)entityMgr.createNativeQuery(query);
			List<Object>  entityList = typedQuery.getResultList();
            List<Weo0s001> bOList = new ArrayList<>();
    		if(entityList != null && !entityList.isEmpty()) {
    			for (int i = 0; i < entityList.size(); i++ ) {
    				Object[] prcSelect29 = (Object[]) entityList.get(i);
    				Weo0s001 weo0s001 = new Weo0s001();
    				weo0s001.setrPanel(prcSelect29[0].toString());
    				bOList.add(weo0s001);
    			}
    			weo0s001BOResp.setWeo0s001(bOList);
    		}
        } catch (Exception ex) {
            LOGGER.error(AppConstants.ERROR + ex);
            throw new OscarDataAccessException(ex);
        }
        LOGGER.debug(AppConstants.RESPONSE+weo0s001BOResp);
        return weo0s001BOResp;
    }
}
