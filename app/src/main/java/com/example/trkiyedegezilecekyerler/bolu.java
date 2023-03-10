package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class bolu extends AppCompatActivity {
    ImageButton inst;
    ImageButton twit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolu);

        inst = findViewById(R.id.instagram);
        twit = findViewById(R.id.twitter);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/bolubelediyesi/");
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/bolu_belediyesi?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    @Override
    public void onBackPressed() {
        Intent backintent = new Intent(getApplicationContext(),MainActivity.class);
        finish();
        startActivity(backintent);
    }
    public void yedigoller(View view) {
        Intent intentyedigoller = new Intent(getApplicationContext(),yedigoller.class);
        finish();
        startActivity(intentyedigoller);
    }
    public void kartalkaya(View view) {
        Intent intentkartalkaya = new Intent(getApplicationContext(),kartalkaya.class);
        finish();
        startActivity(intentkartalkaya);
    }
    public void abantgolu(View view) {
        Intent intentabantgolu = new Intent(getApplicationContext(),abantgolu.class);
        finish();
        startActivity(intentabantgolu);
    }
    public void mudurnuev(View view) {
        Intent intentmudurnuev = new Intent(getApplicationContext(),mudurnuev.class);
        finish();
        startActivity(intentmudurnuev);
    }
    public void golcukparki(View view) {
        Intent intentgolcukparki = new Intent(getApplicationContext(),golcukparki.class);
        finish();
        startActivity(intentgolcukparki);
    }
    public void akkayatraverten(View view) {
        Intent intentakkayatraverten = new Intent(getApplicationContext(),akkayatraverten.class);
        finish();
        startActivity(intentakkayatraverten);
    }
    public void sarialanyayla(View view) {
        Intent intentsarialanyayla = new Intent(getApplicationContext(),sarialanyayla.class);
        finish();
        startActivity(intentsarialanyayla);
    }
    public void aksemseddin(View view) {
        Intent intentaksemseddin = new Intent(getApplicationContext(),aksemseddin.class);
        finish();
        startActivity(intentaksemseddin);
    }
    public void yildirimbeyazitcami(View view) {
        Intent intentyildirimbeyazitcami = new Intent(getApplicationContext(),yildirimbeyazitcami.class);
        finish();
        startActivity(intentyildirimbeyazitcami);
    }
    public void hayrettintokadi(View view) {
        Intent intenthayrettintokadi = new Intent(getApplicationContext(),hayrettintokadi.class);
        finish();
        startActivity(intenthayrettintokadi);
    }
}