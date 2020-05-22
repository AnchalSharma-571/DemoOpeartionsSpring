package com.induboutique.demoopeartions.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.induboutique.demoopeartions.course.Course;
 

@Service
public class CoursesService {
	
	private static List<Course> courses=new ArrayList<Course>();
	
	static {
		courses.add(new Course(101, "Java", "Introduction to Java Programmig language"));
		courses.add(new Course(102, ".Net", "Introduction to .Net"));
		courses.add(new Course(103, "Python", "Introduction to Python Programmig language"));
	}
	
	public List<Course> findAll(){
		System.out.println("Hey ");
		return courses;
	}

}
