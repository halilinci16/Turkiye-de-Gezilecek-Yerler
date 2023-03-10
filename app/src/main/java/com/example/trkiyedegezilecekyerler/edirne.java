package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class edirne extends AppCompatActivity {
    ImageButton inst;
    ImageButton twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edirne);

        inst = findViewById(R.id.instagram);
        twit = findViewById(R.id.twitter);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/edirnebelediye/");
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/EdirneBel?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
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
    public void kesan(View view) {
        Intent intentkesan = new Intent(getApplicationContext(),kesan.class);
        finish();
        startActivity(intentkesan);
    }
    public void erikli(View view) {
        Intent intenterikli = new Intent(getApplicationContext(), erikli.class);
        finish();
        startActivity(intenterikli);
    }
    public void enez(View view) {
        Intent intentenez = new Intent(getApplicationContext(), enez.class);
        finish();
        startActivity(intentenez);
    }
    public void selimiye(View view) {
        Intent intentselimiye = new Intent(getApplicationContext(), selimiye.class);
        finish();
        startActivity(intentselimiye);
    }
    public void saros(View view) {
        Intent intentsaros = new Intent(getApplicationContext(), saros.class);
        finish();
        startActivity(intentsaros);
    }
    public void mericnehri(View view) {
        Intent intentmericnehri = new Intent(getApplicationContext(), mericnehri.class);
        finish();
        startActivity(intentmericnehri);
    }
    public void merickoprusu(View view) {
        Intent intentmerickoprusu = new Intent(getApplicationContext(), merickoprusu.class);
        finish();
        startActivity(intentmerickoprusu);
    }
    public void saraclar(View view) {
        Intent intentsaraclar= new Intent(getApplicationContext(), saraclar.class);
        finish();
        startActivity(intentsaraclar);
    }
    public void lozan(View view) {
        Intent intentlozan = new Intent(getApplicationContext(), lozan.class);
        finish();
        startActivity(intentlozan);
    }
    public void alipasa(View view) {
        Intent intentalipasa = new Intent(getApplicationContext(), alipasa.class);
        finish();
        startActivity(intentalipasa);
    }
}