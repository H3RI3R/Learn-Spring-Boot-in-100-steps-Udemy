package com.Ritik.SpringBoot.SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class CurrencyConfigurationController {
@Autowired
private CurrencyServiceConfiguration configuration;
@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses(){
		return configuration;
	}
}
