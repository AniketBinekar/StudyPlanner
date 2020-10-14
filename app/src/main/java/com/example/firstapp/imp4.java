package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class imp4 extends AppCompatActivity {
    Button b41,b42,b43,b44,b45,b46;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp4);
        b41=(Button)findViewById(R.id.btn967);
        b42=(Button)findViewById(R.id.btn968);
        b43=(Button)findViewById(R.id.btn969);
        b44=(Button)findViewById(R.id.btn970);
        b45=(Button)findViewById(R.id.btn971);
        b46=(Button)findViewById(R.id.btn972);
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twenty=new Intent(imp4.this,imp4sem3.class);
                startActivity(twenty);

            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twentyone=new Intent(imp4.this,imp4sem4.class);
                startActivity(twentyone);

            }
        });
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twentytwo=new Intent(imp4.this,imp4sem5.class);
                startActivity(twentytwo);

            }
        });
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twentythree=new Intent(imp4.this,imp4sem6.class);
                startActivity(twentythree);

            }
        });
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twentyfour=new Intent(imp4.this,imp4sem7.class);
                startActivity(twentyfour);

            }
        });
        b46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twentyfive=new Intent(imp4.this,imp4sem8.class);
                startActivity(twentyfive);
            }
        });
    }
}


