package com.api.logging.springbootlogging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.logging.springbootlogging.model.Article;
import com.api.logging.springbootlogging.service.ArticleService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class ArticleController {
	private static final Logger logger = LoggerFactory.getLogger(ArticleService.class);
	@Autowired
	private ArticleService articleService;
	@GetMapping("/hello")
	public List<Article> getArticles() {
		logger.debug("inside ArticleController.getArticles() method");
		logger.info("inside controller");
		return articleService.getArticles();
	}
}
