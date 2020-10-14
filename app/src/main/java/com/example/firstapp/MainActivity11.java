package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity11 extends AppCompatActivity {
Button bn50,bn51,bn52,bn53,bn54,bn55;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        bn50=(Button)findViewById(R.id.btn140);
        bn51=(Button)findViewById(R.id.btn141);
        bn52=(Button)findViewById(R.id.btn142);
        bn53=(Button)findViewById(R.id.btn143);
        bn54=(Button)findViewById(R.id.btn144);
        bn55=(Button)findViewById(R.id.btn145);

        bn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bhu1=new Intent(MainActivity11.this,MainActivity38.class);
                startActivity(bhu1);
                Toast.makeText(MainActivity11.this,"Sem3",Toast.LENGTH_SHORT).show();

            }
        });
        bn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bhu2=new Intent(MainActivity11.this,MainActivity39.class);
                startActivity(bhu2);
                Toast.makeText(MainActivity11.this,"Sem4",Toast.LENGTH_SHORT).show();
            }
        });
        bn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bhu3=new Intent(MainActivity11.this,MainActivity40.class);
                startActivity(bhu3);
                Toast.makeText(MainActivity11.this,"Sem5",Toast.LENGTH_SHORT).show();
            }
        });
        bn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bhu4=new Intent(MainActivity11.this,MainActivity41.class);
                startActivity(bhu4);
                Toast.makeText(MainActivity11.this,"Sem6",Toast.LENGTH_SHORT).show();
            }
        });
        bn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bhu5=new Intent(MainActivity11.this,MainActivity42.class);
                startActivity(bhu5);
                Toast.makeText(MainActivity11.this,"Sem7",Toast.LENGTH_SHORT).show();
            }
        });
        bn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bhu6=new Intent(MainActivity11.this,MainActivity43.class);
                startActivity(bhu6);
                Toast.makeText(MainActivity11.this,"Sem8",Toast.LENGTH_SHORT).show();
            }
        });

    }
}