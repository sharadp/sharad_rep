package com.swv.oscar.dataobject.batch;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

/*************************************************************************
 *
 * OSCAR CONFIDENTIAL
 * _________________________________________________________________________________
 *
 * OSCAR is a trademark of OSCAR Company.
 *
 * Copyright © 2017 OSCAR. All rights reserved.
 *
 * NOTICE: All information contained herein is, and remains the property of OSCAR
 * and its suppliers, if any. The intellectual and technical concepts contained
 * herein are proprietary to OSCAR and its suppliers and may be covered by U.S.
 * and Foreign Patents, patents in process, and are protected by trade secret or
 * copyright law. Dissemination of this information or reproduction of this
 * material is strictly forbidden unless prior written permission is obtained
 * from OSCAR.
 *
 *************************************************************************/
// Author : Generated by ATMA ®
// Revision History :
public class Weo0nmsg   implements Serializable {

    private int apPin;
    private String msgCd;
    private String msgType;
    private String schedDate;
    private String respDate;
    private int reqId;
    private int rc;
    private String user;
    private String caseload;
    private String splucase;
    private int caseId;
    private String category;
    private String reqDate;
    private String archiveNbr;
    public int getApPin() {
        return apPin;
    }

    public void setApPin(int apPin ) {
        this.apPin = apPin;
    }

    public String getMsgCd() {
        return msgCd;
    }

    public void setMsgCd(String msgCd ) {
        this.msgCd = msgCd;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType ) {
        this.msgType = msgType;
    }

    public String getSchedDate() {
        return schedDate;
    }

    public void setSchedDate(String schedDate ) {
        this.schedDate = schedDate;
    }

    public String getRespDate() {
        return respDate;
    }

    public void setRespDate(String respDate ) {
        this.respDate = respDate;
    }

    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId ) {
        this.reqId = reqId;
    }

    public int getRc() {
        return rc;
    }

    public void setRc(int rc ) {
        this.rc = rc;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user ) {
        this.user = user;
    }

    public String getCaseload() {
        return caseload;
    }

    public void setCaseload(String caseload ) {
        this.caseload = caseload;
    }

    public String getSplucase() {
        return splucase;
    }

    public void setSplucase(String splucase ) {
        this.splucase = splucase;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId ) {
        this.caseId = caseId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category ) {
        this.category = category;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate ) {
        this.reqDate = reqDate;
    }

    public String getArchiveNbr() {
        return archiveNbr;
    }

    public void setArchiveNbr(String archiveNbr ) {
        this.archiveNbr = archiveNbr;
    }

    @Override
    public String toString() {
        return "Weo0nmsg [apPin =" + apPin + " ,msgCd =" + msgCd + " ,msgType =" + msgType + " ,schedDate =" + schedDate + " ,respDate =" + respDate + " ,reqId =" + reqId + " ,rc =" + rc + " ,user =" + user + " ,caseload =" + caseload + " ,splucase =" + splucase + " ,caseId =" + caseId + " ,category =" + category + " ,reqDate =" + reqDate + " ,archiveNbr =" + archiveNbr+ "]";
    }
}