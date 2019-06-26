package com.vogella.android.eventlistenerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ConventionsActivity extends AppCompatActivity {

    private ImageButton logoBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conventions);
        logoBtn = findViewById(R.id.logoImage);


        logoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logoIntent = new Intent(ConventionsActivity.this, MainActivity.class);
                startActivity(logoIntent);
            }
        });

    }
}
