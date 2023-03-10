package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class bergama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bergama);
    }
    @Override
    public void onBackPressed() {
        Intent backintent = new Intent(getApplicationContext(), izmir.class);
        finish();
        startActivity(backintent);
    }
}