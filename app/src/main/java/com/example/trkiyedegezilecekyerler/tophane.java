package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tophane extends AppCompatActivity {
    ImageButton knm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tophane);
    }
    @Override
    public void onBackPressed() {
        Intent backintent = new Intent(getApplicationContext(), bursa.class);
        finish();
        startActivity(backintent);

        knm = findViewById(R.id.konum);
        knm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/place/Tophane+Saat+Kulesi/@40.1872988,29.0568669,18.54z/data=!4m9!1m2!2m1!1sbursa+tophane+saat+kulesi!3m5!1s0x14ca3de2cae40b37:0x9bf6a2c5985be498!8m2!3d40.1876274!4d29.057597!15sChlidXJzYSB0b3BoYW5lIHNhYXQga3VsZXNpWhsiGWJ1cnNhIHRvcGhhbmUgc2FhdCBrdWxlc2mSARJ0b3VyaXN0X2F0dHJhY3Rpb26aASRDaGREU1VoTk1HOW5TMFZKUTBGblNVUXdiVzl4Y0RGUlJSQUI");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}