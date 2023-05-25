package com.psh.board.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class QuestionForm {
	
	@NotEmpty(message ="질문 제목은 필수 입력사항 입니다")
	@Size(max = 100, message = "제목은 50자 이하만 가능합니다.")//100byte 한글은 글자당 2바이트
	private String subject;
	
	@NotEmpty(message ="질문 내용은 필수 입력사항 입니다")
	@Size(min = 10, message = "질문 내용은 10자 이상만 입력 가능합니다.")
	private String content;
}
