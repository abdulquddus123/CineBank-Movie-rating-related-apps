package com.cinebank.Fragment;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.cinebank.Adapter.PopularAdapter;
import com.cinebank.Model.PopularModel;
import com.cinebank.Parser.ParserResponseInterface;
import com.cinebank.Parser.PopularInterface;
import com.cinebank.Parser.PopularParser;
import com.cinebank.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android Dev on 8/3/2017.
 */

public class MostPopular extends Fragment implements PopularInterface {

    ProgressBar progressBar;
    TextView error;
    private List<PopularModel> popularModels=new ArrayList<>();
    private RecyclerView recyclerView;
    private PopularAdapter popularAdapter;
    ParserResponseInterface parserResponseInterface;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.most_popular,container,false);
//        recyclerView=(RecyclerView)view.findViewById(R.id.popularIdbRecycleView);
//        popularAdapter=new PopularAdapter(getActivity(),popularModels);
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(mLayoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(popularAdapter);
//
//
//
//        progressBar=(ProgressBar)view.findViewById(R.id.progressBar);
//        error=(TextView)view.findViewById(R.id.errorMessage);
//            new PopularParser(getContext()).execute("http://www.imdb.com/chart/moviemeter?ref_=nv_mv_mpm_8");
    //    IDBPopularMovie();
        return view;
    }

    public void IDBPopularMovie(){
//
//        popularAdapter=new PopularAdapter(getActivity(),popularModels);
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(mLayoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(popularAdapter);
//
//
//
//        progressBar=(ProgressBar)view.findViewById(R.id.progressBar);
//        error=(TextView)findViewById(R.id.errorMessage);
//        new PopularParser(this).execute("http://www.imdb.com/chart/moviemeter?ref_=nv_mv_mpm_8");
    }

    @Override
    public void onParsingDone(PopularModel popularModel) {

    }
}
