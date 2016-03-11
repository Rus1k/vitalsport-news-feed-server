package com.vitalsport.newsfeed.repository;


import com.vitalsport.newsfeed.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {

}
