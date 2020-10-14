package com.example.firstapp;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;



public class MainActivity3 extends AppCompatActivity  {
    CardView n1,n2,n3,n4;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        n1=(CardView)findViewById(R.id.nm);
        n2=(CardView) findViewById(R.id.nn);
        n3=(CardView) findViewById(R.id.nj);
        n4=(CardView) findViewById(R.id.nb);






        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inter=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(inter);
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ink=new Intent(MainActivity3.this,result.class);
                startActivity(ink);
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inj=new Intent(MainActivity3.this,search.class);
                startActivity(inj);
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl=new Intent(MainActivity3.this,jobengineer.class);
                startActivity(jkl);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.aboutus:
            Intent about=new Intent(this,MainActivityabout.class);
            startActivity(about);
            break;
            case R.id.share:

                        Intent shareIntent=new Intent(Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        String sharesub="insert Subject here";
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                        String app_url="https://play.google.com/store/apps/details?id=com.example.administrator";
                        shareIntent.putExtra(Intent.EXTRA_TEXT,app_url);
                        startActivity(Intent.createChooser(shareIntent,"Share Via"));


            break;
            case R.id.log:

                Intent log=new Intent(this,MainActivity2.class);
                startActivity(log);
            break;
        }
        return super.onOptionsItemSelected(item);
    }
    private  void requestPermission()
    {
        ActivityCompat.requestPermissions(MainActivity3.this,new String[]{Manifest.permission.CALL_PHONE},1);
    }


}