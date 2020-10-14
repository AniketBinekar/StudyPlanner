package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity  {
    Spinner sp1;
    CardView btn11,btn12,btn13,btn14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        sp1=(Spinner)findViewById(R.id.spinu);
        btn11=(CardView) findViewById(R.id.btn20);
        btn12=(CardView) findViewById(R.id.btn22);
        btn13=(CardView) findViewById(R.id.btn23);
        btn14=(CardView) findViewById(R.id.btn21);

        final List<String> list=new ArrayList<String>();
        list.add(0,"ALL BRANCH");
        list.add("1st year");
        list.add("CSE");
        list.add("IT");
        list.add("CIVIL");
        list.add("ELECTRONICS");
        list.add("MECHANICAL");
        final ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(arrayAdapter);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(final AdapterView<?> parent, View view, final int position, long id) {
                sp1.setSelection(position);

                if (parent.getItemAtPosition(position).equals("ALL BRANCH"))
                {
                    


                }
                else {
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext()," selected :" +item,Toast.LENGTH_SHORT).show();
                    btn11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if (parent.getItemAtPosition(position).equals("1st year")) {
                                    Intent mn = new Intent(MainActivity4.this, MainActivity6.class);
                                    startActivity(mn);
                                }
                            else if (parent.getItemAtPosition(position).equals("CSE")) {
                                    Intent ab = new Intent(MainActivity4.this, MainActivity7.class);
                                    startActivity(ab);
                                }
                            else if (parent.getItemAtPosition(position).equals("IT")) {
                                    Intent cd = new Intent(MainActivity4.this, MainActivity8.class);
                                    startActivity(cd);
                                }
                            else if (parent.getItemAtPosition(position).equals("CIVIL")) {
                                    Intent ij = new Intent(MainActivity4.this, MainActivity9.class);
                                    startActivity(ij);
                                }
                            else if (parent.getItemAtPosition(position).equals("ELECTRONICS")) {
                                    Intent gh = new Intent(MainActivity4.this, MainActivity10.class);
                                    startActivity(gh);
                                }
                            else if (parent.getItemAtPosition(position).equals("MECHANICAL")) {
                                    Intent ef = new Intent(MainActivity4.this, MainActivity11.class);
                                    startActivity(ef);
                                }
                            else {

                                    Toast.makeText(MainActivity4.this, " select your branch", Toast.LENGTH_SHORT).show();

                                }



                        }
                    });
                    btn12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (parent.getItemAtPosition(position).equals("1st year"))
                            {
                                Intent mn=new Intent(MainActivity4.this,imp1.class);
                                startActivity(mn);
                            }
                            else if (parent.getItemAtPosition(position).equals("CSE"))
                            {
                                Intent ab=new Intent(MainActivity4.this,imp2.class);
                                startActivity(ab);
                            }
                            else  if (parent.getItemAtPosition(position).equals("IT"))
                            {
                                Intent cd=new Intent(MainActivity4.this,imp3.class);
                                startActivity(cd);
                            }
                            else  if (parent.getItemAtPosition(position).equals("CIVIL"))
                            {
                                Intent ij=new Intent(MainActivity4.this,imp4.class);
                                startActivity(ij);
                            }
                            else  if (parent.getItemAtPosition(position).equals("ELECTRONICS"))
                            {
                                Intent gh=new Intent(MainActivity4.this,imp5.class);
                                startActivity(gh);
                            }
                            else  if (parent.getItemAtPosition(position).equals("MECHANICAL"))
                            {
                                Intent ef=new Intent(MainActivity4.this,imp6.class);
                                startActivity(ef);
                            }
                            else
                            {

                                Toast.makeText(MainActivity4.this,"branch Selected first",Toast.LENGTH_SHORT).show();

                            }
                        }
                    });

                }
            }

                    @Override
            public void onNothingSelected(final AdapterView<?> parent) {
                btn11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity4.this,"Select your branch first",Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zahir = new Intent(MainActivity4.this, quiz.class);
                startActivity(zahir);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y=new Intent(MainActivity4.this,news.class);
                startActivity(y);
            }
        });



    }



}