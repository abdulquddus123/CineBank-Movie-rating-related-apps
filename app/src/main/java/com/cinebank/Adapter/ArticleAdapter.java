package com.cinebank.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cinebank.Model.ArticleModel;
import com.cinebank.R;

import java.util.List;

/**
 * Created by Android Dev on 7/18/2017.
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.MyViewHolder>{
    List<ArticleModel> articleModelList;
    Context context;
    @Override

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.rating_movie_model,parent,false);
        return new MyViewHolder(itemView);
    }

    public ArticleAdapter(Context context,List<ArticleModel> articleModelList){
        this.context=context;
        this.articleModelList=articleModelList;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
  final ArticleModel articleModel=articleModelList.get(position);
       holder.article.setText(articleModel.getArticle());
        holder.headline.setText(articleModel.getHeadline());
    }

    @Override
    public int getItemCount() {
       return articleModelList.size();
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
