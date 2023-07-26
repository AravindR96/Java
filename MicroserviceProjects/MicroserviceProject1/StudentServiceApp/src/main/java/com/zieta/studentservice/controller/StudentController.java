package com.zieta.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zieta.studentservice.entity.Library;
import com.zieta.studentservice.entity.Student;
import com.zieta.studentservice.service.StudentService;

@RequestMapping("/student")
@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private RestTemplate restTemplate;
	
     @GetMapping("/Student/{id}")
	public Student getStudentById(@PathVariable int id) {
    	 Library library= restTemplate.getForObject("http://localhost:8083/library/Library/"+id, Library.class);
    	 Student student = studentService.getStudentById(id);
    	 student.setLibrary(library);
		return student;
	}
     
     @PostMapping("/insert")
 	public Student insertStudent(@RequestBody Student student ) {
 		return studentService.insert(student);
 	}
}
