package org.dhanush.quiz_monolith.services;

import jakarta.transaction.Transactional;
import org.dhanush.quiz_monolith.entites.Question;
import org.dhanush.quiz_monolith.repositories.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class QuestionService {
    @Autowired
private final IQuestionRepository questionRepository;

    public QuestionService(IQuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
    public ResponseEntity<List<Question>>   getAllQuestions(){
        try {

        return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK) ;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST) ;

    }
    public ResponseEntity<List<Question>> getQuestionsByCategory(String category){

        try {

            return new ResponseEntity<>(questionRepository.findByCategory(category), HttpStatus.OK) ;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> createQuestion(Question question) {
        try{

        questionRepository.save(question);
        return new ResponseEntity<>("question created Success",HttpStatus.CREATED) ;
        }catch (Exception e){
            e.printStackTrace();
        }return new ResponseEntity<>("Error in creating Question",HttpStatus.BAD_REQUEST);
    }
}
