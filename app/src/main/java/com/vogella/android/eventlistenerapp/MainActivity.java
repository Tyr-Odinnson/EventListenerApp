package com.vogella.android.eventlistenerapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {

    //Sport - 1: Declare "Sport" variable as ImageView type
    private ImageView sportButton;
    private Object SportsActivity;

    //Conventions - 1: Declare "Conventions" variable as ImageView type
    private ImageView Conventions;

    //Theatre - 1: Declare "Conventions" variable as ImageView type
    private ImageView Theatre;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //About AMES - 2: Find references and do casting for "aboutAmes"
        sportButton = (ImageView) findViewById(R.id.sportButton);

        //About AMES - 3: Set click listener for the "aboutAmes" ImageView
        sportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create an Intent object to transition from this activity (MainActivity) to
                // another activity (AboutAMES_Activity)
                Intent intent = new Intent(MainActivity.this, SportsActivity.class);
                startActivity(intent); //Start Activity
            }
        });

        //Theatre - 2: Find references and do casting for "Theatre"
        ImageView theatreButton = (ImageView) findViewById(R.id.theatreButton);

        //Theatre - 3: Set click listener for the "Theatre" ImageView
        theatreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create an Intent object to transition from this activity (MainActivity) to
                // another activity (AboutAC_Activity)
                Intent intent = new Intent(MainActivity.this, TheatreActivity.class);
                startActivity(intent);//Start Activity

            }
        });


        //Conventions - 2: Find references and do casting for "aboutAmes"
        ImageView conventionButton = (ImageView) findViewById(R.id.conventionButton);

        //Conventions - 3: Set click listener for the "aboutAmes" ImageView
        conventionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create an Intent object to transition from this activity (MainActivity) to
                // another activity Convention Activity)
                Intent intent = new Intent(MainActivity.this, ConventionsActivity.class);
                startActivity(intent); //Start Activity
            }
        });
    }
}