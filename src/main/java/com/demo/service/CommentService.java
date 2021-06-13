package com.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Comment;
import com.demo.repository.CommentRepository;

@Service
public class CommentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommentService.class);

    

    @Autowired
    private CommentRepository repo;

	public Comment addComment(Comment comment) {
		// TODO Auto-generated method stub
		return repo.save(comment);
		
	}

	public Iterable<Comment> getAllcommentByPost(Integer postId) {
		return repo.findAllByPostId(postId);
		
	}

   

}
