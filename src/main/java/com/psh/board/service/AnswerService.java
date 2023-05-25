package com.psh.board.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psh.board.entity.Answer;
import com.psh.board.entity.Question;
import com.psh.board.entity.SiteMember;
import com.psh.board.exception.DataNotFoundException;
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
	public Answer getAnswer(Integer id) {
		
		Optional<Answer> optAnswer= answerRepository.findById(id);
		
		if(optAnswer.isPresent()) {
			return optAnswer.get();//answer삭제
		} else {
			throw new DataNotFoundException("선택하신 답변은 없는 글입니다.");
		}
	}
	public void answerModify(Answer answer, String content) {
		answer.setContent(content);
		answer.setModifyDate(LocalDateTime.now()); //현재 시간 가져와 답변 수정 시간으로 입력
		
		answerRepository.save(answer);
		
	}
	public void answerDelete(Integer id) {
		answerRepository.deleteById(id);
	}
}
