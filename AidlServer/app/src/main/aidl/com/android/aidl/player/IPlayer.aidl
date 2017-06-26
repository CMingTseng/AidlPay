// IPlayer.aidl
package com.android.aidl.player;

// Declare any non-default types here with import statements

interface IPlayer {
    /*
    * 播放
    */
    String play();

    /*
    * 暂停
    */
    String stop();
}
