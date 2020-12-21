package com.example.acer.barber3;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocationActivity extends AppCompatActivity {

    Button locBronze;
    Button locOdysen;
    Button locDpr;
    Button locArfa;
    Button locDlucky;
    Button locYugen;
    Button locDaniels;
    Button locHairock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        locBronze = findViewById(R.id.btn_bronze);
        locOdysen = findViewById(R.id.btn_luxo);
        locDpr = findViewById(R.id.btn_dpr);
        locArfa = findViewById(R.id.btn_arfa);
        locDlucky = findViewById(R.id.btn_dlucky);
        locYugen = findViewById(R.id.btn_yugen);
        locDaniels = findViewById(R.id.btn_daniels);
        locHairock = findViewById(R.id.btn_hairock);

        locBronze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bronzeLoc = new Intent(LocationActivity.this, MapsActivity.class);
                startActivity(bronzeLoc);
            }
        });

        locOdysen.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent luxoLoc = new Intent(LocationActivity.this, MapsActivity2.class);
                startActivity(luxoLoc);
            }
        });

        locDpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dprLoc = new Intent(LocationActivity.this, MapsDpr.class );
                startActivity(dprLoc);
            }
        });

        locArfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arfaLoc = new Intent(LocationActivity.this, MapsArfa.class);
                startActivity(arfaLoc);
            }
        });

        locDlucky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dlucky = new Intent(LocationActivity.this, MapsDlucky.class);
                startActivity(dlucky);
            }
        });

        locYugen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yugen = new Intent(LocationActivity.this, MapsYugen.class);
                startActivity(yugen);
            }
        });

        locDaniels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daniels = new Intent(LocationActivity.this, MapsDaniels.class );
                startActivity(daniels);
            }
        });

        locHairock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hairock = new Intent(LocationActivity.this, MapsHairock.class);
                startActivity(hairock);
            }
        });
    }
}
