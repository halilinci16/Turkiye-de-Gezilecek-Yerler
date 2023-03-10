package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class seytan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seytan);
    }
    @Override
    public void onBackPressed() {
        Intent backintent = new Intent(getApplicationContext(), konya.class);
        finish();
        startActivity(backintent);
    }
}