package com.gkeeper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gkeeper.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
