package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class canakkale extends AppCompatActivity {
    ImageButton inst;
    ImageButton twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canakkale);

        inst = findViewById(R.id.instagram);
        twit = findViewById(R.id.twitter);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/ckalebelediye/");
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/ckalebelediye?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
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
    public void bozcada(View view) {
        Intent intentbozcada = new Intent(getApplicationContext(),bozcada.class);
        finish();
        startActivity(intentbozcada);
    }
    public void gelibolu(View view) {
        Intent intentgelibolu = new Intent(getApplicationContext(), gelibolu.class);
        finish();
        startActivity(intentgelibolu);
    }
    public void ayvacik(View view) {
        Intent intentayvacik = new Intent(getApplicationContext(), ayvacik.class);
        finish();
        startActivity(intentayvacik);
    }
    public void lapseki(View view) {
        Intent intentlapseki = new Intent(getApplicationContext(), lapseki.class);
        finish();
        startActivity(intentlapseki);
    }
    public void canakkalekordon(View view) {
        Intent intentcanakkalekordon = new Intent(getApplicationContext(), canakkalekordon.class);
        finish();
        startActivity(intentcanakkalekordon);
    }
    public void harpmuzesi(View view) {
        Intent intentharpmuzesi = new Intent(getApplicationContext(), harpmuzesi.class);
        finish();
        startActivity(intentharpmuzesi);
    }
    public void truva(View view) {
        Intent intenttruva = new Intent(getApplicationContext(), truva.class);
        finish();
        startActivity(intenttruva);
    }
    public void conkbayiri(View view) {
        Intent intentconkbayiri= new Intent(getApplicationContext(), conkbayiri.class);
        finish();
        startActivity(intentconkbayiri);
    }
    public void aynalicarsi(View view) {
        Intent intentaynalicarsi = new Intent(getApplicationContext(), aynalicarsi.class);
        finish();
        startActivity(intentaynalicarsi);
    }
    public void canakkalesehitlik(View view) {
        Intent intentcanakkalesehitlik = new Intent(getApplicationContext(), canakkalesehitlik.class);
        finish();
        startActivity(intentcanakkalesehitlik);
    }
    public void kilitbahir(View view) {
        Intent intentkilitbahir = new Intent(getApplicationContext(), kilitbahir.class);
        finish();
        startActivity(intentkilitbahir);
    }
    public void anzak(View view) {
        Intent intentanzak = new Intent(getApplicationContext(), anzak.class);
        finish();
        startActivity(intentanzak);
    }
    public void piyade(View view) {
        Intent intentpiyade = new Intent(getApplicationContext(), piyade.class);
        finish();
        startActivity(intentpiyade);
    }


}


