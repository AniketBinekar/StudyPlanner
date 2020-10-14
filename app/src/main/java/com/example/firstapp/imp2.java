package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class imp2 extends AppCompatActivity {
Button b25,b26,b27,b28,b29,b30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp2);
        b25=(Button)findViewById(R.id.btn910);
        b26=(Button)findViewById(R.id.btn920);
        b27=(Button)findViewById(R.id.btn930);
        b28=(Button)findViewById(R.id.btn940);
        b29=(Button)findViewById(R.id.btn950);
        b30=(Button)findViewById(R.id.btn960);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent third=new Intent(imp2.this,imp2sem3.class);
                startActivity(third);

            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent four=new Intent(imp2.this,imp2sem4.class);
                startActivity(four);

            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent five=new Intent(imp2.this,imp2sem5.class);
                startActivity(five);

            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent six=new Intent(imp2.this,imp2sem6.class);
                startActivity(six);

            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seven=new Intent(imp2.this,imp2sem7.class);
                startActivity(seven);

            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eight=new Intent(imp2.this,imp2sem8.class);
                startActivity(eight);

            }
        });
    }
}