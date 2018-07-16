package com.bridleplates.fullstackreviewsite;

import org.springframework.data.repository.CrudRepository;
import org.thymeleaf.dom.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

	Long findByComment(String deleteComment);

}