package com.Ritik.SpringBoot.SpringBoot;

public class Course {

	private long id;
	private String name;
	private String author;
	//Constructor 
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	} 
	//Getters
	 
	//toString
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	//Getters
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	
	
	
}
