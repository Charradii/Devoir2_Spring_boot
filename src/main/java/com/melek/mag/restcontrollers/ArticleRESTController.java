package com.melek.mag.restcontrollers;

import java.util.List;

import com.melek.mag.entities.article;
import com.melek.mag.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class ArticleRESTController {
    @Autowired
    ArticleService articleService;
    
    @RequestMapping(path="all",method=RequestMethod.GET)
    public List<article> getAllArticles(){
        return articleService.getAllArticles();
    }
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public List<article> getArticleById(@PathVariable("id") Long id){
        return articleService.findByIdArticle(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public article createArticle(@RequestBody article a){
        return articleService.saveArticle(a);
    }
    @RequestMapping(method= RequestMethod.PUT)
    public article updateArticle(@RequestBody article a){
        return articleService.updateArticle(a);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteArticle(@PathVariable("id") Long id){
        articleService.deleteArticleById(id);
    }
    
}
