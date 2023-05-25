package com.psh.board.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psh.board.entity.Answer;
import com.psh.board.entity.Question;
import com.psh.board.entity.SiteMember;
import com.psh.board.repository.AnswerRepository;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepository answerRepository;
	
	public void answerCreate(String content, Question question, SiteMember writer) {
		
		Answer answer = new Answer();
		answer.setContent(content);
		answer.setCreateDate(LocalDateTime.now()); //서버의 현재시간 넣기
		answer.setQuestion(question);
		answer.setWriter(writer);
		
		answerRepository.save(answer); //insert 문
		
	}
		
}
