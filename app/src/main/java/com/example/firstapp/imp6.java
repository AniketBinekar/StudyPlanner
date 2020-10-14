package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class imp6 extends AppCompatActivity {
    Button b61,b62,b63,b64,b65,b66;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp6);
        b61=(Button)findViewById(R.id.btn991);
        b62=(Button)findViewById(R.id.btn992);
        b63=(Button)findViewById(R.id.btn993);
        b64=(Button)findViewById(R.id.btn994);
        b65=(Button)findViewById(R.id.btn995);
        b66=(Button)findViewById(R.id.btn996);
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagal1=new Intent(imp6.this,imp6sem3.class);
                startActivity(pagal1);
            }
        });
        b62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagal2=new Intent(imp6.this,imp6sem4.class);
                startActivity(pagal2);
            }
        });
        b63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagal3=new Intent(imp6.this,imp6sem5.class);
                startActivity(pagal3);

            }
        });
        b64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagal4=new Intent(imp6.this,imp6sem6.class);
                startActivity(pagal4);
            }
        });
        b65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagal5=new Intent(imp6.this,imp6sem7.class);
                startActivity(pagal5);
            }
        });
        b66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagal6=new Intent(imp6.this,imp6sem8.class);
                startActivity(pagal6);
            }
        });
    }
}