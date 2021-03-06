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
public class Weo0nrnd   implements Serializable {

    private String type;
    private String rnd;
   // private String 0;
    private int rc;
    private int rand;
    private int cnt;
    private WeovnextBatchNbr weovnextBatchNbr;
    private WeovnextTxnNbr weovnextTxnNbr;
    private WeovnextTxnNbrBig weovnextTxnNbrBig;
    private WeovnextEomRcpt weovnextEomRcpt;
    private WeovnextRcptAdjt weovnextRcptAdjt;
    private WeovnextCaseId weovnextCaseId;
    private WeovnextPcktId weovnextPcktId;
    private WeovnextMailId weovnextMailId;
    private WeovnextNarrId weovnextNarrId;
    private WeovnextPin weovnextPin;
    private WeovnextRqstId weovnextRqstId;
    private WeovnextEmplId weovnextEmplId;
    private WeovnextTempSsn weovnextTempSsn;
    private WeovnextFcSsn weovnextFcSsn;
    private WeovnextCivAct weovnextCivAct;
    private WeovnextAssetId weovnextAssetId;
    private WeovnextIntAdjt weovnextIntAdjt;
    private WeovnextSysAdjt weovnextSysAdjt;
    private int indx;
    private String aRnd10;
    private int wsRnd;
    private String userId;
    private String changedTime;
    private int nRnd;
    private String aRnd;
    private int nextRcptIdN;
    private String nextRcptIdA;
    private String nextRcptIdYy;
    private int nextRcptIdNum;
    private int rndBnoN;
    private String rndBnoA;
    private String rndBnoDte;
    private int rndBnoSno;
    private String nextRcptAdjtId;
    private String datj;
    private String nextBatchNbr;
    private String nextCaseId;
    private String nextEomRcptId;
    private String nextEmplId;
    private String nextCtrpyId;
    private String nextIntAdjtId;
    private String nextPcktId;
    private String nextMailId;
    private String nextNarrId;
    private String nextPin;
    private String nextRqstId;
    private String nextAssetId;
    private String nextSysAdjtId;
    private String nextTxnNbrBig;
    private String nextTempSsn;
    private String nextFcSsn;
    private String nextCivAct;
    private WeovnextCtrpyId weovnextCtrpyId;
    public String getType() {
        return type;
    }

    public void setType(String type ) {
        this.type = type;
    }

    public String getRnd() {
        return rnd;
    }

    public void setRnd(String rnd ) {
        this.rnd = rnd;
    }

    /*public String get0() {
        return 0;
    }

    public void set0(String 0 ) {
        this.0 = 0;
    }*/

    public int getRc() {
        return rc;
    }

    public void setRc(int rc ) {
        this.rc = rc;
    }

    public int getRand() {
        return rand;
    }

    public void setRand(int rand ) {
        this.rand = rand;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt ) {
        this.cnt = cnt;
    }

    public WeovnextBatchNbr getWeovnextBatchNbr() {
        return weovnextBatchNbr;
    }

    public void setWeovnextBatchNbr(WeovnextBatchNbr weovnextBatchNbr ) {
        this.weovnextBatchNbr = weovnextBatchNbr;
    }

    public WeovnextTxnNbr getWeovnextTxnNbr() {
        return weovnextTxnNbr;
    }

    public void setWeovnextTxnNbr(WeovnextTxnNbr weovnextTxnNbr ) {
        this.weovnextTxnNbr = weovnextTxnNbr;
    }

    public WeovnextTxnNbrBig getWeovnextTxnNbrBig() {
        return weovnextTxnNbrBig;
    }

    public void setWeovnextTxnNbrBig(WeovnextTxnNbrBig weovnextTxnNbrBig ) {
        this.weovnextTxnNbrBig = weovnextTxnNbrBig;
    }

    public WeovnextEomRcpt getWeovnextEomRcpt() {
        return weovnextEomRcpt;
    }

    public void setWeovnextEomRcpt(WeovnextEomRcpt weovnextEomRcpt ) {
        this.weovnextEomRcpt = weovnextEomRcpt;
    }

    public WeovnextRcptAdjt getWeovnextRcptAdjt() {
        return weovnextRcptAdjt;
    }

