package com.vitalsport.newsfeed.repository;


import com.vitalsport.newsfeed.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<Post, Integer> {

}
