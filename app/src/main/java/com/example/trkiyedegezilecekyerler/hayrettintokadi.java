package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class hayrettintokadi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayrettintokadi);
    }
    @Override
    public void onBackPressed() {
        Intent backintent = new Intent(getApplicationContext(), bolu.class);
        finish();
        startActivity(backintent);
    }
}