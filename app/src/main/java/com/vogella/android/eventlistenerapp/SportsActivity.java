package com.vogella.android.eventlistenerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SportsActivity extends AppCompatActivity {

    private ImageButton logoBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        logoBtn = findViewById(R.id.logoImage);


        logoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logoIntent = new Intent(SportsActivity.this, MainActivity.class);
                startActivity(logoIntent);
            }
        });

    }
}
