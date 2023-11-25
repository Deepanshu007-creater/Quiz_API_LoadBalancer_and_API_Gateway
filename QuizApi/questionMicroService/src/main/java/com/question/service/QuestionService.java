package com.question.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.entities.Question;

@Service
public interface QuestionService {

	Question saveQuestion(Question question);

	List<Question> getQuestions();

	Question getOneQuestion(Integer questionId);

	List<Question> getQuestionsByQuizeId(Integer quizeId);

}
