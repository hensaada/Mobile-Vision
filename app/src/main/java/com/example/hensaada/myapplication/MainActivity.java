package com.example.hensaada.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.nfc.Tag;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.graphics.Color;


import java.io.File;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Math.sqrt;
import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    private OpenGLView openGLView;
//    mGPUImage = new GPUImage(context);


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openGLView=(OpenGLView) findViewById(R.id.openGLView);
        ImageView myImageView=(ImageView) findViewById(R.id.imageView2);
        myImageView.setImageResource(R.drawable.hen);

//        GLES20.glGetShaderSource(2);

    }

    private void takeScreenshot() {
//
//        new Timer().scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
                Log.d("BLA", "run: PRINttttttttt");
                View v2 = getWindow().getDecorView().findViewById(android.R.id.content);

                Date now = new Date();
                Random r = new Random();
                int i1 = r.nextInt(200 - 65) + 65;
                DateFormat.format("yyyy-MM-dd_hh:mm:ss", now);
                try {
                    // image naming and path  to include sd card  appending name you choose for file
                    String mPath = android.os.Environment.getExternalStorageDirectory().toString() + "/" + i1 + ".jpg";

                    v2.setDrawingCacheEnabled(true);
                    Bitmap bitmap = Bitmap.createBitmap(v2.getDrawingCache());
                    Bitmap bitmaptest = Bitmap.createBitmap(v2.getDrawingCache());
                    v2.setDrawingCacheEnabled(false);
                    File imageFile = new File(mPath);
                    FileOutputStream outputStream = new FileOutputStream(imageFile);
                    int quality = 100;
                    int temp=0;
                    int a1,a2;
//                    Bitmap bmpBlurred = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(),bitmap.getConfig());

                    int[] pixels = new int[bitmap.getHeight()*bitmap.getWidth()];
                    bitmap.getPixels(pixels, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    for (int i=0; i<bitmap.getWidth()*5; i++)
                         pixels[i] = Color.GREEN;
                    bitmap.setPixels(pixels, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());


                    int redValue = Color.RED;
                    int blueValue = Color.BLUE;
                    int greenValue = Color.GREEN;

                    // 1118  720
//                    Log.d("BLA", String.valueOf(bitmap.getHeight()));
//                    Log.d("BLA", String.valueOf(bitmap.getWidth()));
//                    for (int Xcount = 0; Xcount < bitmap.getWidth(); Xcount++) {
//                        for (int Ycount = 0; Ycount < bitmap.getHeight(); Ycount++) {
////                            int var = bitmap.getPixel(600, 600);
//                            int var = bitmap.getPixel(Xcount,Ycount);
//
////                            if (Ycount % 20 == 0) {
//                                bitmap.setPixel(Xcount, Ycount,var+10);
//
////                            }
//                        }
//                    }

                    //trasnport the picture
                    int[] arr_pixels = new int[bitmap.getWidth()*bitmap.getHeight()];
                    bitmap.getPixels(arr_pixels, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());

//                    for (int k=0;k<bitmap.getWidth()*bitmap.getHeight()/2;k++){
//                        int tmp=  arr_pixels[k];
//                        arr_pixels[k]= arr_pixels[bitmap.getWidth()*bitmap.getHeight()-1-k];
//                        arr_pixels[bitmap.getWidth()*bitmap.getHeight()-1-k]=tmp;
//                    }
                    for (int k=0;k<bitmap.getWidth()*bitmap.getHeight()-300;k++){
//                        int tmp=  arr_pixels[k];
//                        arr_pixels[k]= arr_pixels[bitmap.getWidth()*bitmap.getHeight()-1-k];
//                        arr_pixels[bitmap.getWidth()*bitmap.getHeight()-1-k]=tmp;
                            arr_pixels[k]=arr_pixels[k+299];
                        arr_pixels[k+299]=arr_pixels[k];

                    }

                    bitmap.setPixels(arr_pixels, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());

//                    Log.d("BLA", String.valueOf(bitmap.getHeight()));
//                    Log.d("BLA", String.valueOf(bitmap.getWidth()));
//                    for (int Xcount = 0; Xcount < bitmap.getWidth(); Xcount++) {
//                        for (int Ycount = 0; Ycount < bitmap.getHeight(); Ycount++) {
////                            int var = bitmap.getPixel(600, 600);
//                            int var = bitmap.getPixel(Xcount,Ycount);
//
////                            if (Ycount % 20 == 0) {
//                            bitmap.setPixel(Xcount, Ycount,var+10);
//
////                            }
//                        }
//                    }

                    inchecalc();

//                    Bitmap cropedBitmap = Bitmap.createBitmap(bitmaptest, 500, 800, 100, 200);
//                    bitmap=cropedBitmap;

                    View v = findViewById(android.R.id.content); // get reference to root activity view
                        float zoomFactor = 2f; // 1 means no change kaze  ... under 1 is zoom out . else zoom in
                        boolean zoomedOut = false;
                            if(zoomedOut) {
                                // now zoom in
                                v.setScaleX(1);
                                v.setScaleY(1);
                                zoomedOut = false;
                            }
                            else {
                                v.setScaleX(zoomFactor);
                                v.setScaleY(zoomFactor);
                                zoomedOut = true;
                            }

                    inchecalc();









//                    bitmap.setPixel(40, 10, Color.BLUE);
//                    bitmap.setPixel(100, 11, Color.BLUE);
//                    bitmap.setPixel(100, 9, Color.BLUE);
//
//                    bitmap.setPixel(40, 12, Color.BLUE);
//
//                    bitmap.setPixel(40, 13, Color.GREEN);
//
//                    bitmap.setPixel(40, 14, Color.BLUE);
//
//                    bitmap.setPixel(10, 15, Color.BLUE);
//


//                    for(int i=0;i<bitmap.getWidth();i++){
//                        a1 = bitmap.getPixel(3,i );
//                        a2 = bitmap.getPixel(6 , i);
//                        temp=a1;
//                        bitmap.setPixel(3,i,a2);
//                        bitmap.setPixel(3,i,temp);
//
//
//                        a1 = bitmap.getPixel(10,i );
//                        a2 = bitmap.getPixel(6 , i);
//                        temp=a1;
//                        bitmap.setPixel(3,i,a2);
//                        bitmap.setPixel(18,i,temp);
//
//
//                        a1 = bitmap.getPixel(20,i );
//                        a2 = bitmap.getPixel(6 , i);
//                        temp=a1;
//                        bitmap.setPixel(16,i,a2);
//                        bitmap.setPixel(17,i,temp);
//
//                    }

                    bitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream);
                    outputStream.flush();
                    outputStream.close();

                    openScreenshot(imageFile);
//                    Toast.makeText(getApplicationContext(), "Screenshot Saved", Toast.LENGTH_SHORT).show();

//                    openScreenshot(imageFile);
                } catch (Throwable e) {
//                    Toast.makeText(getApplicationContext(), "Eror", Toast.LENGTH_SHORT).show();

        e.printStackTrace();
    }


}
//        }, 0, 3000);//put here time 1000 milliseconds=1 second

