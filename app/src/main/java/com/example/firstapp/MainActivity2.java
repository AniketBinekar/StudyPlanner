package com.example.firstapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Pattern;

public class MainActivity2<n> extends AppCompatActivity {
    TextView t1, t2;
    EditText e1, e2, e3;
    CardView b1;
    public final String username1 = "[a-z]";
    public final String username2 = "[a-z0-9@a-z.a-z]";
    public final String username3 = "[a-z0-9]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = (TextView) findViewById(R.id.textVie);
        t2 = (TextView) findViewById(R.id.textview);
        e1 = (EditText) findViewById(R.id.editTextTextPersonName);
        e2 = (EditText) findViewById(R.id.editTextmail);
        e3 = (EditText) findViewById(R.id.editTextTextPassword);
        b1 = (CardView) findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=e1.getText().toString().trim();
                String n2=e2.getText().toString().trim();
                String n3=e3.getText().toString().trim();
                if(n1.isEmpty()||n2.isEmpty()||n3.isEmpty())
                {
                    Toast.makeText(MainActivity2.this,"Enter all information",Toast.LENGTH_SHORT).show();
                }
                else if(!Patterns.EMAIL_ADDRESS.matcher(e2.getText().toString()).matches())
                {
                    e2.setError("enter valid email");
                }
                else if (!e1.getText().toString().matches("[a-z,A-Z]*"))
                {
                    e1.setError("enter the valid name");
                }
                else if (n3.length()<9)
                {
                    e3.setError("enter atleast 9 no of chareacter");

                 if (e3.getText().toString().matches("[a-z,A-Z,0-9]*"))

                    e3.setError("enter the valid password");
                }
                else
                {
                    Intent uncle=new Intent(MainActivity2.this,MainActivity3.class);
                    startActivity(uncle);
                    Toast.makeText(MainActivity2.this,"Login Sucessfully",Toast.LENGTH_SHORT).show();

                }

            }
        });


    }


}