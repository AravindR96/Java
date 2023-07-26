package com.zieta.libraryservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zieta.libraryservice.entity.Library;

public interface LibraryRepo  extends JpaRepository<Library, Integer>{

}
