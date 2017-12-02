package com.cinebank.Parser;

import android.os.AsyncTask;

import com.cinebank.Model.PopularModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;



/**
 * Created by Android Dev on 7/23/2017.
 */

public class PopularParser extends AsyncTask<String,Void,PopularModel> {
    private PopularInterface popularInterface;

    public PopularParser(PopularInterface popularInterface){
        this.popularInterface=popularInterface;
    }



    @Override
    protected PopularModel doInBackground(String... params) {
        String url=params[0];
        PopularModel popularmodel=null;
        String headline="";

        Document pageDocument;
        Elements elements;

        String article="";

        Elements articleElement;
        Elements headlineElement;


        try {
            pageDocument= Jsoup.connect(url).get();

            elements=pageDocument.select("#main");
            // articleElements=pageDocument.select(".list_item odd .nm-title-overview-widget-layout .overview-top .text-block ");
            articleElement=elements.select(".lister-list .titleColumn");
            headlineElement=elements.select(".lister .lister-list td Strong");

            for(Element element: headlineElement.subList(0,Math.min(10,headlineElement.size()))){
                headline = headline + element.text()+ "\n\n";
                //  article = article + e lement.text() ;

            }

            for(Element element: articleElement.subList(0,Math.min(10,articleElement.size()))){
                article = article + element.text()+ "\n\n" ;
            }



            popularmodel= new PopularModel(article,headline);



//            articleModel.setArticle(article);
//            articleModel.setHeadline(headline);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return popularmodel;
    }

    @Override
    protected void onPostExecute(PopularModel popularmodel) {
        super.onPostExecute(popularmodel);
        popularInterface.onParsingDone(popularmodel);


    }
}
