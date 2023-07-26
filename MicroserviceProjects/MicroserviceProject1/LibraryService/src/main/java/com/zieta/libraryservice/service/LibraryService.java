package com.zieta.libraryservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zieta.libraryservice.entity.Library;
import com.zieta.libraryservice.repo.LibraryRepo;

@Service
public class LibraryService {
	
	 @Autowired
	 private LibraryRepo libraryRepo;
	 
	public Library insertLibrary(Library library) {
		return libraryRepo.save(library);
	}
	public Library getLibraryById(int id) {
		return libraryRepo.findById(id).get();
	}
}
