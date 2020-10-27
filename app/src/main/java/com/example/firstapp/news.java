package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.firstapp.adapter.models.horizontalmodel;
import com.example.firstapp.adapter.models.verticalmodel;
import com.example.firstapp.adapter.verticalrecyclerviewadapter;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class news extends AppCompatActivity {
    RecyclerView vertical;
    verticalrecyclerviewadapter adapter;
    ArrayList<verticalmodel> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        arrayList = new ArrayList<>();
        setContentView(R.layout.activity_news);
        arrayList=new ArrayList<>();
        vertical=(RecyclerView)findViewById(R.id.recycler);
        vertical.setHasFixedSize(true);
        vertical.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapter=new verticalrecyclerviewadapter(this,arrayList);
        vertical.setAdapter(adapter);
        setdata();

    }
    private void setdata()
    {
        for(int i=1;i<=1;i++) {
            verticalmodel verticalmodels = new verticalmodel();


            ArrayList<horizontalmodel> arrayList1 = new ArrayList<>();
            for (int j = 1; j <= 1; j++) {
                horizontalmodel horizontalmodels = new horizontalmodel();
                horizontalmodels.setDescription("dex" + j);
                horizontalmodels.setName("CSE"+j+"IT");

                arrayList1.add(horizontalmodels);
            }

            verticalmodels.setArrayList(arrayList1);
            arrayList.add(verticalmodels);
        }
        adapter.notifyDataSetChanged();
    }


}