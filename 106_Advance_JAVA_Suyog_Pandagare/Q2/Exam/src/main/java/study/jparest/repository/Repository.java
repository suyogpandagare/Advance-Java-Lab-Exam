package study.jparest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.jparest.entity.Planner;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Planner, Integer>{

	
}