//                }
    private void openScreenshot(File imageFile) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        Uri uri = Uri.fromFile(imageFile);
        intent.setDataAndType(uri, "image/*");
        startActivity(intent);
    }

    public void inchecalc(){
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        double x = Math.pow(dm.widthPixels/dm.xdpi, 2);
        double y = Math.pow(dm.heightPixels/dm.ydpi, 2);
        double screenInches = sqrt(x+y);
        Log.d("debug", "Screen Inches:"+screenInches);
        Log.d("INCHES ! ", String.format("%.2f", screenInches)+" In");

       float Density = (float) sqrt(((dm.widthPixels * dm.heightPixels) + (dm.heightPixels * dm.heightPixels)) / screenInches);
        Log.d("DENSITY ! ", String.format("%.2f",Density)+" In");

    }




    public class Screenshot {
        private final View view;
        /** Create snapshots based on the view and its children. */
        public Screenshot(View root) {
            this.view = root;
        }
        /** Create snapshot handler that captures the root of the whole activity. */
        public Screenshot(Activity activity) {
            final View contentView = activity.findViewById(android.R.id.content);
            this.view = contentView.getRootView();
        }
        /** Take a snapshot of the view. */
        public Bitmap snap() {
            Bitmap bitmap = Bitmap.createBitmap(this.view.getWidth(), this.view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            view.draw(canvas);
            return bitmap;
        }
    }








//    public static Bitmap takeScreenshot(View view, Bitmap.Config quality) {
//        Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), quality);
//        Canvas canvas = new Canvas(bitmap);
//
//        Drawable backgroundDrawable = view.getBackground();
//        if (backgroundDrawable != null) {
//            backgroundDrawable.draw(canvas);
//        } else {
//            canvas.drawColor(Color.WHITE);
//        }
//        view.draw(canvas);
//        return bitmap;
//    }





//
//@Override
//public void onCreate(final Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_main);
//
//    imageUri =
//    mGPUImage = new GPUImage(this);
//    ImageView=setGLSurfaceView((OpenGLView) findViewById(R.id.openGLView));
//    mGPUImage.setImage(imageUri); // this loads image on the current thread, should be run in a thread
//    mGPUImage.setFilter(new GPUImageSepiaFilter());
//
//    // Later when image should be saved saved:
//    mGPUImage.saveToPictures("GPUImage", "ImageWithFilter.jpg", null);
//
//
//
//
//    imGPUImage = new GPUImage(this);
//    mGPUImage.setGLSurfaceView((GLSurfaceView) findViewById(R.id.surfaceView));
//    mGPUImage.setImage(imageUri);
//    sepiaFilter = new GPUImageSepiaFilter()
//    mGPUImage.setFilter(sepiaFilter);
//
//
//
//    Uri imageUri = ...;
//    mGPUImage = new GPUImage(this);
//    mGPUImage.setGLSurfaceView((GLSurfaceView) findViewById(R.id.surfaceView));
//    mGPUImage.setImage(imageUri);
//    sepiaFilter = new GPUImageSepiaFilter()
//    mGPUImage.setFilter(sepiaFilter);
//
//}



    @Override
    protected void onResume() {
        super.onResume();
        openGLView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        openGLView.onPause();
        takeScreenshot();
//        Log.d("BLA", "run: hen");
//        try {
//            sleep(2000);
//
//            Log.d("BLA", "run: almogggg");
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }

    public void takeScreenshot(View view) {
        this.takeScreenshot();
    }
}
