package com.pr04.sbb8.answer;

import com.pr04.sbb8.question.Question;
import com.pr04.sbb8.question.QuestionRepository;
import com.pr04.sbb8.question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;

    public void create(Question question, String content) {
        Answer a = new Answer();
        a.setContent(content);
        a.setQuestion(question);
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);
    }
}
