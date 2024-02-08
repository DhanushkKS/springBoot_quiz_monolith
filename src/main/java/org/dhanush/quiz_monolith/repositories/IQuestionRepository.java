package org.dhanush.quiz_monolith.repositories;

import org.dhanush.quiz_monolith.entites.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IQuestionRepository extends JpaRepository<Question,Integer> {
    List<Question> findByCategory(String category);
}
