package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

	public Iterable<Comment> findAllByPostId(Integer id);

}