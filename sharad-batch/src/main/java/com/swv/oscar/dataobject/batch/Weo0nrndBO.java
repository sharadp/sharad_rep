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
public class Weo0nrndBO extends BaseBO implements Serializable {


    private List<Weo0nrnd> weo0nrnd;
    private int exeStatus;
    public List<Weo0nrnd> getWeo0nrnd() {
        if(weo0nrnd == null) {
            weo0nrnd = new ArrayList<Weo0nrnd>();
        }
        return weo0nrnd;
    }

    public void setWeo0nrnd(List<Weo0nrnd> weo0nrnd ) {
        this.weo0nrnd = weo0nrnd;
    }

    public int getExeStatus() {
        return exeStatus;
    }

    public void setExeStatus(int exeStatus ) {
        this.exeStatus = exeStatus;
    }

    @Override
    public String toString() {
        return "Weo0nrndBO [weo0nrnd =" + weo0nrnd + " ,exeStatus =" + exeStatus+ "]";
    }
}