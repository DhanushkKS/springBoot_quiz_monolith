package org.dhanush.quiz_monolith.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Question {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String category;
private String difficultyLevel;
private String option1;
private String option2;
private String option3;
private String option4;
private String questionTitle;
private String rightAnswer;

}
