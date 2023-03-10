package com.example.trkiyedegezilecekyerler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class baslangic extends AppCompatActivity {
    ProgressBar pBar;
    TextView tView;
    int sayac;
    Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baslangic);
        pBar = findViewById(R.id.progressBar);
        tView = findViewById(R.id.textView54);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                startProgressBar();
                Intent gecis = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(gecis);
            }
        });
        thread.start();

    }

    private void startProgressBar() {
        for (sayac=0;sayac<100;sayac++){
            try {
                Thread.sleep(41);
                pBar.setProgress(sayac);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            handler.post(new Runnable() {
                @Override
                public void run() {
                    tView.setText("%"+String.valueOf(sayac));
                }
            });


            }
    }
}