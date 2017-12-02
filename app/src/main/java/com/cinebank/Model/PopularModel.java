package com.cinebank.Model;

/**
 * Created by Android Dev on 7/23/2017.
 */

public class PopularModel {
    private String headline;
    private String article;

    public PopularModel(String article,String headline){
        this.headline=headline;
        this.article=article;
    }

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
