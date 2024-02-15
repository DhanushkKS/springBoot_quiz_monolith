package org.dhanush.quiz_monolith.controllers;

import org.dhanush.quiz_monolith.repositories.IQuizRepository;
import org.dhanush.quiz_monolith.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/quiz")
public class QuizController {
@Autowired
private  QuizService quizService;


    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,@RequestParam int size,@RequestParam String title){
        return quizService.createQuiz(category,size,title);
    }
}
