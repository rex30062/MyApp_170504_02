package com.cclz.myapp_170504_02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d("REC1", "接收到了廣播");
        Intent it = new Intent(context, MyService.class);
        context.startService(it);
    }
}
