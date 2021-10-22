package com.melek.mag;

import java.util.List;
import com.melek.mag.entities.article;
import com.melek.mag.entities.ecrivain;
import com.melek.mag.repos.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@AutoConfigureMockMvc
@SpringBootTest
class MagApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	public List<article> articles;
	@Test
  	void contextLoads(ApplicationContext context) {
    
  	}
		@Test
		public void testFindArt(){
			articles =  articleRepository.findByTitre("abcd");
			for(article a :articles){
				System.out.println(a);
			}
			
		}
		@Test
		public void testFindArtCnt(){
			articles =  articleRepository.findByTitreContains("c");
			for(article a :articles){
				System.out.println(a);
			}
			
		}
		@Test
		public void testFindArtTitreCategory(){
			articles =  articleRepository.findByTitreCategory("abcd", "Sport");
			for(article a :articles){
				System.out.println(a);
			}
			
		}
		
		@Test
		public void testFindArtEcrivain(){
			ecrivain e = new ecrivain();
			e.setIdEcrivain(1L);
			articles =  articleRepository.findByEcrivain(e);
			for(article a :articles){
				System.out.println(a);
			}
			
		}
		@Test
		public void testFindbyidEcrivain(){
			articles =  articleRepository.findByEcrivainIdEcrivain(1L);
			for(article a :articles){
				System.out.println(a);
			}
			
		}
		@Test
		public void testFindbyOrderByTitreAsc(){
			articles =  articleRepository.findByOrderByTitreAsc();
			for(article a :articles){
				System.out.println(a);
			}
			
		}
		@Test
		public void testtrierArticleTitreDescription(){
			articles =  articleRepository.trierArticlesTitreDescription();
			for(article a :articles){
				System.out.println(a);
			}
			
		}
}
