package com.zieta.bookservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zieta.bookservice.entity.Book;
import com.zieta.bookservice.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
	public Book getBookById(int id) {
		return bookRepo.findById(id).get();
	}
	public Book insertBook(Book book) {
		return bookRepo.save(book);
	}
	
	}
	

	
	
	