    public void setWeovnextRcptAdjt(WeovnextRcptAdjt weovnextRcptAdjt ) {
        this.weovnextRcptAdjt = weovnextRcptAdjt;
    }

    public WeovnextCaseId getWeovnextCaseId() {
        return weovnextCaseId;
    }

    public void setWeovnextCaseId(WeovnextCaseId weovnextCaseId ) {
        this.weovnextCaseId = weovnextCaseId;
    }

    public WeovnextPcktId getWeovnextPcktId() {
        return weovnextPcktId;
    }

    public void setWeovnextPcktId(WeovnextPcktId weovnextPcktId ) {
        this.weovnextPcktId = weovnextPcktId;
    }

    public WeovnextMailId getWeovnextMailId() {
        return weovnextMailId;
    }

    public void setWeovnextMailId(WeovnextMailId weovnextMailId ) {
        this.weovnextMailId = weovnextMailId;
    }

    public WeovnextNarrId getWeovnextNarrId() {
        return weovnextNarrId;
    }

    public void setWeovnextNarrId(WeovnextNarrId weovnextNarrId ) {
        this.weovnextNarrId = weovnextNarrId;
    }

    public WeovnextPin getWeovnextPin() {
        return weovnextPin;
    }

    public void setWeovnextPin(WeovnextPin weovnextPin ) {
        this.weovnextPin = weovnextPin;
    }

    public WeovnextRqstId getWeovnextRqstId() {
        return weovnextRqstId;
    }

    public void setWeovnextRqstId(WeovnextRqstId weovnextRqstId ) {
        this.weovnextRqstId = weovnextRqstId;
    }

    public WeovnextEmplId getWeovnextEmplId() {
        return weovnextEmplId;
    }

    public void setWeovnextEmplId(WeovnextEmplId weovnextEmplId ) {
        this.weovnextEmplId = weovnextEmplId;
    }

    public WeovnextTempSsn getWeovnextTempSsn() {
        return weovnextTempSsn;
    }

    public void setWeovnextTempSsn(WeovnextTempSsn weovnextTempSsn ) {
        this.weovnextTempSsn = weovnextTempSsn;
    }

    public WeovnextFcSsn getWeovnextFcSsn() {
        return weovnextFcSsn;
    }

    public void setWeovnextFcSsn(WeovnextFcSsn weovnextFcSsn ) {
        this.weovnextFcSsn = weovnextFcSsn;
    }

    public WeovnextCivAct getWeovnextCivAct() {
        return weovnextCivAct;
    }

    public void setWeovnextCivAct(WeovnextCivAct weovnextCivAct ) {
        this.weovnextCivAct = weovnextCivAct;
    }

    public WeovnextAssetId getWeovnextAssetId() {
        return weovnextAssetId;
    }

    public void setWeovnextAssetId(WeovnextAssetId weovnextAssetId ) {
        this.weovnextAssetId = weovnextAssetId;
    }

    public WeovnextIntAdjt getWeovnextIntAdjt() {
        return weovnextIntAdjt;
    }

    public void setWeovnextIntAdjt(WeovnextIntAdjt weovnextIntAdjt ) {
        this.weovnextIntAdjt = weovnextIntAdjt;
    }

    public WeovnextSysAdjt getWeovnextSysAdjt() {
        return weovnextSysAdjt;
    }

    public void setWeovnextSysAdjt(WeovnextSysAdjt weovnextSysAdjt ) {
        this.weovnextSysAdjt = weovnextSysAdjt;
    }

    public int getIndx() {
        return indx;
    }

    public void setIndx(int indx ) {
        this.indx = indx;
    }

    public String getaRnd10() {
        return aRnd10;
    }

    public void setaRnd10(String aRnd10 ) {
        this.aRnd10 = aRnd10;
    }

    public int getWsRnd() {
        return wsRnd;
    }

    public void setWsRnd(int wsRnd ) {
        this.wsRnd = wsRnd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId ) {
        this.userId = userId;
    }

    public String getChangedTime() {
        return changedTime;
    }

    public void setChangedTime(String changedTime ) {
        this.changedTime = changedTime;
    }

    public int getnRnd() {
        return nRnd;
    }

    public void setnRnd(int nRnd ) {
        this.nRnd = nRnd;
    }

    public String getaRnd() {
        return aRnd;
    }

    public void setaRnd(String aRnd ) {
        this.aRnd = aRnd;
    }

