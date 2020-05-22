package com.induboutique.demoopeartions.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.induboutique.demoopeartions.course.Course;
import com.induboutique.demoopeartions.services.CoursesService;

@RestController
public class CouseResource {
	
	@Autowired
	private CoursesService courseService;
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		System.out.println("Started APp ");

		return courseService.findAll();
		
	}
	
	@GetMapping("/")  
	public String hello()   
	{  
	return "Hello User";  
	}

}
