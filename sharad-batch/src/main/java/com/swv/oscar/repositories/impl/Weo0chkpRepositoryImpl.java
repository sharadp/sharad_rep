package com.swv.oscar.repositories.impl;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.swv.oscar.dataobject.batch.Weo0chkpBO;
import com.swv.oscar.dataobject.common.Global;
import com.swv.oscar.domain.entity.WeovcheckptData2;
import com.swv.oscar.domain.entity.WeovrestartData2;
import com.swv.oscar.exceptions.OscarDataAccessException;
import com.swv.oscar.repositories.IWeo0chkpRepository;
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
public class Weo0chkpRepositoryImpl implements IWeo0chkpRepository {

	private static final OscarLogger LOGGER = OscarLogger.create(Weo0chkpRepositoryImpl.class);

	@PersistenceContext
	private EntityManager entityMgr;

	/*
	 * Method executeQuery0
	 * @param weo0chkpBOReq
	 * @return weo0chkpBOResp
	 * @throws OscarDataAccessException
	 */
	@Override
	public Weo0chkpBO executeQuery0(String query) throws OscarDataAccessException {
		LOGGER.debug(AppConstants.REQUEST+ query);
		Weo0chkpBO  weo0chkpBOResp = new Weo0chkpBO();
		Global globalLocal = new Global();
		try {
			TypedQuery<Object> typedQuery = (TypedQuery<Object>)entityMgr.createNativeQuery(query);
			List<Object>  entityList = typedQuery.getResultList();
			if(entityList != null && !entityList.isEmpty()){
				for(Object weovcheckptData2Local : entityList){
					Object[] objectLocal = (Object[]) weovcheckptData2Local;
					if(objectLocal[0] != null){
						globalLocal.setgCommitMax(Integer.valueOf(objectLocal[0].toString().trim()));
					}
					if(objectLocal[1] != null){
						globalLocal.setgStartTime(objectLocal[1].toString().trim());
					}
				}
				weo0chkpBOResp.setGlobal(globalLocal);
			}
		} catch (Exception ex) {
			LOGGER.error(AppConstants.ERROR + ex);
			throw new OscarDataAccessException(ex);
		}
		LOGGER.debug(AppConstants.RESPONSE+weo0chkpBOResp);
		return weo0chkpBOResp;
	}
	/*
	 * Method executeQuery1
	 * @param weo0chkpBOReq
	 * @return weo0chkpBOResp
	 * @throws OscarDataAccessException
	 */
	@Override
	@Transactional
	public Weo0chkpBO executeQuery1(String query) throws OscarDataAccessException {
		LOGGER.debug(AppConstants.REQUEST+ query);
		Weo0chkpBO  weo0chkpBOResp = new Weo0chkpBO();
		Global global = new Global();
		try {
			TypedQuery<WeovcheckptData2> typedQuery = (TypedQuery<WeovcheckptData2>)entityMgr.createNativeQuery(query,WeovcheckptData2.class);
			int result = typedQuery.executeUpdate();
			global.setgRc(result);
			weo0chkpBOResp.setGlobal(global);
		} catch (Exception ex) {
			LOGGER.error(AppConstants.ERROR + ex);
			throw new OscarDataAccessException(ex);
		}
		LOGGER.debug(AppConstants.RESPONSE+weo0chkpBOResp);
		return weo0chkpBOResp;
	}
	/*
	 * Method executeQuery2
	 * @param weo0chkpBOReq
	 * @return weo0chkpBOResp
	 * @throws OscarDataAccessException
	 */
	@Override
	public Weo0chkpBO executeQuery2(String query) throws OscarDataAccessException {
		LOGGER.debug(AppConstants.REQUEST+ query);
		Weo0chkpBO  weo0chkpBOResp = new Weo0chkpBO();
		Global globalLocal = new Global();
		try {
			TypedQuery<Object> typedQuery = (TypedQuery<Object>)entityMgr.createNativeQuery(query);
			List<Object>  entityList = typedQuery.getResultList();
			if(entityList != null && !entityList.isEmpty()){
				for(Object weovrestartData2Local : entityList){
					Object[] objectLocal = (Object[]) weovrestartData2Local;
					if(objectLocal[0] != null ){
						globalLocal.setgTodaysDt(Date.valueOf(objectLocal[0].toString().trim()));
					}
					if(objectLocal[1] != null ){
						globalLocal.setgCommitData(objectLocal[1].toString().trim());
					}
					if(objectLocal[2] != null ){
						globalLocal.setgStartTime(objectLocal[2].toString().trim());
					}
					if(objectLocal[3] != null ){
						globalLocal.setgEndTime(objectLocal[3].toString().trim());
					}
				}
				weo0chkpBOResp.setGlobal(globalLocal);
			}
		} catch (Exception ex) {
			LOGGER.error(AppConstants.ERROR + ex);
			throw new OscarDataAccessException(ex);
		}
		LOGGER.debug(AppConstants.RESPONSE+weo0chkpBOResp);
		return weo0chkpBOResp;
	}
	/*
	 * Method executeQuery3
	 * @param weo0chkpBOReq
	 * @return weo0chkpBOResp
	 * @throws OscarDataAccessException
	 */
	@Override
	@Transactional
	public Weo0chkpBO executeQuery3(String query) throws OscarDataAccessException {
		LOGGER.debug(AppConstants.REQUEST+ query);
		Weo0chkpBO  weo0chkpBOResp = new Weo0chkpBO();
		try {
			TypedQuery<WeovrestartData2> typedQuery = (TypedQuery<WeovrestartData2>)entityMgr.createNativeQuery(query,WeovrestartData2.class);
			typedQuery.executeUpdate();
		} catch (Exception ex) {
			LOGGER.error(AppConstants.ERROR + ex);
			throw new OscarDataAccessException(ex);
		}
		LOGGER.debug(AppConstants.RESPONSE+weo0chkpBOResp);
		return weo0chkpBOResp;
	}
}