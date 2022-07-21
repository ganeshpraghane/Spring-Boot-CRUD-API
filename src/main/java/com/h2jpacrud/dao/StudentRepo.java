package com.h2jpacrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2jpacrud.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
