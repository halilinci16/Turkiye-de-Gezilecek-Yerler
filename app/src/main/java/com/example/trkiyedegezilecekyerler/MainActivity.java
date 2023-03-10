package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private ListView lv;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> list;
    private SearchView sv;
    private String gidilecek_sehir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sv = (SearchView) findViewById(R.id.search);
        lv = (ListView) findViewById(R.id.listview);

        list = new ArrayList<>();
        list.add("Bursa");
        list.add("İstanbul");
        list.add("Ankara");
        list.add("İzmir");
        list.add("Bolu");
        list.add("Konya");
        list.add("Nevşehir");
        list.add("Düzce");
        list.add("Edirne");
        list.add("Çanakkale");


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);


        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }


        });
        sv.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) {
                    lv.setVisibility(View.VISIBLE);
                } else {
                    lv.setVisibility(View.GONE);
                }
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                gidilecek_sehir = adapter.getItem(i).toString();

                if (gidilecek_sehir == "Bursa") {
                    Intent intentbursa = new Intent(getApplicationContext(), bursa.class);
                    finish();
                    startActivity(intentbursa);
                }
                if (gidilecek_sehir == "İstanbul") {
                    Intent intentistanbul = new Intent(getApplicationContext(), istanbul.class);
                    finish();
                    startActivity(intentistanbul);
                }
                if (gidilecek_sehir == "Ankara") {
                    Intent intentankara = new Intent(getApplicationContext(), ankara.class);
                    finish();
                    startActivity(intentankara);
                }
                if (gidilecek_sehir == "İzmir") {
                    Intent intentizmir = new Intent(getApplicationContext(), izmir.class);
                    finish();
                    startActivity(intentizmir);
                }
                if (gidilecek_sehir == "Bolu") {
                    Intent intentbolu = new Intent(getApplicationContext(), bolu.class);
                    finish();
                    startActivity(intentbolu);
                }
                if (gidilecek_sehir == "Konya") {
                    Intent intentkonya = new Intent(getApplicationContext(), konya.class);
                    finish();
                    startActivity(intentkonya);
                }
                if (gidilecek_sehir == "Nevşehir") {
                    Intent intentnevsehir = new Intent(getApplicationContext(), nevsehir.class);
                    finish();
                    startActivity(intentnevsehir);
                }
                if (gidilecek_sehir == "Düzce") {
                    Intent intentduzce = new Intent(getApplicationContext(), duzce.class);
                    finish();
                    startActivity(intentduzce);
                }
                if (gidilecek_sehir == "Edirne") {
                    Intent intentedirne = new Intent(getApplicationContext(), edirne.class);
                    finish();
                    startActivity(intentedirne);
                }
                if (gidilecek_sehir == "Çanakkale") {
                    Intent intentcanakkale = new Intent(getApplicationContext(), canakkale.class);
                    finish();
                    startActivity(intentcanakkale);
                }

            }
        });


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Türkiyede Gezilecek Yerler");
        alert.setIcon(R.mipmap.ic_trdegezilecekyerler);
        alert.setMessage("Uygulamadan Çıkmak İstediğinize Emin Misiniz ?");
        alert.setNegativeButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(0);
            }
        });
        alert.setPositiveButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        alert.show();
    }


    public void bursa(View view) {
        Intent intentbursa = new Intent(getApplicationContext(), bursa.class);
        finish();
        startActivity(intentbursa);
    }

    public void istanbul(View view) {
        Intent intentistanbul = new Intent(getApplicationContext(), istanbul.class);
        finish();
        startActivity(intentistanbul);
    }

    public void ankara(View view) {
        Intent intentankara = new Intent(getApplicationContext(), ankara.class);
        finish();
        startActivity(intentankara);
    }
    public void izmir(View view) {
        Intent intentizmir = new Intent(getApplicationContext(), izmir.class);
        finish();
        startActivity(intentizmir);
    }
    public void bolu(View view) {
        Intent intentbolu = new Intent(getApplicationContext(), bolu.class);
        finish();
        startActivity(intentbolu);
    }
    public void konya(View view) {
        Intent intentkonya = new Intent(getApplicationContext(), konya.class);
        finish();
        startActivity(intentkonya);
    }
    public void nevsehir(View view) {
        Intent intentnevsehir = new Intent(getApplicationContext(), nevsehir.class);
        finish();
        startActivity(intentnevsehir);
    }
    public void duzce(View view) {
        Intent intentduzce = new Intent(getApplicationContext(), duzce.class);
        finish();
        startActivity(intentduzce);
    }
    public void edirne(View view) {
        Intent intentedirne = new Intent(getApplicationContext(), edirne.class);
        finish();
        startActivity(intentedirne);
    }
    public void canakkale(View view) {
        Intent intentcanakkale = new Intent(getApplicationContext(), canakkale.class);
        finish();
        startActivity(intentcanakkale);
    }

}

