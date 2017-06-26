package com.xhunmon.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.xhunmon.aidl.pay.IPay;

public class PayService extends Service {

    private IBinder ib;

    @Override
    public void onCreate() {
        super.onCreate();
        ib = new PayBinder();
    }

    @Override
    public IBinder onBind(Intent intent) {

        return ib;
    }

    private class PayBinder extends IPay.Stub {

        private int sum = 10000;

        @Override
        public String pay(int money) throws RemoteException {
            if(money > sum){
                return "余额不足！";
            }
            sum = sum -money;
            return sum+"";
        }
    }
}
