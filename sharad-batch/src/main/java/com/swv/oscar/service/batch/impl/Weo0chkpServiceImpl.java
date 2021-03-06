package com.swv.oscar.service.batch.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swv.oscar.dataobject.batch.Weo0chkp;
import com.swv.oscar.dataobject.batch.Weo0chkpBO;
import com.swv.oscar.dataobject.batch.Weo0nenv;
import com.swv.oscar.dataobject.batch.Weo0nenvBO;
import com.swv.oscar.dataobject.common.BaseBO;
import com.swv.oscar.exceptions.OscarBusinessException;
import com.swv.oscar.repositories.IWeo0chkpRepository;
import com.swv.oscar.service.batch.IWeo0cberService;
import com.swv.oscar.service.batch.IWeo0chkpService;
import com.swv.oscar.service.batch.IWeo0nenvService;
import com.swv.oscar.shared.set.AppConstants;
import com.swv.oscar.util.MappingHelper;
import com.swv.oscar.util.NaturalUtil;
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
@Service
public class Weo0chkpServiceImpl implements  IWeo0chkpService {

	private static final OscarLogger LOGGER = OscarLogger.create(Weo0chkpServiceImpl.class);

	@Autowired
	private IWeo0chkpRepository weo0chkpRepository;

	public IWeo0chkpRepository getWeo0chkpRepository() {
		return weo0chkpRepository;
	}

	public void setWeo0chkpRepository(IWeo0chkpRepository weo0chkpRepository) {
		this.weo0chkpRepository = weo0chkpRepository;
	}

	@Autowired
	IWeo0cberService weo0cberService;

	public IWeo0cberService getWeo0cberService() {
		return weo0cberService;
	}

	public void setWeo0cberService(IWeo0cberService weo0cberService) {
		this.weo0cberService = weo0cberService;
	}

	@Autowired
	IWeo0nenvService weo0nenvService;
	
	public IWeo0nenvService getWeo0nenvService() {
		return weo0nenvService;
	}

	public void setWeo0nenvService(IWeo0nenvService weo0nenvService) {
		this.weo0nenvService = weo0nenvService;
	}

