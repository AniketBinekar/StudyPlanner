package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
Button bn1,bn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        bn1=(Button)findViewById(R.id.btn52);
        bn2=(Button)findViewById(R.id.btn53);

        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bn3=new Intent(MainActivity6.this,MainActivity12.class);
                startActivity(bn3);
                Toast.makeText(MainActivity6.this,"Sem1",Toast.LENGTH_SHORT).show();



            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bn4=new Intent(MainActivity6.this,MainActivity13.class);
                startActivity(bn4);
                Toast.makeText(MainActivity6.this,"Sem2",Toast.LENGTH_SHORT).show();
            }
        });

    }
}