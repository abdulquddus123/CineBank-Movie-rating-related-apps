package com.cinebank.Adapter;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cinebank.Model.PopularModel;
import com.cinebank.R;
import java.util.List;

/**
 * Created by Android Dev on 7/23/2017.
 */

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.MyViewHolder> {
    List<PopularModel> popularModelList;
    Context context;

    public PopularAdapter(Context context, List<PopularModel> popularModelList) {
        this.context=context;
        this.popularModelList=popularModelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_movie_model,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final PopularModel popularModel=popularModelList.get(position);
        holder.article.setText(popularModel.getArticle());
        holder.headline.setText(popularModel.getHeadline());
    }

    @Override
    public int getItemCount() {
        return popularModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView article,headline;
        public MyViewHolder(View itemView) {
            super(itemView);
            article=(TextView)itemView.findViewById(R.id.article);
            headline=(TextView)itemView.findViewById(R.id.headline);
        }
    }
}
