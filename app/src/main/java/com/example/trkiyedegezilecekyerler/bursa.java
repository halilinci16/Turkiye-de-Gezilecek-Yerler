package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bursa extends AppCompatActivity {
    ImageButton inst;
    ImageButton twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bursa);

        inst = findViewById(R.id.instagram);
        twit = findViewById(R.id.twitter);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/bursabuyuksehir/");
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/bursabuyuksehir?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
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
    public void ulucami(View view) {
        Intent intentulucami = new Intent(getApplicationContext(),ulucami.class);
        finish();
        startActivity(intentulucami);
    }
    public void tophane(View view) {
        Intent intenttophane = new Intent(getApplicationContext(), tophane.class);
        finish();
        startActivity(intenttophane);
    }
    public void uludag(View view) {
        Intent intentuludag = new Intent(getApplicationContext(), uludag.class);
        finish();
        startActivity(intentuludag);
    }
    public void hanlar(View view) {
        Intent intenthanlar = new Intent(getApplicationContext(), hanlar.class);
        finish();
        startActivity(intenthanlar);
    }
    public void cumalikizik(View view) {
        Intent intentcumalikizik = new Intent(getApplicationContext(), cumalikizik.class);
        finish();
        startActivity(intentcumalikizik);
    }
    public void mudanya(View view) {
        Intent intentmudanya = new Intent(getApplicationContext(), mudanya.class);
        finish();
        startActivity(intentmudanya);
    }
    public void golyazi(View view) {
        Intent intentgolyazi = new Intent(getApplicationContext(), golyazi.class);
        finish();
        startActivity(intentgolyazi);
    }
    public void irgandi(View view) {
        Intent intentirgandi= new Intent(getApplicationContext(), irgandi.class);
        finish();
        startActivity(intentirgandi);
    }
    public void cumhuriyet(View view) {
        Intent intentcumhuriyet = new Intent(getApplicationContext(), cumhuriyet.class);
        finish();
        startActivity(intentcumhuriyet);
    }
    public void arabamuze(View view) {
        Intent intentarabamuze = new Intent(getApplicationContext(), arabamuze.class);
        finish();
        startActivity(intentarabamuze);
    }
}