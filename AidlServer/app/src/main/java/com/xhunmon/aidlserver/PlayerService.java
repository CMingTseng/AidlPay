package com.xhunmon.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.android.aidl.player.IPlayer;

public class PlayerService extends Service {

    private IBinder ib;

    public PlayerService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ib = new Player();
    }

    @Override
    public IBinder onBind(Intent intent) {

        return ib;
    }

    private class Player extends IPlayer.Stub{

        @Override
        public String play() throws RemoteException {
            return "远程播放器正在播放中……";
        }

        @Override
        public String stop() throws RemoteException {
            return "远程播放器已停止运行.";
        }
    }
}
