package com.swv.oscar.repositories.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.swv.oscar.dataobject.batch.Weo2nfyr;
import com.swv.oscar.dataobject.batch.Weo2nfyrBO;
import com.swv.oscar.exceptions.OscarDataAccessException;
import com.swv.oscar.repositories.IWeo2nfyrRepository;
import com.swv.oscar.shared.set.AppConstants;
import com.swv.oscar.util.OscarLogger;

/*************************************************************************
 *
 * SWV CONFIDENTIAL
 * _________________________________________________________________________________
 *
 * SWV is a trademark of SWV Company.
 *
 *Copyright © 2017 SWV. All rights reserved.
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
public class Weo2nfyrRepositoryImpl implements IWeo2nfyrRepository {

    private static final OscarLogger LOGGER = OscarLogger.create(Weo2nfyrRepositoryImpl.class);

    @PersistenceContext
    private EntityManager entityMgr;

    /*
      * Method executeQuery0
      * @param weo2nfyrBOReq
      * @return weo2nfyrBOResp
      * @throws OscarDataAccessException
    */
    @Override
    public Weo2nfyrBO executeQuery0(String query) throws OscarDataAccessException {
        LOGGER.debug(AppConstants.REQUEST+ query);
        Weo2nfyrBO  weo2nfyrBOResp = new Weo2nfyrBO();
        List<Weo2nfyr> bOList = new ArrayList<>();
        try {
            TypedQuery<Object> typedQuery = (TypedQuery<Object>)entityMgr.createNativeQuery(query);
            List<Object>  entityList = typedQuery.getResultList();
            if(entityList != null && !entityList.isEmpty()){
				for(Object weovocse157Local : entityList){
					Object objectLocal = (Object) weovocse157Local;
					Weo2nfyr weo2nfyr = new Weo2nfyr();
					if(objectLocal != null){
						weo2nfyr.setTodaysDate(objectLocal.toString().trim());
					}
					bOList.add(weo2nfyr);
				}
				weo2nfyrBOResp.setWeo2nfyr(bOList);
			}
        } catch (Exception ex) {
            LOGGER.error(AppConstants.ERROR + ex);
            throw new OscarDataAccessException(ex);
        }
        LOGGER.debug(AppConstants.RESPONSE+weo2nfyrBOResp);
        return weo2nfyrBOResp;
    }
}