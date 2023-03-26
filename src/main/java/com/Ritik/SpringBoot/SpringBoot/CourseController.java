package com.Ritik.SpringBoot.SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://lcoalhost:8080/courses
//	[
//	 {
//		 "id": 1,
//		 "name": "Learn AWS",
//		 "author": "RitikSoni"
//		 
//	 }
//	 ]
@RestController	
public class CourseController {
@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList( 
				new Course(1,"Learn AWS","RitikSoni"),
				new Course(2,"Learn Devops","RitikSoni")
				
				);
	}
}
