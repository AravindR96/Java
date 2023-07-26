package com.zieta.libraryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zieta.libraryservice.entity.Book;
import com.zieta.libraryservice.entity.Library;
import com.zieta.libraryservice.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {
	
	@Autowired
	private LibraryService libraryService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/insert")
	public Library insertLib(@RequestBody Library library) {
		return libraryService.insertLibrary(library);
	}
	@GetMapping("/Library/{id}")
	public Library getLibraryById(@PathVariable int id) {
		
		Book book = restTemplate.getForObject("http://localhost:8082/book/Book/"+id, Book.class);
		
		Library library =  libraryService.getLibraryById(id);
		 library.setBook(book);
		 return library;
	}
}
