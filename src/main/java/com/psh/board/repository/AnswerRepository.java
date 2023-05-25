package com.psh.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psh.board.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer>{
}
