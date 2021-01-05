package com.quizzapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainController {
	
	@Autowired
	public DataRepository dataRepo;
	
	@GetMapping("/")
	public List<Question> getAllQuestions() {
		return dataRepo.findAll();
	}
}
