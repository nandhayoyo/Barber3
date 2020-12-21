package com.example.acer.barber3;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StyleActivity extends AppCompatActivity {

    Button pomadeLink;
    Button sisirLink;
    Button gelLink;
    Button clipperLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style);

        pomadeLink = findViewById(R.id.btn_pomade);
        sisirLink = findViewById(R.id.btn_sisir);
        gelLink = findViewById(R.id.btn_gel);
        clipperLink = findViewById(R.id.btn_clipper);

        pomadeLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent olpomade = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shopee.co.id/smithmensupply"));
                startActivity(olpomade);
            }
        });

        sisirLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent olsisir = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shopee.co.id/-784849-SISIR-POMADE-LIPAT-sisir-rambut-murah-sisir-cowo-sisir-laki-switch-blade-comb-si-i.94873513.4612109389"));
                startActivity(olsisir);
            }
        });

        gelLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent olgel = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shopee.co.id/Axe-Hairstyling-Slick-Back-Shine-Gel-75-ml-i.14318452.1515340526"));
                startActivity(olgel);
            }
        });

        clipperLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent olclipper = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shopee.co.id/Kemei-km-1997-Alat-Cukur-Rambut-Elektrik-Profesional-Full-Metal-Rechargeable-i.9500163.5808308245"));
                startActivity(olclipper);
            }
        });
    }
}
