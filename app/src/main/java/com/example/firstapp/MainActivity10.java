package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {
Button bn40,bn41,bn42,bn43,bn44,bn45;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        bn40=(Button)findViewById(R.id.btn130);
        bn41=(Button)findViewById(R.id.btn131);
        bn42=(Button)findViewById(R.id.btn132);
        bn43=(Button)findViewById(R.id.btn133);
        bn44=(Button)findViewById(R.id.btn134);
        bn45=(Button)findViewById(R.id.btn135);
        bn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bkl1=new Intent(MainActivity10.this,MainActivity32.class);
                startActivity(bkl1);
                Toast.makeText(MainActivity10.this,"Sem3",Toast.LENGTH_SHORT).show();
            }
        });
        bn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bkl2=new Intent(MainActivity10.this,MainActivity33.class);
                startActivity(bkl2);
                Toast.makeText(MainActivity10.this,"Sem4",Toast.LENGTH_SHORT).show();
            }
        });
        bn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bkl3=new Intent(MainActivity10.this,MainActivity34.class);
                startActivity(bkl3);
                Toast.makeText(MainActivity10.this,"Sem5",Toast.LENGTH_SHORT).show();
            }
        });
        bn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bkl4=new Intent(MainActivity10.this,MainActivity35.class);
                startActivity(bkl4);
                Toast.makeText(MainActivity10.this,"Sem6",Toast.LENGTH_SHORT).show();
            }
        });
        bn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bkl5=new Intent(MainActivity10.this,MainActivity36.class);
                startActivity(bkl5);
                Toast.makeText(MainActivity10.this,"Sem7",Toast.LENGTH_SHORT).show();
            }
        });
        bn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bkl6=new Intent(MainActivity10.this,MainActivity37.class);
                startActivity(bkl6);
                Toast.makeText(MainActivity10.this,"Sem8",Toast.LENGTH_SHORT).show();
            }
        });
    }
}