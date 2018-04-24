package com.example.tarun.final_proj.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.tarun.final_proj.R;
import com.example.tarun.final_proj.model.Anime;

import java.util.List;

/**
 * Created by tarun on 24-04-2018.
 */


public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {

    RequestOptions options ;
    private Context mContext ;
    private List<Anime> mData ;


    public RvAdapter(Context mContext, List lst) {


        this.mContext = mContext;
        this.mData = lst;
        options = new RequestOptions()
                .centerCrop()
                .placeholder(R.drawable.loading_shape)
                .error(R.drawable.loading_shape);

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.anime_row_itwm,parent,false);
        // click listener here
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tvname.setText(mData.get(position).getName());
        holder.tv_rate.setText(mData.get(position).getRating());
        holder.tvstudio.setText(mData.get(position).getStudio());
        holder.tvcat.setText(mData.get(position).getCategories());

        // load image from the internet using Glide
        Glide.with(mContext).load(mData.get(position).getImage_url()).apply(options).into(holder.AnimeThumbnail);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvname,tv_rate,tvstudio,tvcat;
        ImageView AnimeThumbnail;


        public MyViewHolder(View itemView) {
            super(itemView);
            tvname = itemView.findViewById(R.id.anime_name);
            tvstudio = itemView.findViewById(R.id.studio);
            tv_rate = itemView.findViewById(R.id.rating);
            tvcat = itemView.findViewById(R.id.categorie);
            AnimeThumbnail = itemView.findViewById(R.id.thumbnail);
        }
    }


}
