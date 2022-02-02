package com.springboot.project.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
	
	@RequestMapping("/hello-world")
	
	public String hello() {
		//StudentJson studentJson = new StudentJson("1234","Sachin","Nainital");
		return "sachin";
	}
	@GetMapping("/student")
	public List<StudentJson> list(){
		List<StudentJson> student = new ArrayList<StudentJson>();
		student.add(new StudentJson("123","Sacchu","hyderabad"));
		student.add(new StudentJson("124","Mohit","Delhi"));
		student.add(new StudentJson("125","Sumit","Rajasthan"));
		student.add(new StudentJson("126","jasmine","madurai"));
		student.add(new StudentJson("127","Subham","tamilnadu"));
		return student;
	}

}