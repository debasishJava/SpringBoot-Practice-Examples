package com.coforge.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.coforge.model.Student;
import com.coforge.repo.StudentRepo;

@Component
public class StudentRunner implements CommandLineRunner{

	@Autowired
	private StudentRepo repo;
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Student(101,"abc"));
		
	}

	
}
