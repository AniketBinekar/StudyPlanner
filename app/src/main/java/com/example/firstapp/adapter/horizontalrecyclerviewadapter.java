package com.example.firstapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstapp.R;
import com.example.firstapp.adapter.models.horizontalmodel;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;
import java.util.Observable;

public class horizontalrecyclerviewadapter extends RecyclerView.Adapter<horizontalrecyclerviewadapter.horizontalrvviewholder>
{


    Context context;
    ArrayList<horizontalmodel> arrayList;
    public horizontalrecyclerviewadapter(Context context, ArrayList<horizontalmodel> arrayList)
    {
        this.context=context;
        this.arrayList=arrayList;

    }

    @NonNull
    @Override
    public horizontalrvviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal,parent,false);
        return new horizontalrvviewholder(view);



    }

    @Override
    public void onBindViewHolder(@NonNull horizontalrvviewholder holder, int position) {
         final horizontalmodel horizontalmodels=arrayList.get(position);
        holder.textView.setText(horizontalmodels.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,horizontalmodels.getName(),Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public int getItemCount()
    {
        return arrayList.size();
    }

    public class horizontalrvviewholder extends RecyclerView.ViewHolder
    {

        TextView textView;
        public horizontalrvviewholder(View itemView)
        {

            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.texttiho);
           YouTubePlayerView youTubePlayerView=(YouTubePlayerView)itemView.findViewById(R.id.youtube);
           YouTubePlayerView youTubePlayerView1=(YouTubePlayerView)itemView.findViewById(R.id.youtube1);
            YouTubePlayerView youTubePlayerView2=(YouTubePlayerView)itemView.findViewById(R.id.youtube2);
            YouTubePlayerView youTubePlayerView3=(YouTubePlayerView)itemView.findViewById(R.id.youtube3);

            YouTubePlayerView youTubePlayerView4=(YouTubePlayerView)itemView.findViewById(R.id.youtube4);

            YouTubePlayerView youTubePlayerView5=(YouTubePlayerView)itemView.findViewById(R.id.youtube5);

            YouTubePlayerView youTubePlayerView6=(YouTubePlayerView)itemView.findViewById(R.id.youtube6);

            YouTubePlayerView youTubePlayerView7=(YouTubePlayerView)itemView.findViewById(R.id.youtube7);

            YouTubePlayerView youTubePlayerView8=(YouTubePlayerView)itemView.findViewById(R.id.youtube8);

            YouTubePlayerView youTubePlayerView9=(YouTubePlayerView)itemView.findViewById(R.id.youtube9);


        }



    }

}
