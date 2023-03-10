package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class izmir extends AppCompatActivity {
    ImageButton inst;
    ImageButton twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izmir);

        inst = findViewById(R.id.instagram);
        twit = findViewById(R.id.twitter);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/izmirbuyuksehirbelediyesi/");
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/izmirbld?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
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
    public void cesme(View view) {
        Intent intentcesme= new Intent(getApplicationContext(),cesme.class);
        finish();
        startActivity(intentcesme);
    }
    public void alacati(View view) {
        Intent intentalacati= new Intent(getApplicationContext(),alacati.class);
        finish();
        startActivity(intentalacati);
    }
    public void kordon(View view) {
        Intent intentkordon= new Intent(getApplicationContext(),kordon.class);
        finish();
        startActivity(intentkordon);
    }
    public void efes(View view) {
        Intent intentefes= new Intent(getApplicationContext(),efes.class);
        finish();
        startActivity(intentefes);
    }
    public void seferihisar(View view) {
        Intent intentseferihisar= new Intent(getApplicationContext(),seferihisar.class);
        finish();
        startActivity(intentseferihisar);
    }
    public void bergama(View view) {
        Intent intentbergama= new Intent(getApplicationContext(),bergama.class);
        finish();
        startActivity(intentbergama);
    }
    public void sirince(View view) {
        Intent intentsirince= new Intent(getApplicationContext(),sirince.class);
        finish();
        startActivity(intentsirince);
    }
    public void karagol(View view) {
        Intent intentkaragol= new Intent(getApplicationContext(),karagol.class);
        finish();
        startActivity(intentkaragol);
    }
    public void kemeralti(View view) {
        Intent intentkemeralti= new Intent(getApplicationContext(),kemeralti.class);
        finish();
        startActivity(intentkemeralti);
    }
    public void izmirsaat(View view) {
        Intent intentizmirsaat = new Intent(getApplicationContext(), izmirsaat.class);
        finish();
        startActivity(intentizmirsaat);
    }

}