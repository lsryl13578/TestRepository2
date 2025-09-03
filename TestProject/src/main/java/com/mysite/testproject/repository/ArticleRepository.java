package com.mysite.testproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mysite.testproject.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{
}