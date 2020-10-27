package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri uri=getIntent().getData();
        if (uri!=null)
        {
            String path=uri.toString();
            Toast.makeText(MainActivity.this,"path="+path,Toast.LENGTH_SHORT).show();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent talent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(talent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}