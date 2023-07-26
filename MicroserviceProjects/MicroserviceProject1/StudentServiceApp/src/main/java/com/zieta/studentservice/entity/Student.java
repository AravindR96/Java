package com.zieta.studentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentTable")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 private String name;
 private String fathername;
 private String address;
 private int age;
 @OneToOne
 @JoinColumn(name = "library_id")
 private Library library;
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", fathername=" + fathername + ", address=" + address + ", age="
			+ age + ", library=" + library + "]";
}
public Student(Integer id, String name, String fathername, String address, int age, Library library) {
	super();
	this.id = id;
	this.name = name;
	this.fathername = fathername;
	this.address = address;
	this.age = age;
	this.library = library;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFathername() {
	return fathername;
}
public void setFathername(String fathername) {
	this.fathername = fathername;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Library getLibrary() {
	return library;
}
public void setLibrary(Library library) {
	this.library = library;
}
}
