package com.beautifulsoup.service;

import com.beautifulsoup.bean.db.Article;

import java.util.List;

/**
 * Created by BeautifulSoup on 2017/12/8.
 */
public interface ArticleService {
    List<Article> findAllArticles();
    int getArticlesCount();
    int insertArticle(Article article);
    List<Article> listArticlesByPage(Integer pageNum);
    Article findArticleById(Integer id);
    int deleteByPrimaryKey(Integer id);
    int updateByPrimaryKey(Article record);
}
