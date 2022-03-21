package com.example.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.poc.entity.Movies;
import com.example.poc.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@RequestMapping(method = RequestMethod.GET, value = "/movies")
	public ResponseEntity<List<Movies>> getAllMovies() {
		List<Movies> response = movieService.getAllMovies();
		return new ResponseEntity(response, HttpStatus.OK);
	}
}
