package com.example.hensaada.myapplication;

import android.app.Application;
import android.content.Intent;

/**
 * Created by hensaada on 12/29/2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        startService(new Intent(this, YourService.class));
    }
}