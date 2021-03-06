package com.swv.oscar.dataobject.common;

import java.io.Serializable;
import java.util.List;

/*************************************************************************
 *
 * SWV CONFIDENTIAL
 * _________________________________________________________________________________
 *
 * SWV is a trademark of SWV Company.
 *
 * Copyright � 2017 SWV. All rights reserved.
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
// Author : Generated by ATMA �
// Revision History :
public class Weo0s002BO extends BaseBO implements Serializable {

    private List<Weo0s002> weo0s002;
    public List<Weo0s002> getWeo0s002() {
        return weo0s002;
    }

    public void setWeo0s002(List<Weo0s002> weo0s002 ) {
        this.weo0s002 = weo0s002;
    }

    @Override
    public String toString() {
        return "Weo0s002BO [weo0s002 =" + weo0s002+ "]";
    }
}