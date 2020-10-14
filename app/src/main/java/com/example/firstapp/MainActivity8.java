package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
Button bn20,bn21,bn22,bn23,bn24,bn25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        bn20=(Button)findViewById(R.id.btn105);
        bn21=(Button)findViewById(R.id.btn106);
        bn22=(Button)findViewById(R.id.btn107);
        bn23=(Button)findViewById(R.id.btn108);
        bn24=(Button)findViewById(R.id.btn109);
        bn25=(Button)findViewById(R.id.btn110);

        bn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bnn=new Intent(MainActivity8.this,MainActivity20.class);
                startActivity(bnn);
                Toast.makeText(MainActivity8.this,"sem3",Toast.LENGTH_SHORT).show();
            }
        });
        bn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bnn1=new Intent(MainActivity8.this,MainActivity21.class);
                startActivity(bnn1);
                Toast.makeText(MainActivity8.this,"sem4",Toast.LENGTH_SHORT).show();
            }
        });
        bn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bnn2=new Intent(MainActivity8.this,MainActivity22.class);
                startActivity(bnn2);
                Toast.makeText(MainActivity8.this,"sem5",Toast.LENGTH_SHORT).show();
            }
        });
        bn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bnn3=new Intent(MainActivity8.this,MainActivity23.class);
                startActivity(bnn3);
                Toast.makeText(MainActivity8.this,"sem6",Toast.LENGTH_SHORT).show();
            }
        });
        bn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bnn4=new Intent(MainActivity8.this,MainActivity24.class);
                startActivity(bnn4);
                Toast.makeText(MainActivity8.this,"sem7",Toast.LENGTH_SHORT).show();
            }
        });
        bn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bnn5=new Intent(MainActivity8.this,MainActivity25.class);
                startActivity(bnn5);
                Toast.makeText(MainActivity8.this,"sem8",Toast.LENGTH_SHORT).show();
            }
        });
    }
}