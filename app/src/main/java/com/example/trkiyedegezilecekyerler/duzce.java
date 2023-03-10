package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class duzce extends AppCompatActivity {
    ImageButton inst;
    ImageButton twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duzce);

        inst = findViewById(R.id.instagram);
        twit = findViewById(R.id.twitter);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/duzcebld/?hl=tr");
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/duzcebld?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
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
    public void purenli(View view) {
        Intent intentpurenli = new Intent(getApplicationContext(),purenli.class);
        finish();
        startActivity(intentpurenli);
    }
    public void melen(View view) {
        Intent intentmelen = new Intent(getApplicationContext(), melen.class);
        finish();
        startActivity(intentmelen);
    }
    public void efteni(View view) {
        Intent intentefteni = new Intent(getApplicationContext(), efteni.class);
        finish();
        startActivity(intentefteni);
    }
    public void fakilli(View view) {
        Intent intentfakilli = new Intent(getApplicationContext(), fakilli.class);
        finish();
        startActivity(intentfakilli);
    }
    public void ceneviz(View view) {
        Intent intentceneviz = new Intent(getApplicationContext(), ceneviz.class);
        finish();
        startActivity(intentceneviz);
    }
    public void aydinpinar(View view) {
        Intent intentaydinpinar = new Intent(getApplicationContext(), aydinpinar.class);
        finish();
        startActivity(intentaydinpinar);
    }
    public void kurugol(View view) {
        Intent intentkurugol = new Intent(getApplicationContext(), kurugol.class);
        finish();
        startActivity(intentkurugol);
    }
    public void akcakoca(View view) {
        Intent intentakcakoca= new Intent(getApplicationContext(), akcakoca.class);
        finish();
        startActivity(intentakcakoca);
    }
    public void torkul(View view) {
        Intent intenttorkul = new Intent(getApplicationContext(), torkul.class);
        finish();
        startActivity(intenttorkul);
    }
    public void toptepe(View view) {
        Intent intenttoptepe = new Intent(getApplicationContext(), toptepe.class);
        finish();
        startActivity(intenttoptepe);
    }
}