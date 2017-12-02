package com.cinebank.Parser;
import android.os.AsyncTask;

import com.cinebank.Model.ArticleModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

/**
 * Created by Android Dev on 7/13/2017.
 */

public class HtmlParser extends AsyncTask<String,Void,ArticleModel> {
    private ParserResponseInterface parserResponseInterface;

    public HtmlParser(ParserResponseInterface parserResponseInterface){
        this.parserResponseInterface = parserResponseInterface;
    }


    @Override
    protected ArticleModel doInBackground(String... params) {
        String url=params[0];
        ArticleModel articleModel=null;
        String headline="";

        Document pageDocument;
        Elements elements;

        String article="";

      Elements articleElement;
        Elements headlineElement;


        try {

            pageDocument=Jsoup.connect(url).get();
            elements=pageDocument.select("#main");

            headlineElement=elements.select(".lister .titleColumn");
            for(Element element: headlineElement.subList(0,Math.min(10,headlineElement.size()))){
                headline=headline+element.text()+"\n\n";
             //   Log.d("Imdb","Testing"+headline);

            }

            articleElement=elements.select(".lister .lister-list td Strong");
            for(Element element: articleElement.subList(0,Math.min(10,articleElement.size()))){
                article=article+element.text()+"\n\n";

            }
            articleModel=new ArticleModel(headline,article);




        } catch (IOException e) {
            e.printStackTrace();
        }

        return articleModel;
    }

    @Override
    protected void onPostExecute(ArticleModel articleModel) {
        super.onPostExecute(articleModel);
        parserResponseInterface.onParsingDone(articleModel);
    }
}
