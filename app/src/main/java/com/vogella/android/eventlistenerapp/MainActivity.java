package com.vogella.android.eventlistenerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton comedyBtn;
    private ImageButton musicBtn;
    private ImageButton communityBtn;
    private ImageButton sportsBtn;
    private ImageButton conventionsBtn;
    private ImageButton theatreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comedyBtn = findViewById(R.id.comedyButton);
        musicBtn = findViewById(R.id.musicButton);
        communityBtn = findViewById(R.id.communityButton);
        sportsBtn = findViewById(R.id.sportsButton);
        conventionsBtn = findViewById(R.id.conventionButton);
        theatreBtn = findViewById(R.id.theatreButton);
        comedyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comedyIntent = new Intent(MainActivity.this, ComedyActivity.class);
                startActivity(comedyIntent);
            }
        });
        musicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(musicIntent);
            }
        });
        communityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent communityIntent = new Intent(MainActivity.this, CommunityActivity.class);
                startActivity(communityIntent);
            }
        });
        sportsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sportsIntent = new Intent(MainActivity.this, SportsActivity.class);
                startActivity(sportsIntent);
            }
        });
        conventionsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conventionsIntent = new Intent(MainActivity.this, ConventionsActivity.class);
                startActivity(conventionsIntent);
            }
        });
        theatreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent theatreIntent = new Intent(MainActivity.this, TheatreActivity.class);
                startActivity(theatreIntent);
            }
        });


   }
}