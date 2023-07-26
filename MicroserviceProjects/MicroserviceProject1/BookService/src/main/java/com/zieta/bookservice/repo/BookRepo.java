package com.zieta.bookservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zieta.bookservice.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
