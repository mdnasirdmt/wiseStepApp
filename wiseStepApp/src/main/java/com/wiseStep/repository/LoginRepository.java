package com.wiseStep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiseStep.userInput.CurrentSession;

public interface LoginRepository extends JpaRepository<CurrentSession, String> {

}
