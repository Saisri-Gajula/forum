package com.prodapt.learningspring.controller.binding;

import lombok.Data;

@Data
public class AddCommentForm {

	private String PostId;
	private String UserId;
	private String Comment;
}
