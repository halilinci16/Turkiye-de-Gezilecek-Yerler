package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ulucami extends AppCompatActivity {

    ImageButton knm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulucami);

        knm = findViewById(R.id.konum);
        knm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/place/Ulu+Cami/@40.1834784,29.0639737,16.63z/data=!4m5!3m4!1s0x14ca383f1ab219dd:0x26f1946c7d131ee3!8m2!3d40.1838478!4d29.0617098");
            }
        });


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


    @Override
    public void onBackPressed() {
        Intent backintent = new Intent(getApplicationContext(), bursa.class);
        finish();
        startActivity(backintent);
    }
}