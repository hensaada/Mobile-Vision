package com.example.hensaada.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    private Drawable mCustomImage;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
//        mCustomImage = context.getResources().getDrawable(R.drawable.my_image);
    }



    protected void onDraw(Canvas canvas) {
        Rect imageBounds = canvas.getClipBounds();  // Adjust this for where you want it

        mCustomImage.setBounds(imageBounds);
        mCustomImage.draw(canvas);
    }
}
