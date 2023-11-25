package com.question.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.repository.QuestionRepository;
import com.question.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question saveQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getQuestions() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getOneQuestion(Integer questionId) {
		// TODO Auto-generated method stub
		return questionRepository.findById(questionId)
				.orElseThrow(() -> new RuntimeException("Question could not stored"));
	}

	@Override
	public List<Question> getQuestionsByQuizeId(Integer quizeId) {
		// TODO Auto-generated method stub
		return questionRepository.findByquizeId(quizeId);
	}

}