	String query = null;
	/**
	 * Method execute
	 * @param weo0chkpBOReq
	 * @return weo0chkpBOResp
	 * @throws OscarBusinessException
	 */
	@Override
	public Weo0chkpBO execute(BaseBO weo0chkpBOReq) throws OscarBusinessException {
		LOGGER.debug(AppConstants.REQUEST+weo0chkpBOReq);
		Weo0chkpBO weo0chkpBOResp = null;
		Weo0chkp weo0chkp = new Weo0chkp();
		try {
			weo0chkpBOResp =  new Weo0chkpBO();

			//TODO BACKOUTTRANSACTION
			weo0chkpBOReq.getGlobal().setgRc(0);
			weo0chkpBOReq.getGlobal().setgEnv("");
			Weo0nenvBO weo0nenvBOResp  = new Weo0nenvBO();
			List<Weo0nenv> weo0nenvList = new ArrayList<>();
			Weo0nenv weo0nenv = new Weo0nenv();
			weo0nenv.setRc(weo0chkpBOReq.getGlobal().getgRc());
			weo0nenv.setEnv(weo0chkpBOReq.getGlobal().getgEnv().trim());
			weo0nenvList.add(weo0nenv);
			weo0nenvBOResp.setWeo0nenv(weo0nenvList);
			weo0nenvService.execute(weo0nenvBOResp);

			// determine environment
			if(weo0chkpBOReq.getGlobal().getgRc() > 0) {
				//TODO WRITE'UNABLE TO DETERMINE ENVIRONMENT..'
				LOGGER.info("UNABLE TO DETERMINE ENVIRONMENT..");
				//TODO WRITE'RETURN CODE FROM WEO0NENV  ..'#G-RC
				LOGGER.info("RETURN CODE FROM WEO0NENV  .." + weo0chkpBOReq.getGlobal().getgRc());
				//TODO WRITE'USERID ..'*USER
				LOGGER.info("USERID .." + NaturalUtil.getCurrentUser());
				//TODO WRITE'JOB TERMINATING..'
				LOGGER.info("JOB TERMINATING..");
				return weo0chkpBOResp;
			}

			weo0chkpBOReq.getGlobal().setgSqlid("WEO" + weo0chkpBOReq.getGlobal().getgEnv().trim());

			weo0chkpBOReq.getGlobal().setgSqlstmt("SET CURRENT SQLID=" + weo0chkpBOReq.getGlobal().getgSqlid().trim() + ";");

			weo0chkpBOReq.getGlobal().setgRc(0);
			//TODO ATMA commented  Db2serv.execute()
			
			if(weo0chkpBOReq.getGlobal().getgRc() > 0) {
				//TODO WRITE'UNABLE TO CONNECT TO DB2..'
				LOGGER.info("UNABLE TO CONNECT TO DB2..");
				//TODO WRITE'RETURN CODE FROM DB2SERV  ..'#G-RC
				LOGGER.info("RETURN CODE FROM DB2SERV  .. " + weo0chkpBOReq.getGlobal().getgRc());
				//TODO WRITE'USERID ..'*USER
				LOGGER.info("USERID .." + NaturalUtil.getCurrentUser());
				//TODO WRITE'JOB TERMINATING..'
				LOGGER.info("JOB TERMINATING..");
				//TODO FETCHRETURN'SQLERR'
				// return "SQLERR";
				return weo0chkpBOResp;
			}
			// weo0chkpGProgram = NaturalUtil.getCurrentProgram();
			// weo0chkpBOReq.getGlobal().setgProgram(NaturalUtil.getCurrentProgram()); 
			// TODO ATMA commented errorTa = "WEO0PERR";
			query = "SELECT COMMIT_CNT , TIME_LAST_RUN  FROM WEOVCHECKPT_DATA2 WHERE PROGRAM_NAME = '" + weo0chkpBOReq.getGlobal().getgProgram().trim() +"'";
			weo0chkpBOResp = weo0chkpRepository.executeQuery0(query);
			if(weo0chkpBOResp.getGlobal() == null) {
				weo0chkpBOReq.getGlobal().setgCommitMax(200);
				weo0chkpBOReq.getGlobal().setgStartTime(MappingHelper.getCurrentTimestamp());
				query = "INSERT INTO WEOVCHECKPT_DATA2 (PROGRAM_NAME,COMMIT_CNT,TIME_LAST_RUN) VALUES ( '" + weo0chkpBOReq.getGlobal().getgProgram().trim() + "', '" +  weo0chkpBOReq.getGlobal().getgCommitMax() + "', '" + weo0chkpBOReq.getGlobal().getgStartTime().trim()+"')";
				weo0chkpBOResp = weo0chkpRepository.executeQuery1(query);
				weo0chkpBOResp.getGlobal().setgRc(weo0chkpBOResp.getGlobal().getgRc());
				//   #G-TRAC-DATE IS SAVED FOR FINANCIAL PROGRAMS
				weo0chkpBOReq.getGlobal().setgTracDate("0001-01-01");
			}else{
				weo0chkpBOReq.getGlobal().setgCommitMax(weo0chkpBOResp.getGlobal().getgCommitMax());
				if(weo0chkpBOResp.getGlobal().getgStartTime() != null){
				weo0chkpBOReq.getGlobal().setgStartTime(weo0chkpBOResp.getGlobal().getgStartTime().trim());
				}
			}

			weo0chkpBOReq.getGlobal().setgTracDate(weo0chkpBOReq.getGlobal().getgStartTime().substring(0,10));
			
			weo0chkpBOReq.getGlobal().setgFromDate(weo0chkpBOReq.getGlobal().getgStartTime().trim());
			query = "SELECT RUN_DATE , COMMIT_DATA , START_TIME , END_TIME  FROM WEOVRESTART_DATA2 WHERE PROGRAM_NAME = '" + weo0chkpBOReq.getGlobal().getgProgram().trim() +"'";
			weo0chkpBOResp = weo0chkpRepository.executeQuery2(query);
			if(weo0chkpBOResp.getGlobal() == null) {
				weo0chkpBOReq.getGlobal().setgTodaysDt(new Date());
				weo0chkpBOReq.getGlobal().setgStartTime(MappingHelper.getCurrentTimestamp().trim());
				weo0chkpBOReq.getGlobal().setgEndTime(weo0chkpBOReq.getGlobal().getgStartTime().trim());
				query = "INSERT INTO WEOVRESTART_DATA2 (PROGRAM_NAME,RUN_DATE,START_TIME,END_TIME) VALUES ( '" + weo0chkpBOReq.getGlobal().getgProgram().trim() + "','" + MappingHelper.getFormattedDate(new Date(),"YYYY-MM-dd").trim() + "','" + weo0chkpBOReq.getGlobal().getgStartTime().trim()+ "','" + weo0chkpBOReq.getGlobal().getgEndTime().trim() + "')"; 
				weo0chkpBOResp = weo0chkpRepository.executeQuery3(query); 
			}else{
				weo0chkpBOReq.getGlobal().setgTodaysDt(weo0chkpBOResp.getGlobal().getgTodaysDt());
				weo0chkpBOReq.getGlobal().setgCommitData(weo0chkpBOResp.getGlobal().getgCommitData());
				weo0chkpBOReq.getGlobal().setgStartTime(weo0chkpBOResp.getGlobal().getgStartTime());
				weo0chkpBOReq.getGlobal().setgEndTime(weo0chkpBOResp.getGlobal().getgEndTime());
				}
			if(NaturalUtil.compareBetweenTimeStamp(weo0chkpBOReq.getGlobal().getgEndTime().trim(),weo0chkpBOReq.getGlobal().getgStartTime().trim())) {
				//TODO WRITEUSINGFORM'WEO0MRST'
				LOGGER.info("WEO0MRST");
				weo0chkp.setCommitData(weo0chkpBOReq.getGlobal().getgCommitData());
				/*  TODO ATMA commented naturalUtilGetCurrentPageNumber = pagenumber(0);
                naturalUtilGetCurrentPageNumber = pagenumber(1);
                naturalUtilGetCurrentPageNumber = pagenumber(2);
                naturalUtilGetCurrentPageNumber = pagenumber(3);
                naturalUtilGetCurrentPageNumber = pagenumber(4);
                naturalUtilGetCurrentPageNumber = pagenumber(5);*/
				resynchAndRestart(weo0chkpBOReq);
			} else {
				//  INCLUDE WEO0CBEG
				weo0cberService.execute(weo0chkpBOReq);
				// MAL
			}
			//TODO ENDTRANSACTION
			//
			// End of list
		} catch (Exception ex) {
			LOGGER.error("Error:" + ex);
			throw new OscarBusinessException(ex);
		}
		LOGGER.debug("Response:"+weo0chkpBOResp);
		return weo0chkpBOResp;
	}

	private void resynchAndRestart(BaseBO weo0chkpBOReq) throws OscarBusinessException {
		// TODO Auto-generated method stub
		weo0cberService.execute(weo0chkpBOReq);
	}
}