package com.swv.oscar.dataobject.batch;

import java.io.Serializable;
import java.util.List;

import com.swv.oscar.dataobject.common.BaseBO;

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
public class Weo0nmsgBO extends BaseBO implements Serializable {


    private List<Weo0nmsg> weo0nmsg;
    private int exeStatus;
    public List<Weo0nmsg> getWeo0nmsg() {
        if(weo0nmsg == null) {
            weo0nmsg = new ArrayList<Weo0nmsg>();
        }
        return weo0nmsg;
    }

    public void setWeo0nmsg(List<Weo0nmsg> weo0nmsg ) {
        this.weo0nmsg = weo0nmsg;
    }

    public int getExeStatus() {
        return exeStatus;
    }

    public void setExeStatus(int exeStatus ) {
        this.exeStatus = exeStatus;
    }

    @Override
    public String toString() {
        return "Weo0nmsgBO [weo0nmsg =" + weo0nmsg + " ,exeStatus =" + exeStatus+ "]";
    }
}