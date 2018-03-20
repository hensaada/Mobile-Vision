package com.example.hensaada.myapplication;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import java.io.File;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;


/**
 * Created by hensaada on 12/29/2017.
 */

public class YourService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {



        Log.d("BLA", "run: KUKUU");





        return super.onStartCommand(intent, flags, startId);
    }
}