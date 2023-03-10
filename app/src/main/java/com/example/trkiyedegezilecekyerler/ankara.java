package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ankara extends AppCompatActivity {
    ImageButton inst;
    ImageButton twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankara);

        inst = findViewById(R.id.instagram);
        twit = findViewById(R.id.twitter);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/ankarabbld/");
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/ankarabbld?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
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
    public void anitkabir(View view) {
        Intent intentanitkabir = new Intent(getApplicationContext(),anitkabir.class);
        finish();
        startActivity(intentanitkabir);
    }
    public void beypazari(View view) {
        Intent intentbeypazari = new Intent(getApplicationContext(), beypazari.class);
        finish();
        startActivity(intentbeypazari);
    }
    public void tuzgolu(View view) {
        Intent intenttuzgolu = new Intent(getApplicationContext(), tuzgolu.class);
        finish();
        startActivity(intenttuzgolu);
    }
    public void kizilcihamam(View view) {
        Intent intentkizilcihamam = new Intent(getApplicationContext(), kizilcihamam.class);
        finish();
        startActivity(intentkizilcihamam);
    }
    public void ankarakalesi(View view) {
        Intent intentankarakalesi = new Intent(getApplicationContext(), ankarakalesi.class);
        finish();
        startActivity(intentankarakalesi);
    }
    public void eymirgolu(View view) {
        Intent intenteymirgolu = new Intent(getApplicationContext(), eymirgolu.class);
        finish();
        startActivity(intenteymirgolu);
    }
    public void atakule(View view) {
        Intent intentatakule = new Intent(getApplicationContext(), atakule.class);
        finish();
        startActivity(intentatakule);
    }
    public void kugulugol(View view) {
        Intent intentkugulugol= new Intent(getApplicationContext(), kugulugol.class);
        finish();
        startActivity(intentkugulugol);
    }
    public void kizilaymeydani(View view) {
        Intent intentkizilaymeydani = new Intent(getApplicationContext(), kizilaymeydani.class);
        finish();
        startActivity(intentkizilaymeydani);
    }
    public void kocatepecami(View view) {
        Intent intentkocatepecami= new Intent(getApplicationContext(), kocatepecami.class);
        finish();
        startActivity(intentkocatepecami);
    }
}