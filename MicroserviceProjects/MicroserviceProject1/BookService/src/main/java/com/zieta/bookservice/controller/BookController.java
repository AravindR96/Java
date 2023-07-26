package com.zieta.bookservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zieta.bookservice.entity.Book;
import com.zieta.bookservice.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	  @Autowired
	  private BookService bookService;
	  
	@GetMapping("/Book/{id}")
	public Book getBookById(@PathVariable int id) {
		return bookService.getBookById(id);
	}
	@PostMapping("/insert")
	public Book insertBookById(@RequestBody Book book) {
		return bookService.insertBook(book);
	}
}
