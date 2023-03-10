package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class kapali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kapali);
    }
    @Override
    public void onBackPressed() {
        Intent backintent = new Intent(getApplicationContext(), istanbul.class);
        finish();
        startActivity(backintent);
    }
}