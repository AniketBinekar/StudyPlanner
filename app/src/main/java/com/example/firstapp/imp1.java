package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class imp1 extends AppCompatActivity {
    Button b23,b24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp1);
        b23=(Button)findViewById(R.id.btn900);
        b24=(Button)findViewById(R.id.btn901);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first=new Intent(imp1.this,imp1sem1.class);
                startActivity(first);
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second=new Intent(imp1.this,imp1sem2.class);
                startActivity(second);
            }
        });
    }
}