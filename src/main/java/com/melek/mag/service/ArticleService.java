package com.melek.mag.service;

import java.util.List;
import com.melek.mag.entities.article;

public interface ArticleService {
    article saveArticle(article a);
    article updateArticle(article a);
    void deleteArticle(article a);
    void deleteArticleById(Long id);

    List<article> findByIdArticle(Long id);
    List<article> findByTitre(String n);
    List<article> findByTitreContains(String n);
    List<article> findByTitreCategory(String titre,String category);
    List<article> findByIdDescription(Long id,String desc);
    List<article> findByEcrivainIdEcrivain(Long id);
    List<article> findByOrderByTitreAsc();
    List<article> trierArticlesTitreDescription();
    List<article> getAllArticles();
}
