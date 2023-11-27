package com.pr04.sbb8;

import com.pr04.sbb8.question.Question;
import com.pr04.sbb8.question.QuestionRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Sbb8ApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;
	@Test
	@DisplayName("질문 생성")
	void test01() {
		Question q = new Question();
		q.setSubject("1번 질문");
		q.setContent("1번 질문 내용");
		q.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q);

		Question q1 = new Question();
		q1.setSubject("2번 질문");
		q1.setContent("2번 질문 내용");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);
	}

}
