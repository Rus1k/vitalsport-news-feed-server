package com.vitalsport.newsfeed.web;

import com.vitalsport.newsfeed.model.Comment;
import com.vitalsport.newsfeed.model.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(value = "/news")
public class NewsController {

    @RequestMapping(value = "/addComment", method = RequestMethod.POST)
    public ResponseEntity<String> addComment(@RequestBody Comment comment) {
        return ResponseEntity.ok("Comment added");
    }

    @RequestMapping(value = "/addPost", method = RequestMethod.POST)
    public ResponseEntity<String> addPost(@RequestBody Post post) {
        return ResponseEntity.ok("Post added");
    }

}
