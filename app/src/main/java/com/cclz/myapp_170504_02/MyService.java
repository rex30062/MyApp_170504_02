package com.cclz.myapp_170504_02;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by YVTC on 2017/5/4.
 */

public class MyService extends Service {

    Handler handler = new Handler();
    public MyService() {
    }

    Runnable showTime = new Runnable() {
        @Override
        public void run() {
            Log.d("REC1", "Time:" + new java.util.Date());
            handler.postDelayed(this, 1000);
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        handler.post(showTime);
        return START_STICKY;
    }
}
