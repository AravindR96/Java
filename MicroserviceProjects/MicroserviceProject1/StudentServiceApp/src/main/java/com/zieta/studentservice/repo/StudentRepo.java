package com.zieta.studentservice.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.zieta.studentservice.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {


}
