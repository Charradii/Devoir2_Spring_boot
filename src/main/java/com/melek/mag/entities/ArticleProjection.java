package com.melek.mag.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "titre", types = { article.class })
public interface ArticleProjection {
    public String getTitre();
}