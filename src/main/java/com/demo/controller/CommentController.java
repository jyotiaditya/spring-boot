package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Comment;
import com.demo.service.CommentService;

@RestController
public class CommentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommentController.class);

    @Autowired
    private CommentService service;

   
    
    @PostMapping(path="/addComment")
    public @ResponseBody Comment addComments (@RequestBody Comment comment) {
    	return service.addComment(comment);
    
    }

    @GetMapping(path="/getByPostId")
    public @ResponseBody Iterable<Comment> getAllCommentByPostId(@RequestParam Integer postId) {
      // This returns a JSON or XML with the users
    	System.out.println("Call to get all");
      return service.getAllcommentByPost(postId);
    }

   

   

}
