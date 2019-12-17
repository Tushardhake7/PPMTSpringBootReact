package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	@Override
	List<Project> findAllById(Iterable<Long> iterable);

}
