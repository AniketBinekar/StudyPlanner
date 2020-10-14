package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class imp3 extends AppCompatActivity {
Button b31;
    Button b32;
    Button b33;
    Button b34;
    Button b35;
    Button b36;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp3);
        b31=(Button)findViewById(R.id.btn961);
        b32 = (Button)findViewById(R.id.btn962);
        b33=(Button)findViewById(R.id.btn963);                           
         b34=(Button)findViewById(R.id.btn964);
        b35=(Button)findViewById(R.id.btn965);
        b36=(Button)findViewById(R.id.btn966);



        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ten=new Intent(imp3.this,imp3sem3.class);
                startActivity(ten);


            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ele=new Intent(imp3.this,imp3sem4.class);
                startActivity(ele);

            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twe=new Intent(imp3.this,imp3sem5.class);
                startActivity(twe);

            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thrn=new Intent(imp3.this,imp3sem6.class);
                startActivity(thrn);

            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forth=new Intent(imp3.this,imp3sem7.class);
                startActivity(forth);
            }
        });
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fithn=new Intent(imp3.this,imp3sem8.class);
                startActivity(fithn);

            }
        });
    }
}