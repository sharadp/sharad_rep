package com.oscar.swv.dataobject;

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
public  class WeovnextPin implements Serializable {

    private String uidUpdated;
    private String timeUpdated;
    private String nextPin;
    public String getUidUpdated() {
        return uidUpdated;
    }

    public void setUidUpdated(String uidUpdated ) {
        this.uidUpdated = uidUpdated;
    }

    public String getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(String timeUpdated ) {
        this.timeUpdated = timeUpdated;
    }

    public String getNextPin() {
        return nextPin;
    }

    public void setNextPin(String nextPin ) {
        this.nextPin = nextPin;
    }

    @Override
    public String toString() {
        return "WeovnextPin [VarDefContext [accessSpecifiers=null, keyword=null, dataType=String, varName=uidUpdated, value=null] =" + VarDefContext [accessSpecifiers=null, keyword=null, dataType=String, varName=uidUpdated, value=null] + " ,VarDefContext [accessSpecifiers=null, keyword=null, dataType=String, varName=timeUpdated, value=null] =" + VarDefContext [accessSpecifiers=null, keyword=null, dataType=String, varName=timeUpdated, value=null] + " ,VarDefContext [accessSpecifiers=null, keyword=null, dataType=String, varName=nextPin, value=null] =" + VarDefContext [accessSpecifiers=null, keyword=null, dataType=String, varName=nextPin, value=null]+ "]";
    }
}