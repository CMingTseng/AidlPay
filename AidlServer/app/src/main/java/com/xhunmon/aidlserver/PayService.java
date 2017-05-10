package com.xhunmon.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

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
}
