package com.pr04.sbb8.question;

import com.pr04.sbb8.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
