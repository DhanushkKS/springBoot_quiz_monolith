package org.dhanush.quiz_monolith.services;

import org.dhanush.quiz_monolith.entites.Question;
import org.dhanush.quiz_monolith.entites.Quiz;
import org.dhanush.quiz_monolith.repositories.IQuestionRepository;
import org.dhanush.quiz_monolith.repositories.IQuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private  IQuizRepository quizRepository;

    @Autowired
    private IQuestionRepository questionRepository;
//    public QuizService(IQuizRepository quizRepository) {
//        this.quizRepository = quizRepository;
//    }

    public ResponseEntity<String> createQuiz(String category, int size, String title) {
        //get questions
        List<Question> questions = questionRepository.getQuestionsByCategory(category,size);


        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepository.save(quiz);
        return new ResponseEntity<>("Quiz "+title+ " created success", HttpStatus.CREATED);

    }
}
