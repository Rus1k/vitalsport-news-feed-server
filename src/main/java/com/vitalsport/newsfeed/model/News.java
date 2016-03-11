package com.vitalsport.newsfeed.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "news")
public class News {

    private LocalDate date;
    private String login;
    private String newsText;

}
