package com.gkeeper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gkeeper.entity.Timeline;

public interface TimelineRepository extends JpaRepository<Timeline, Integer> {

}
