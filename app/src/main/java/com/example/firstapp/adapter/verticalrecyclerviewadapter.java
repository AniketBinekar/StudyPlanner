package com.example.firstapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstapp.R;
import com.example.firstapp.adapter.models.horizontalmodel;
import com.example.firstapp.adapter.models.verticalmodel;

import java.util.ArrayList;
import java.util.Objects;

public class verticalrecyclerviewadapter extends RecyclerView.Adapter<verticalrecyclerviewadapter.VerticalRVviewholder>
{
    Context context;

    ArrayList<verticalmodel> arrayList;
    public verticalrecyclerviewadapter(Context context,ArrayList<verticalmodel> arrayList)
    {
        this.arrayList=arrayList;
        this.context=context;
    }
    @NonNull
    @Override
    public VerticalRVviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vertical,parent,false);
        return new VerticalRVviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalRVviewholder holder, int position) {
    verticalmodel verticalmodels=arrayList.get(position);
    String title=verticalmodels.getTitle();
    ArrayList<horizontalmodel> signitem=verticalmodels.getArrayList();
        holder.twx.setText(title);
        horizontalrecyclerviewadapter horizontalrecyclerview=new horizontalrecyclerviewadapter(context,signitem);

        holder.recyclerView.setHasFixedSize(true);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));

        holder.recyclerView.setAdapter(horizontalrecyclerview);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class VerticalRVviewholder extends RecyclerView.ViewHolder
    {
        RecyclerView recyclerView;
        TextView twx;
        public VerticalRVviewholder(View itemView)
        {
            super(itemView);
            recyclerView=(RecyclerView)itemView.findViewById(R.id.recy1);
            twx=(TextView)itemView.findViewById(R.id.texttile);

        }
    }

}
