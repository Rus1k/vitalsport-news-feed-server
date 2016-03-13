package com.vitalsport.newsfeed.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Builder
@Table(name = "post")
public class Post extends BaseNews {
    private NewsType type;
    private String text;
    private List<String> urls;

    @OneToMany(mappedBy="post")
    private List<Comment> comments;
}
