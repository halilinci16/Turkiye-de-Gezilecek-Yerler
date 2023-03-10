package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class mevlana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mevlana);
    }
    @Override
    public void onBackPressed() {
        Intent backintent = new Intent(getApplicationContext(), konya.class);
        finish();
        startActivity(backintent);
    }
}