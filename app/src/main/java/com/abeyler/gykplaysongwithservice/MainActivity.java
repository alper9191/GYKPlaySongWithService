package com.abeyler.gykplaysongwithservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button playSongBttn, stopSongBttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playSongBttn = findViewById(R.id.playSongBttn);
        playSongBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,PlaySongService.class);
                startService(intent);
            }
        });

        stopSongBttn = findViewById(R.id.stopSongBttn);
        stopSongBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,PlaySongService.class);
                stopService(intent);
            }
        });
    }
}
