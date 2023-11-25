package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.service.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@PostMapping
	public ResponseEntity<?> savQuestion(@RequestBody Question question) {
		return new ResponseEntity<>(questionService.saveQuestion(question), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<?> getQuestions() {
		return new ResponseEntity<>(questionService.getQuestions(), HttpStatus.OK);
	}

	@GetMapping("/question/{questionId}")
	public ResponseEntity<?> getOneQuestion(@PathVariable Integer questionId) {
		return new ResponseEntity<>(questionService.getOneQuestion(questionId), HttpStatus.OK);
	}

	@GetMapping("question/quize/{quizeId}")
	public List<Question> getQuestionsByQuizeId(@PathVariable Integer quizeId) {
		return questionService.getQuestionsByQuizeId(quizeId);
	}

}
