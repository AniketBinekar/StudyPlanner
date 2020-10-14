package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
Button bn6,bn7,bn8,bn9,bn10,bn11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        bn6=(Button)findViewById(R.id.btn99);
        bn7=(Button)findViewById(R.id.btn100);
        bn8=(Button)findViewById(R.id.btn101);
        bn9=(Button)findViewById(R.id.btn102);
        bn10=(Button)findViewById(R.id.btn103);
        bn11=(Button)findViewById(R.id.btn104);

        bn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bn12=new Intent(MainActivity7.this,MainActivity14.class);
                startActivity(bn12);
                Toast.makeText(MainActivity7.this,"Sem3",Toast.LENGTH_SHORT).show();
            }
        });
        bn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bn13=new Intent(MainActivity7.this,MainActivity15.class);
                startActivity(bn13);
                Toast.makeText(MainActivity7.this,"Sem4",Toast.LENGTH_SHORT).show();
            }
        });
        bn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bn14=new Intent(MainActivity7.this,MainActivity16.class);
                startActivity(bn14);
                Toast.makeText(MainActivity7.this,"Sem5",Toast.LENGTH_SHORT).show();
            }
        });
        bn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bn15=new Intent(MainActivity7.this,MainActivity17.class);
                startActivity(bn15);
                Toast.makeText(MainActivity7.this,"Sem6",Toast.LENGTH_SHORT).show();
            }
        });
        bn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bn16=new Intent(MainActivity7.this,MainActivity18.class);
                startActivity(bn16);
                Toast.makeText(MainActivity7.this,"Sem7",Toast.LENGTH_SHORT).show();
            }
        });
        bn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bn17=new Intent(MainActivity7.this,MainActivity19.class);
                startActivity(bn17);
                Toast.makeText(MainActivity7.this,"Sem8",Toast.LENGTH_SHORT).show();
            }
        });
    }
}