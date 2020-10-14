package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.File;

public class MainActivity12 extends AppCompatActivity {

Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        b1=(Button)findViewById(R.id.button500);
        b2=(Button)findViewById(R.id.button501);
        b3=(Button)findViewById(R.id.button502);
        b4=(Button)findViewById(R.id.button503);
        b5=(Button)findViewById(R.id.button504);
        b6=(Button)findViewById(R.id.button505);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(MainActivity12.this,MainActivity44.class);
                startActivity(a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(MainActivity12.this,pdf2.class);
                startActivity(b);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(MainActivity12.this,pdf3.class);
                startActivity(c);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d=new Intent(MainActivity12.this,pdf4.class);
                startActivity(d);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e=new Intent(MainActivity12.this,pdf5.class);
                startActivity(e);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e=new Intent(MainActivity12.this,pdf6.class);
                startActivity(e);
            }
        });
    }
}