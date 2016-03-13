package com.vitalsport.newsfeed.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

public abstract class BaseNews {
    @Id
    @GeneratedValue
    Long id;
    @Column(name = "date")
    LocalDate newsDate;
    @Column(name = "owner")
    Long owner;


}
