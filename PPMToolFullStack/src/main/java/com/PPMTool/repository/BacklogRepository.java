package com.PPMTool.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PPMTool.entity.Backlog;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> {
	
    Backlog findByProjectIdentifier(String Identifier);
}