    public int getNextRcptIdN() {
        return nextRcptIdN;
    }

    public void setNextRcptIdN(int nextRcptIdN ) {
        this.nextRcptIdN = nextRcptIdN;
    }

    public String getNextRcptIdA() {
        return nextRcptIdA;
    }

    public void setNextRcptIdA(String nextRcptIdA ) {
        this.nextRcptIdA = nextRcptIdA;
    }

    public String getNextRcptIdYy() {
        return nextRcptIdYy;
    }

    public void setNextRcptIdYy(String nextRcptIdYy ) {
        this.nextRcptIdYy = nextRcptIdYy;
    }

    public int getNextRcptIdNum() {
        return nextRcptIdNum;
    }

    public void setNextRcptIdNum(int nextRcptIdNum ) {
        this.nextRcptIdNum = nextRcptIdNum;
    }

    public int getRndBnoN() {
        return rndBnoN;
    }

    public void setRndBnoN(int rndBnoN ) {
        this.rndBnoN = rndBnoN;
    }

    public String getRndBnoA() {
        return rndBnoA;
    }

    public void setRndBnoA(String rndBnoA ) {
        this.rndBnoA = rndBnoA;
    }

    public String getRndBnoDte() {
        return rndBnoDte;
    }

    public void setRndBnoDte(String rndBnoDte ) {
        this.rndBnoDte = rndBnoDte;
    }

    public int getRndBnoSno() {
        return rndBnoSno;
    }

    public void setRndBnoSno(int rndBnoSno ) {
        this.rndBnoSno = rndBnoSno;
    }

    public String getNextRcptAdjtId() {
        return nextRcptAdjtId;
    }

    public void setNextRcptAdjtId(String nextRcptAdjtId ) {
        this.nextRcptAdjtId = nextRcptAdjtId;
    }

    public String getDatj() {
        return datj;
    }

    public void setDatj(String datj ) {
        this.datj = datj;
    }

    public String getNextBatchNbr() {
        return nextBatchNbr;
    }

    public void setNextBatchNbr(String nextBatchNbr ) {
        this.nextBatchNbr = nextBatchNbr;
    }

    public String getNextCaseId() {
        return nextCaseId;
    }

    public void setNextCaseId(String nextCaseId ) {
        this.nextCaseId = nextCaseId;
    }

    public String getNextEomRcptId() {
        return nextEomRcptId;
    }

    public void setNextEomRcptId(String nextEomRcptId ) {
        this.nextEomRcptId = nextEomRcptId;
    }

    public String getNextEmplId() {
        return nextEmplId;
    }

    public void setNextEmplId(String nextEmplId ) {
        this.nextEmplId = nextEmplId;
    }

    public String getNextCtrpyId() {
        return nextCtrpyId;
    }

    public void setNextCtrpyId(String nextCtrpyId ) {
        this.nextCtrpyId = nextCtrpyId;
    }

    public String getNextIntAdjtId() {
        return nextIntAdjtId;
    }

    public void setNextIntAdjtId(String nextIntAdjtId ) {
        this.nextIntAdjtId = nextIntAdjtId;
    }

    public String getNextPcktId() {
        return nextPcktId;
    }

    public void setNextPcktId(String nextPcktId ) {
        this.nextPcktId = nextPcktId;
    }

    public String getNextMailId() {
        return nextMailId;
    }

    public void setNextMailId(String nextMailId ) {
        this.nextMailId = nextMailId;
    }

    public String getNextNarrId() {
        return nextNarrId;
    }

    public void setNextNarrId(String nextNarrId ) {
        this.nextNarrId = nextNarrId;
    }

    public String getNextPin() {
        return nextPin;
    }

    public void setNextPin(String nextPin ) {
        this.nextPin = nextPin;
    }

    public String getNextRqstId() {
        return nextRqstId;
    }

    public void setNextRqstId(String nextRqstId ) {
        this.nextRqstId = nextRqstId;
    }

    public String getNextAssetId() {
        return nextAssetId;
    }

    public void setNextAssetId(String nextAssetId ) {
        this.nextAssetId = nextAssetId;
    }

    public String getNextSysAdjtId() {
        return nextSysAdjtId;
    }

