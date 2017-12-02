package com.cinebank.Parser;
import com.cinebank.Model.ArticleModel;
import com.cinebank.Model.PopularModel;

/**
 * Created by Android Dev on 7/13/2017.
 */

public interface ParserResponseInterface {

    void onParsingDone(ArticleModel articleModel);
}
