package com.cinebank;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.cinebank.Adapter.ArticleAdapter;
import com.cinebank.Adapter.PopularAdapter;
import com.cinebank.Model.ArticleModel;
import com.cinebank.Model.PopularModel;
import com.cinebank.Parser.HtmlParser;
import com.cinebank.Parser.ParserResponseInterface;
import com.cinebank.Parser.PopularInterface;
import com.cinebank.Parser.PopularParser;
import org.jsoup.nodes.Element;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements ParserResponseInterface , PopularInterface {
    TextView title,article,error;
    ProgressBar progressBar;
    private List<ArticleModel> articleModels=new ArrayList<>();
    private RecyclerView recyclerView;
    private ArticleAdapter articleAdapter;
    Element element;

    ProgressBar progressBar1;
    private List<PopularModel> popularModels=new ArrayList<>();
    private RecyclerView recyclerView1;
    private PopularAdapter popularAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.topratedRecycleView);
        recyclerView1=(RecyclerView)findViewById(R.id.popularIdbRecycleView);
        TopRatedIMDB();
        IDBPopularMovie();
    }

public void TopRatedIMDB(){

    articleAdapter = new ArticleAdapter(this,articleModels);
    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
    recyclerView.setLayoutManager(mLayoutManager);
    recyclerView.setItemAnimator(new DefaultItemAnimator());
    recyclerView.setAdapter(articleAdapter);

    progressBar=(ProgressBar)findViewById(R.id.progressBar);
  //  error=(TextView)findViewById(R.id.errorMessage);
    new HtmlParser(this).execute("http://www.imdb.com/chart/top/?ref_=nv_mv_250_6");
}
public void IDBPopularMovie(){

    popularAdapter=new PopularAdapter(this,popularModels);
    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
    recyclerView1.setLayoutManager(mLayoutManager);
    recyclerView1.setItemAnimator(new DefaultItemAnimator());
    recyclerView1.setAdapter(popularAdapter);



    progressBar1=(ProgressBar)findViewById(R.id.progressBar1);
  //  error=(TextView)findViewById(R.id.errorMessage);
    new PopularParser(this).execute("http://www.imdb.com/chart/moviemeter?ref_=nv_mv_mpm_8");
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    public void Registation(View view) {
        Intent i = new Intent(this, RegistationActivity.class);
        startActivity(i);
    }
    public void Login(View view) {
  Intent login=new Intent(this,LoginActivity.class);
        startActivity(login);

    }

    @Override
    public void onParsingDone(PopularModel popularModel) {
        progressBar1.setVisibility(View.GONE);
        if(popularModel!=null){
         //   popularModel.add(popularModel);
            popularModels.add(popularModel);
            popularAdapter.notifyDataSetChanged();
        }
        else
            error.setText("Something wrong! Can't parse HTML");

    }

    @Override
    public void onParsingDone(ArticleModel articleModel) {
        progressBar.setVisibility(View.GONE);
        if(articleModel!=null){
            //   popularModel.add(popularModel);
            articleModels.add(articleModel);
            articleAdapter.notifyDataSetChanged();
        }
        else
            error.setText("Something wrong! Can't parse HTML");
    }
}
