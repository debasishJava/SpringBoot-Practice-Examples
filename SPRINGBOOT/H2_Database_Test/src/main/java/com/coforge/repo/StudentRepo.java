package com.coforge.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
