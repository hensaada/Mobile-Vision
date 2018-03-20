package com.example.hensaada.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.os.Build;
import android.support.annotation.RequiresApi;
import java.io.Console;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;


public class OpenGLRenderer implements GLSurfaceView.Renderer {
    private Triangle mTriangle;


    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {

        GLES20.glClearColor(1f,2,0,1f);
        GLES20.glVertexAttrib3f(3,2,1,3);

    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i1) {

    }

    @Override
    public void onDrawFrame(GL10 gl10) {

        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);

    }
}
