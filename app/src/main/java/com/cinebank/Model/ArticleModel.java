package com.cinebank.Model;

/**
 * Created by Android Dev on 7/13/2017.
 */

public class ArticleModel {
    private String headline;
    private String article;
    String text;

    public ArticleModel(String article,String headline){
        this.headline=headline;
        this.article=article;
    }
//    public ArticleModel(String article,String headline,String text){
//        this.headline=headline;
//        this.article=article;
//        this.text=text;
//
//    }
//    public ArticleModel(String article){
//        this.article=article;
//    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getHeadline() {

        return headline;
    }

    public String getArticle() {
        return article;
    }


}
