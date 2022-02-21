package com.entretien.films.service;

import java.util.List;

import com.entretien.films.db.entity.Movie;

public interface IService {
	public List<Movie> getAll();
	public List<Movie> getLowerThan20Euros();
	public List<Movie> getEqualTo(String title, int cost);
}
