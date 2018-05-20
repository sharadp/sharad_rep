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
public class Weo0ncsgBO extends BaseBO implements Serializable {


    private List<Weo0ncsg> weo0ncsg;
    private int exeStatus;
    public List<Weo0ncsg> getWeo0ncsg() {
        if(weo0ncsg == null) {
            weo0ncsg = new ArrayList<Weo0ncsg>();
        }
        return weo0ncsg;
    }

    public void setWeo0ncsg(List<Weo0ncsg> weo0ncsg ) {
        this.weo0ncsg = weo0ncsg;
    }

    public int getExeStatus() {
        return exeStatus;
    }

    public void setExeStatus(int exeStatus ) {
        this.exeStatus = exeStatus;
    }

    @Override
    public String toString() {
        return "Weo0ncsgBO [weo0ncsg =" + weo0ncsg + " ,exeStatus =" + exeStatus+ "]";
    }
}