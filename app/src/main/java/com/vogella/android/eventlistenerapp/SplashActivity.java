package com.vogella.android.eventlistenerapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //1. Create thread obj
        MainActivityThread mt = new MainActivityThread();

        //2. start the runnable obj
        mt.start();
    }

    //create a new activity thread
    class MainActivityThread extends Thread {
        public void run() {

            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);

            startActivity(mainIntent);

            finish();
        }

    }
}
