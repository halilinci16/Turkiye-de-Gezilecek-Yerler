package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class istanbul extends AppCompatActivity {
    ImageButton inst;
    ImageButton twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istanbul);

        inst = findViewById(R.id.instagram);
        twit = findViewById(R.id.twitter);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/istanbulbuyuksehirbld/?hl=tr");
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/istanbulbld?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
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
    public void sultanahmet(View view) {
        Intent intentsultanahmet = new Intent(getApplicationContext(),sultanahmet.class);
        finish();
        startActivity(intentsultanahmet);
    }
    public void ayasofya(View view) {
        Intent intentayasofya= new Intent(getApplicationContext(), ayasofya.class);
        finish();
        startActivity(intentayasofya);
    }
    public void topkapi(View view) {
        Intent intenttopkapi = new Intent(getApplicationContext(), topkapi.class);
        finish();
        startActivity(intenttopkapi);
    }
    public void galata(View view) {
        Intent intentgalata = new Intent(getApplicationContext(), galata.class);
        finish();
        startActivity(intentgalata);
    }
    public void rumeli(View view) {
        Intent intentrumeli = new Intent(getApplicationContext(), rumeli.class);
        finish();
        startActivity(intentrumeli);
    }
    public void kizkulesi(View view) {
        Intent intentkizkulesi = new Intent(getApplicationContext(), kizkulesi.class);
        finish();
        startActivity(intentkizkulesi);
    }
    public void gulhane(View view) {
        Intent intentgulhane = new Intent(getApplicationContext(),gulhane.class);
        finish();
        startActivity(intentgulhane);
    }
    public void kapali(View view) {
        Intent intentkapali= new Intent(getApplicationContext(), kapali.class);
        finish();
        startActivity(intentkapali);
    }
    public void istiklal(View view) {
        Intent intentistiklal= new Intent(getApplicationContext(), istiklal.class);
        finish();
        startActivity(intentistiklal);
    }
    public void dolmabahce(View view) {
        Intent intentdolmabahce= new Intent(getApplicationContext(), dolmabahce.class);
        finish();
        startActivity(intentdolmabahce);
    }
}