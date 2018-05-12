package com.swv.oscar.service.batch;

import com.swv.oscar.dataobject.batch.Weo0neomBO;
import com.swv.oscar.exceptions.OscarBusinessException;

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
public interface IWeo0neomService {

    public Weo0neomBO execute(Weo0neomBO weo0neomBOReq) throws OscarBusinessException;
}