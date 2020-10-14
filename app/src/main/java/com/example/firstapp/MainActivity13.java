package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity13 extends AppCompatActivity {
    Button c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        c1=(Button)findViewById(R.id.button505);
        c2=(Button)findViewById(R.id.button506);
        c3=(Button)findViewById(R.id.button507);
        c4=(Button)findViewById(R.id.button508);
        c5=(Button)findViewById(R.id.button509);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g=new Intent(MainActivity13.this,pdf7.class);
                startActivity(g);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h=new Intent(MainActivity13.this,pdf8.class);
                startActivity(h);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity13.this,pdf9.class);
                startActivity(i);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity13.this,pdf10.class);
                startActivity(j);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity13.this,pdf11.class);
                startActivity(k);
            }
        });
    }
}