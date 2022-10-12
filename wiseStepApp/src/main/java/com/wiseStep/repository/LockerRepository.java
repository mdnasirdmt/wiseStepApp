package com.wiseStep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiseStep.entity.Locker;

@Repository
public interface LockerRepository extends JpaRepository<Locker, Integer>{

}