    public void setNextSysAdjtId(String nextSysAdjtId ) {
        this.nextSysAdjtId = nextSysAdjtId;
    }

    public String getNextTxnNbrBig() {
        return nextTxnNbrBig;
    }

    public void setNextTxnNbrBig(String nextTxnNbrBig ) {
        this.nextTxnNbrBig = nextTxnNbrBig;
    }

    public String getNextTempSsn() {
        return nextTempSsn;
    }

    public void setNextTempSsn(String nextTempSsn ) {
        this.nextTempSsn = nextTempSsn;
    }

    public String getNextFcSsn() {
        return nextFcSsn;
    }

    public void setNextFcSsn(String nextFcSsn ) {
        this.nextFcSsn = nextFcSsn;
    }

    public String getNextCivAct() {
        return nextCivAct;
    }

    public void setNextCivAct(String nextCivAct ) {
        this.nextCivAct = nextCivAct;
    }

    public WeovnextCtrpyId getWeovnextCtrpyId() {
        return weovnextCtrpyId;
    }

    public void setWeovnextCtrpyId(WeovnextCtrpyId weovnextCtrpyId ) {
        this.weovnextCtrpyId = weovnextCtrpyId;
    }

    @Override
    public String toString() {
        return "Weo0nrnd [type =" + type + " ,rnd =" + rnd + " ,0 =" + 0 + " ,rc =" + rc + " ,rand =" + rand + " ,cnt =" + cnt + " ,weovnextBatchNbr =" + weovnextBatchNbr + " ,weovnextTxnNbr =" + weovnextTxnNbr + " ,weovnextTxnNbrBig =" + weovnextTxnNbrBig + " ,weovnextEomRcpt =" + weovnextEomRcpt + " ,weovnextRcptAdjt =" + weovnextRcptAdjt + " ,weovnextCaseId =" + weovnextCaseId + " ,weovnextPcktId =" + weovnextPcktId + " ,weovnextMailId =" + weovnextMailId + " ,weovnextNarrId =" + weovnextNarrId + " ,weovnextPin =" + weovnextPin + " ,weovnextRqstId =" + weovnextRqstId + " ,weovnextEmplId =" + weovnextEmplId + " ,weovnextTempSsn =" + weovnextTempSsn + " ,weovnextFcSsn =" + weovnextFcSsn + " ,weovnextCivAct =" + weovnextCivAct + " ,weovnextAssetId =" + weovnextAssetId + " ,weovnextIntAdjt =" + weovnextIntAdjt + " ,weovnextSysAdjt =" + weovnextSysAdjt + " ,indx =" + indx + " ,aRnd10 =" + aRnd10 + " ,wsRnd =" + wsRnd + " ,userId =" + userId + " ,changedTime =" + changedTime + " ,nRnd =" + nRnd + " ,aRnd =" + aRnd + " ,nextRcptIdN =" + nextRcptIdN + " ,nextRcptIdA =" + nextRcptIdA + " ,nextRcptIdYy =" + nextRcptIdYy + " ,nextRcptIdNum =" + nextRcptIdNum + " ,rndBnoN =" + rndBnoN + " ,rndBnoA =" + rndBnoA + " ,rndBnoDte =" + rndBnoDte + " ,rndBnoSno =" + rndBnoSno + " ,nextRcptAdjtId =" + nextRcptAdjtId + " ,datj =" + datj + " ,nextBatchNbr =" + nextBatchNbr + " ,nextCaseId =" + nextCaseId + " ,nextEomRcptId =" + nextEomRcptId + " ,nextEmplId =" + nextEmplId + " ,nextCtrpyId =" + nextCtrpyId + " ,nextIntAdjtId =" + nextIntAdjtId + " ,nextPcktId =" + nextPcktId + " ,nextMailId =" + nextMailId + " ,nextNarrId =" + nextNarrId + " ,nextPin =" + nextPin + " ,nextRqstId =" + nextRqstId + " ,nextAssetId =" + nextAssetId + " ,nextSysAdjtId =" + nextSysAdjtId + " ,nextTxnNbrBig =" + nextTxnNbrBig + " ,nextTempSsn =" + nextTempSsn + " ,nextFcSsn =" + nextFcSsn + " ,nextCivAct =" + nextCivAct + " ,weovnextCtrpyId =" + weovnextCtrpyId+ "]";
    }
}