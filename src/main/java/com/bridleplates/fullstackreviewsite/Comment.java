package com.bridleplates.fullstackreviewsite;

import javax.persistence.Embeddable;

@Embeddable
public class Comment {
	
	private String commentText;

	public Comment() {
	}

	public Comment(String commentText) {
		this.commentText = commentText;
	}

	public String getCommentText() {
		return commentText;
	}

	@Override
	public String toString() {
		return "Comment [commentText=" + commentText + "]";
	}

}