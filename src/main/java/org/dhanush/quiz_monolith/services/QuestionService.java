package org.dhanush.quiz_monolith.services;

import jakarta.transaction.Transactional;
import org.dhanush.quiz_monolith.entites.Question;
import org.dhanush.quiz_monolith.repositories.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class QuestionService {
    @Autowired
private final IQuestionRepository questionRepository;

    public QuestionService(IQuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
    public List<Question>  getAllQuestions(){
        return questionRepository.findAll();
    }
    public List<Question> getQuestionsByCategory(String category){
        return questionRepository.findByCategory(category);

    }

    public String createQuestion(Question question) {
        questionRepository.save(question);
        return "question created Success";
    }
}
