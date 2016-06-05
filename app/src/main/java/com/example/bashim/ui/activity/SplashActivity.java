package com.example.bashim.ui.activity;

import android.support.v7.app.AppCompatActivity;

import com.example.bashim.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_splash)
public class SplashActivity extends AppCompatActivity {
    @AfterViews
    void ready() {
        doInBackground();
    }


    @Background(id="start",delay=3000)
    void doInBackground() {
        MainActivity_.intent(this).start();
    }
}