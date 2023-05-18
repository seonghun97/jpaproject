package com.psh.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psh.board.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

}
