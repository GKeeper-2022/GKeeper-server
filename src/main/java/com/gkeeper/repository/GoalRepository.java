package com.gkeeper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gkeeper.entity.Goal;

public interface GoalRepository extends JpaRepository<Goal, Integer> {

}
