package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jbk.entity.Course;
import com.jbk.service.CourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController {
	
	@Autowired
	CourseService service;
	
	@PostMapping("/insertdata")
	public void insertdatacourse(@RequestBody Course c)
	{
		service.insertdatacourse(c);
	}
	
	@PutMapping("/updatedata")
	public void updateCoursedetails(@RequestBody Course c) {
		
		service.updateCoursedetails(c);
	}

     //not working....
	@DeleteMapping("/deletedata/{cId}")
	public void deleteCourseAsperId(@PathVariable("cId") int cId) {
		service.deleteCourseAsperId(cId);
	}
	
	
	@GetMapping("/showalldata")
	public List<Course> showalldata() {
		return service.allcourserecord();
		
	}
	
	
	

}
