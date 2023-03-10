package com.example.trkiyedegezilecekyerler;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class gulhane extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulhane);
    }
    @Override
    public void onBackPressed() {
        Intent backintent = new Intent(getApplicationContext(), istanbul.class);
        finish();
        startActivity(backintent);
    }
}