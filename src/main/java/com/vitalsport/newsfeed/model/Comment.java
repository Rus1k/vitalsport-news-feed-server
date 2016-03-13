package com.vitalsport.newsfeed.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by lostsoul on 3/13/16.
 */
@Data
@Entity
@Table(name = "comment")
@Builder
public class Comment extends BaseNews {
    @Column(name = "text", length = 500)
    private String text;
    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;
}
