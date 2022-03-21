package com.example.poc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.poc.entity.Movies;

@Service
public class MovieService {

	public List<Movies> getAllMovies() {
		List<Movies> employee = new ArrayList<>();
		employee.add(new Movies("DDLJ", "Sharukh", "YASH Raj"));
		employee.add(new Movies("PK", "Amir Khan", "Raju"));
		employee.add(new Movies("Khiladi", "Akshay", "Unknown"));
		return employee;
	}
}
