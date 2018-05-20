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
public class Weo5sfcdBO extends BaseBO implements Serializable {


    private List<Weo5sfcd> weo5sfcd;
    private int exeStatus;
    public List<Weo5sfcd> getWeo5sfcd() {
        if(weo5sfcd == null) {
            weo5sfcd = new ArrayList<Weo5sfcd>();
        }
        return weo5sfcd;
    }

    public void setWeo5sfcd(List<Weo5sfcd> weo5sfcd ) {
        this.weo5sfcd = weo5sfcd;
    }

    public int getExeStatus() {
        return exeStatus;
    }

    public void setExeStatus(int exeStatus ) {
        this.exeStatus = exeStatus;
    }

    @Override
    public String toString() {
        return "Weo5sfcdBO [weo5sfcd =" + weo5sfcd + " ,exeStatus =" + exeStatus+ "]";
    }
}