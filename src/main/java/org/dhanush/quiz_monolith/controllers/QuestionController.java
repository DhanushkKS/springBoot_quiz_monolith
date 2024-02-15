package org.dhanush.quiz_monolith.controllers;

import org.dhanush.quiz_monolith.entites.Question;
import org.dhanush.quiz_monolith.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/v1/question")

public class QuestionController  {

    @Autowired
    private final QuestionService questionService;


    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(value = "allQuestions")
    public ResponseEntity<List<Question>>  getAllQuestions(){

        return questionService.getAllQuestions();
    }
    @GetMapping(value = "category/{category}")
    public ResponseEntity<List<Question>>  getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category) ;
    }

    @PostMapping(value = "create")
    public ResponseEntity<String> createQuestion(@RequestBody Question question){
        return questionService.createQuestion(question);
    }


}
