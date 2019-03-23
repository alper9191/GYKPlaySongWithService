package com.abeyler.gykplaysongwithservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class PlaySongService extends Service {
    private MediaPlayer mediaPlayer;

    public PlaySongService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tarkan_yolla);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){

        mediaPlayer.start();
        return START_STICKY;  // even if killed app, it starts again.
        // when killed app, it is not start again if you use  START_NOT_STICKY
    }

    @Override
    public void onDestroy() {
        mediaPlayer.release();
        super.onDestroy();
    }
}
