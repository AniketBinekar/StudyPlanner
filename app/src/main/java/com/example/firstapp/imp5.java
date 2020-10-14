package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class imp5 extends AppCompatActivity {
    Button b51,b52,b53,b54,b56,b57;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp5);

        b51=(Button)findViewById(R.id.btn980);
        b52=(Button)findViewById(R.id.btn981);
        b53=(Button)findViewById(R.id.btn982);
        b54=(Button)findViewById(R.id.btn983);
        b56=(Button)findViewById(R.id.btn984);
        b57=(Button)findViewById(R.id.btn985);
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1=new Intent(imp5.this,imp5sem3.class);
                startActivity(s1);
            }
        });
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s2=new Intent(imp5.this,imp5sem4.class);
                startActivity(s2);
            }
        });
        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s3=new Intent(imp5.this,imp5sem5.class);
                startActivity(s3);
            }
        });
       b54.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent s4=new Intent(imp5.this,imp5sem6.class);
               startActivity(s4);
           }
       });
       b56.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent s5=new Intent(imp5.this,imp5sem7.class);
               startActivity(s5);
           }
       });
       b57.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent s6=new Intent(imp5.this,imp5sem8.class);
               startActivity(s6);
           }
       });



    }
}