package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity44 extends AppCompatActivity {
    PDFView pdf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main44);
        pdf1=(PDFView)findViewById(R.id.pdf);
        pdf1.fromAsset("simple.pdf").load();
    }
}