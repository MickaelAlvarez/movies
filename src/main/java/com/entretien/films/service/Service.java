package com.entretien.films.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import com.entretien.films.db.dao.MovieDAO;
import com.entretien.films.db.entity.Movie;

@org.springframework.stereotype.Service
public class Service implements IService {

	@Autowired
	private MovieDAO dao;
	
	public List<Movie> getAll() {
		return toList(dao.getAllV2());
	}
	
	public List<Movie> getLowerThan20Euros() {
		return null;
	}
	
	@Override
	public List<Movie> getEqualTo(String title, int cost) {
		List<Movie> movies = toList(dao.getAllV2());
		// search in movies
		return null;
	}
	
	private static List<Movie> toList(Iterable<Movie> iterator) {
		return StreamSupport.stream(iterator.spliterator(), false).collect(Collectors.toList());
	}
	
}
