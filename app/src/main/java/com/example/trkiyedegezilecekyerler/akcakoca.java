package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class akcakoca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akcakoca);
    }
    @Override
    public void onBackPressed() {
        Intent backintent = new Intent(getApplicationContext(), duzce.class);
        finish();
        startActivity(backintent);
    }
}