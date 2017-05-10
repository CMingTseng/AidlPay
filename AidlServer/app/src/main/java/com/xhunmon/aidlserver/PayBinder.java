package com.xhunmon.aidlserver;

import android.os.RemoteException;

import com.xhunmon.aidl.pay.IPay;

/**
 * user: uidq0530， 2017-05-10.
 * description：
 *
 * @author xhunmon
 */

public class PayBinder extends IPay.Stub {

    private static int sum = 10000;

    @Override
    public String pay(int money) throws RemoteException {
        if(money > sum){
            return "余额不足！";
        }
        sum = sum -money;
        return sum+"";
    }

}
