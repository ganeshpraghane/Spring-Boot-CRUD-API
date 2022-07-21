package com.h2jpacrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2jpacrud.dao.StudentRepo;
import com.h2jpacrud.entities.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public List<Student> createStudents(List<Student> students){
		return studentRepo.saveAll(students);
	}
	public Student getStudent(int id) {
		return studentRepo.findById(id).orElse(null);
	}
	public List<Student> getStudents(){
		return studentRepo.findAll();
	}
	public Student updateStudent(Student student) {
//		User oldUser=userRepo.findById(user.getId()).get();
//		if(oldUser==null) {
//			return new User();
//		}
//		oldUser.setName(user.getName());
//		oldUser.setAddress(user.getAddress());
//		userRepo.save(oldUser);
//		return oldUser;
//		User olduser=null;
//		if(optional.isPresent()) {
//			olduser=optional.get();
//			olduser.setName(user.getName());
//			olduser.setAddress(user.getAddress());
//			userRepo.save(olduser);
//		}
//		else {
//			return new User();
//		}
//		return olduser;
		return studentRepo.save(student);
	}
	
	public String deleteStudent(int id) {
		studentRepo.deleteById(id);
		return "user deleted";
	}
}
