package com.example.restarurantapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class Pop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*0.6),(int) (height*0.6));
    }
}

