package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class anitkabir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anitkabir);
    }
    @Override
    public void onBackPressed() {
        Intent backintent = new Intent(getApplicationContext(), ankara.class);
        finish();
        startActivity(backintent);
    }
}