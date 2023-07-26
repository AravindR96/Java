package com.zieta.studentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zieta.studentservice.entity.Student;
import com.zieta.studentservice.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public Student getStudentById(int id) {
		return studentRepo.findById(id).get();
		
	}
	
	public Student insert(Student student) {
		 return studentRepo.save(student);
		

}
}