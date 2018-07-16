package com.example.jovygaming.signovocav10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "mytag";

    static {
        if(!OpenCVLoader.initDebug()){
            Log.d(TAG, "opencv not loaded");
        }else{
            Log.d(TAG, "opencv loaded successfully");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
