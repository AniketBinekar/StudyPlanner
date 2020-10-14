package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class search extends AppCompatActivity {
WebView w1;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        w1=(WebView)findViewById(R.id.web);
        w1.setWebViewClient(new MyWebViewClient());
        String url="http://www.google.com";
        w1.getSettings().setJavaScriptEnabled(true);
        w1.loadUrl(url);


    }
    private static class MyWebViewClient extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}