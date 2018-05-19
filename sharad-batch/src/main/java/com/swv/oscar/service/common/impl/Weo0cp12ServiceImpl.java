package com.swv.oscar.service.common.impl;

import org.springframework.stereotype.Service;

import com.swv.oscar.dataobject.common.BaseBO;
import com.swv.oscar.dataobject.common.Weo0cp12BO;
import com.swv.oscar.exceptions.OscarBusinessException;
import com.swv.oscar.service.common.IWeo0cp12Service;
import com.swv.oscar.shared.set.AppConstants;
import com.swv.oscar.util.NaturalUtil;
import com.swv.oscar.util.OscarLogger;

/*************************************************************************
 *
 * SWV CONFIDENTIAL
 * _________________________________________________________________________________
 *
 * SWV is a trademark of SWV Company.
 *
 * Copyright � 2017 SWV. All rights reserved.
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
// Author : Generated by ATMA �
// Revision History :
@Service
public class Weo0cp12ServiceImpl implements IWeo0cp12Service {

	private static final OscarLogger LOGGER = OscarLogger.create(Weo0cp12ServiceImpl.class);

	String query = null;

	/**
	 * Method execute
	 * 
	 * @param weo0cp12BOReq
	 * @return weo0cp12BOResp
	 * @throws OscarBusinessException
	 */
	public Weo0cp12BO execute(BaseBO weo0cp12BOReq) throws OscarBusinessException {
		LOGGER.debug(AppConstants.REQUEST + weo0cp12BOReq);
		Weo0cp12BO weo0cp12BOResp = null;
		try {
			 /*TODO need to find a way to Do this 	Weo0cp12 weo0cp12 = (Weo0cp12) weo0cp12BOReq.getFirst(weo0cp12BOReq.getWeo0cp12());
			 WEO0CP12*/
			
			// STETZ 03-25-15 REMOVED REFERENCE TO CSFO. #181455
			//
			if (weo0cp12BOReq.getGlobal().getgAttr().equalsIgnoreCase("D")) {
				// TODO REINPUT*008
			}
			//
			// IF #G-PANEL = CSFO
			// INPUT WINDOW=CANCEL USING MAP WEO0MCN1 / DELETE AFTER COPYCODE
			// ELSE / INSERTED IN ALL CODE
			// END-IF
			//
			if ((NaturalUtil.getSystemKey().equalsIgnoreCase("ENTR")
					|| NaturalUtil.getSystemKey().equalsIgnoreCase("PF12"))) {
				// TODO REINPUT*008
			}
			//
		} catch (Exception ex) {
			LOGGER.error("Error:" + ex);
			throw new OscarBusinessException(ex);
		}
		LOGGER.debug("Response:" + weo0cp12BOResp);
		return weo0cp12BOResp;
	}

	/**
	 * Method executeENTR
	 * 
	 * @param weo0cp12BOReq
	 * @return weo0cp12BOResp
	 * @throws OscarBusinessException
	 */
	public Weo0cp12BO executeENTR(Weo0cp12BO weo0cp12BO) throws OscarBusinessException {
		LOGGER.debug(AppConstants.REQUEST + weo0cp12BO);
		try {
			// TODO BACKOUTTRANSACTION
			/*TODO cancelRequest(weo0cp12BOResp);*/
		} catch (Exception ex) {
			LOGGER.error("Error:" + ex);
			throw new OscarBusinessException(ex);
		}
		LOGGER.debug("Response:" + weo0cp12BO);
		return weo0cp12BO;
	}
}