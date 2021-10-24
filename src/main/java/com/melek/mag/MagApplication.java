package com.melek.mag;

import com.melek.mag.entities.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MagApplication implements CommandLineRunner{

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(MagApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
			repositoryRestConfiguration.exposeIdsFor(article.class);
	}
}
