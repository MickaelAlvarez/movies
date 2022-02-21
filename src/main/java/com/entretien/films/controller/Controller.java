package com.entretien.films.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entretien.films.db.entity.Movie;
import com.entretien.films.service.IService;

@RestController
public class Controller {
	
	@Autowired
	private IService service;
	
	// Appel de service
	@GetMapping(path = "/all")
	public List<Movie> getMovies() {
		return null;
	}
	
	// Ajouter un titre
	@GetMapping(path = "/titles")
	public List<String> getMoviesTitles() {
		List<String> titles = new ArrayList<>();
		titles.add("Bienvenue chez les Ch'tis");
		
		return titles;
	}
	
	// Appel de service avec implémentation sql pour prix < 10€
	@GetMapping("/ex1")
	public List<Movie> getEx1() {
		return null;
	}
	
	// filtre avec algo de recherche sur le prix de 8€ et de titre 9
	@GetMapping("/ex2")
	public List<Movie> getEx2() {
		return service.getEqualTo("titre 9", 8);
	}
	
	
}
