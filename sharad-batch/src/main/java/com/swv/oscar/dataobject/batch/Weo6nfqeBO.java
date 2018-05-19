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
public class Weo6nfqeBO extends BaseBO implements Serializable {


    private List<Weo6nfqe> weo6nfqe;
    private int exeStatus;
    public List<Weo6nfqe> getWeo6nfqe() {
        if(weo6nfqe == null) {
            weo6nfqe = new ArrayList<Weo6nfqe>();
        }
        return weo6nfqe;
    }

    public void setWeo6nfqe(List<Weo6nfqe> weo6nfqe ) {
        this.weo6nfqe = weo6nfqe;
    }

    public int getExeStatus() {
        return exeStatus;
    }

    public void setExeStatus(int exeStatus ) {
        this.exeStatus = exeStatus;
    }

    @Override
    public String toString() {
        return "Weo6nfqeBO [weo6nfqe =" + weo6nfqe + " ,exeStatus =" + exeStatus+ "]";
    }
}