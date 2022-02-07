package com.gkeeper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gkeeper.entity.Assignment;

public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {

}
