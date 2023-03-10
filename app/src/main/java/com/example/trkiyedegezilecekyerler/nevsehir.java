package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class nevsehir extends AppCompatActivity {
    ImageButton inst;
    ImageButton twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nevsehir);

        inst = findViewById(R.id.instagram);
        twit = findViewById(R.id.twitter);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/nevsehir_bel/");
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/nevsehir_bel?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
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
        Intent intenturgup = new Intent(getApplicationContext(),urgup.class);
        finish();
        startActivity(intenturgup);
    }
    public void goreme(View view) {
        Intent intentgoreme = new Intent(getApplicationContext(), goreme.class);
        finish();
        startActivity(intentgoreme);
    }
    public void avanos(View view) {
        Intent intentavanos = new Intent(getApplicationContext(), avanos.class);
        finish();
        startActivity(intentavanos);
    }
    public void peribacalari(View view) {
        Intent intentperibacalari = new Intent(getApplicationContext(), peribacalari.class);
        finish();
        startActivity(intentperibacalari);
    }
    public void ortahisar(View view) {
        Intent intentortahisar = new Intent(getApplicationContext(), ortahisar.class);
        finish();
        startActivity(intentortahisar);
    }
    public void ihlara(View view) {
        Intent intentihlara = new Intent(getApplicationContext(), ihlara.class);
        finish();
        startActivity(intentihlara);
    }
    public void asmali(View view) {
        Intent intentasmali = new Intent(getApplicationContext(), asmali.class);
        finish();
        startActivity(intentasmali);
    }
    public void guvercinlik(View view) {
        Intent intentguvercinlik= new Intent(getApplicationContext(), guvercinlik.class);
        finish();
        startActivity(intentguvercinlik);
    }
    public void derinkuyu(View view) {
        Intent intentderinkuyu = new Intent(getApplicationContext(), derinkuyu.class);
        finish();
        startActivity(intentderinkuyu);
    }
    public void temenni(View view) {
        Intent intenttemenni = new Intent(getApplicationContext(), temenni.class);
        finish();
        startActivity(intenttemenni);
    }

}