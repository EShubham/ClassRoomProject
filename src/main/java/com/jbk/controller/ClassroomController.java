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

import com.jbk.entity.Classroom;
import com.jbk.service.ClassroomService;
@RestController
@RequestMapping("/api/classrooms")
public class ClassroomController {
	
	@Autowired
	ClassroomService service;
	
	//insert record
	@PostMapping("/insertdata")
	public void insertClassroomdetails(@RequestBody Classroom staff) {
		
		service.insertClassroomdetails(staff);
		
	}
	//Update record
	@PutMapping("/updatedata")
	public void updateClassroomdetails(@RequestBody Classroom staff) {
		
		service.updateClassroomdetails(staff);
	}

    //delete record
	@DeleteMapping("/deletedata/{id}")
	public void deleteClassroomdataAsperId(@PathVariable int id) {
		service.deleteClassroomdataAsperId(id);
	}
	
	@GetMapping("/showalldata")
	public List<Classroom> showalldata() {
		return service.fetchallstaff();
		
	}
	
	@GetMapping("/getid")
	public int getById() {
		return 15;
		
	}
	

}
