package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class konya extends AppCompatActivity {
    ImageButton inst;
    ImageButton twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konya);

        inst = findViewById(R.id.instagram);
        twit = findViewById(R.id.twitter);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/konyabuyuksehir/");
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/Konyabuyuksehir?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
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
    public void meram(View view) {
        Intent intentmeram = new Intent(getApplicationContext(),meram.class);
        finish();
        startActivity(intentmeram);
    }
    public void beysehir(View view) {
        Intent intentbeysehir = new Intent(getApplicationContext(), beysehir.class);
        finish();
        startActivity(intentbeysehir);
    }
    public void mevlana(View view) {
        Intent intentmevlana = new Intent(getApplicationContext(), mevlana.class);
        finish();
        startActivity(intentmevlana);
    }
    public void yerkopru(View view) {
        Intent intentyerkopru = new Intent(getApplicationContext(), yerkopru.class);
        finish();
        startActivity(intentyerkopru);
    }
    public void alaaddin(View view) {
        Intent intentalaaddin = new Intent(getApplicationContext(), alaaddin.class);
        finish();
        startActivity(intentalaaddin);
    }
    public void catalhoyuk(View view) {
        Intent intentcatalhoyuk = new Intent(getApplicationContext(), catalhoyuk.class);
        finish();
        startActivity(intentcatalhoyuk);
    }
    public void meke(View view) {
        Intent intentmeke = new Intent(getApplicationContext(), meke.class);
        finish();
        startActivity(intentmeke);
    }
    public void kelebek(View view) {
        Intent intentkelebek= new Intent(getApplicationContext(), kelebek.class);
        finish();
        startActivity(intentkelebek);
    }
    public void seytan(View view) {
        Intent intentseytan = new Intent(getApplicationContext(), seytan.class);
        finish();
        startActivity(intentseytan);
    }
    public void nasrettin(View view) {
        Intent intentnasrettin = new Intent(getApplicationContext(), nasrettin.class);
        finish();
        startActivity(intentnasrettin);
    }
}