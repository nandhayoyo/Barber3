package com.example.acer.barber3;

// import android.annotation.SuppressLint;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

import androidx.annotation.NonNull;


public class MainActivity extends AppCompatActivity{


    ImageView info_image;
    ImageView plan_image;
    ImageView loc_image;
    ImageView style_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loc_image = findViewById(R.id.loc_button);
        info_image = findViewById(R.id.info_button);
        plan_image = findViewById(R.id.plan_button);
        style_image = findViewById(R.id.style_button);


        loc_image.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadActivity = new Intent(MainActivity.this, LocationActivity.class);
                startActivity(intentLoadActivity);
            }
        });

        info_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, Main_info.class);
                startActivity(intentLoadNewActivity);
            }
        });

        plan_image.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, Main_plan.class);
                startActivity(intentLoadNewActivity);
            }
        });

        style_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent styleactv = new Intent(MainActivity.this, StyleActivity.class);
                startActivity(styleactv);
            }
        });



    }
}
