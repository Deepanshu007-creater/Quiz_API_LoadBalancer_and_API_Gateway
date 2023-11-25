package com.question.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer questionId;

	private String question;

	private Integer quizeId;

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Question(Integer questionId, String question, Integer quizeId) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.quizeId = quizeId;
	}

	public Integer getQuizeId() {
		return quizeId;
	}

	public void setQuizeId(Integer quizeId) {
		this.quizeId = quizeId;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
