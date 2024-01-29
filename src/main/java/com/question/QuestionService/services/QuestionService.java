package com.question.QuestionService.services;

import com.question.QuestionService.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question quiz);

    List<Question> get();

    Question get(Long id);

    List<Question> getQuestionOfQuiz(Long quizId);
}
