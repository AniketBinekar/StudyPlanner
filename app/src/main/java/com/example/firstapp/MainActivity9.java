package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity {
    Button bn30,bn31,bn32,bn33,bn34,bn35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        bn30=(Button)findViewById(R.id.btn120);
        bn31=(Button)findViewById(R.id.btn121);
        bn32=(Button)findViewById(R.id.btn122);
        bn33=(Button)findViewById(R.id.btn123);
        bn34=(Button)findViewById(R.id.btn124);
        bn35=(Button)findViewById(R.id.btn125);

        bn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fgh=new Intent(MainActivity9.this,MainActivity26.class);
                startActivity(fgh);
                Toast.makeText(MainActivity9.this,"Sem3",Toast.LENGTH_SHORT).show();

            }
        });
        bn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fgh1=new Intent(MainActivity9.this,MainActivity27.class);
                startActivity(fgh1);
                Toast.makeText(MainActivity9.this,"Sem4",Toast.LENGTH_SHORT).show();
            }
        });
        bn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fgh2=new Intent(MainActivity9.this,MainActivity28.class);
                startActivity(fgh2);
                Toast.makeText(MainActivity9.this,"Sem5",Toast.LENGTH_SHORT).show();
            }
        });
        bn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fgh3=new Intent(MainActivity9.this,MainActivity29.class);
                startActivity(fgh3);
                Toast.makeText(MainActivity9.this,"Sem6",Toast.LENGTH_SHORT).show();
            }
        });
        bn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fgh4=new Intent(MainActivity9.this,MainActivity30.class);
                startActivity(fgh4);
                Toast.makeText(MainActivity9.this,"Sem7",Toast.LENGTH_SHORT).show();
            }
        });
        bn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fgh5=new Intent(MainActivity9.this,MainActivity31.class);
                startActivity(fgh5);
                Toast.makeText(MainActivity9.this,"Sem8",Toast.LENGTH_SHORT).show();
            }
        });


    }
}