package com.melek.mag.repos;

import java.util.List;
import com.melek.mag.entities.article;
import com.melek.mag.entities.ecrivain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ArticleRepository extends JpaRepository<article, Long>{
    
    List<article> findByTitre(String n);

    List<article> findByTitreContains(String n);

    @Query("select a from article a where a.titre like %?1 and a.Category like %?2")
    List<article> findByTitreCategory(String titre,String category);

    @Query("select a from article a where a.idArticle =:id and a.Description like %:desc")
    List<article> findByIdDescription(@Param("id") Long id,@Param("desc") String desc);

    @Query("select a from article a where a.ecrivain = ?1")
    List<article> findByEcrivain(ecrivain e);

    List<article> findByEcrivainIdEcrivain(Long id);

    List<article> findByOrderByTitreAsc();

    @Query("select a from article a order by a.titre ASC, a.Description DESC")
    List<article> trierArticlesTitreDescription();

}
