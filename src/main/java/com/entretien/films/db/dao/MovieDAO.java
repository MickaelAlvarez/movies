package com.entretien.films.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entretien.films.db.entity.Movie;

@Repository
public interface MovieDAO extends JpaRepository<Movie, Integer>{

	@Query(value = "Select * from MOVIE", nativeQuery = true)
	public Iterable<Movie> getAllV2();
	
//	@Query(value = "", nativeQuery = true)
//	public Iterable<Movie> lowerThan20Euros();
	
}
