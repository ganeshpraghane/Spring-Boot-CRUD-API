package com.h2jpacrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.h2jpacrud.entities.Student;
import com.h2jpacrud.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addstudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return ResponseEntity.ok().body(studentService.createStudent(student));
	}
	
	@PostMapping("/addstudents")
	public ResponseEntity<List<Student>> addStudents(@RequestBody List<Student> student){
		return ResponseEntity.ok().body(studentService.createStudents(student));
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id) {
		return ResponseEntity.ok().body(studentService.getStudent(id));
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudentsById(){
		return ResponseEntity.ok().body(studentService.getStudents());
	}
	
	@PostMapping("/updatestudent")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		return ResponseEntity.ok().body(studentService.updateStudent(student));
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id) {
		return ResponseEntity.ok().body(studentService.deleteStudent(id));
	}
}
