package com.gkeeper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gkeeper.entity.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Integer> {

}
