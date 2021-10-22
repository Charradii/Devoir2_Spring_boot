package com.melek.mag.service;

import java.util.List;
import com.melek.mag.entities.article;
import com.melek.mag.repos.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<article> findByTitre(String n) {
        return articleRepository.findByTitre(n);
    }
    @Override
    public List<article> findByTitreContains(String n){
        return articleRepository.findByTitreContains(n);
    }
    @Override
    public List<article> findByTitreCategory(String titre,String category){
        return articleRepository.findByTitreCategory(titre,category);
    }
    @Override
    public List<article> findByIdDescription(Long id,String desc){
        return articleRepository.findByIdDescription(id,desc);
    }
    @Override
    public List<article> findByEcrivainIdEcrivain(Long id){
        return articleRepository.findByEcrivainIdEcrivain(id);
    }
    @Override
    public List<article> findByOrderByTitreAsc(){
        return articleRepository.findByOrderByTitreAsc();
    }
    @Override
    public List<article> trierArticlesTitreDescription(){
        return articleRepository.trierArticlesTitreDescription();
    }
}