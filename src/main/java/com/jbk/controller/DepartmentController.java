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

import com.jbk.entity.Department;
import com.jbk.service.DepartmentService;

@RestController
@RequestMapping("/api/dept")
public class DepartmentController {
	
	@Autowired
	DepartmentService service;
	
	
	//insert record
	@PostMapping("/insertdata")
	public void insertDepartmentdetails(@RequestBody Department d) {
		
		service.insertdataDepartment(d);
		
	}
	//Update record
	@PutMapping("/updatedata")
	public void updateDepartmentdetails(@RequestBody Department d) {
		
		service.updateDepartmentdetails(d);
	}
    	
	
	@GetMapping("/showalldata")
	public List<Department> showalldata() {
		return service.allDepartmentrecord();
		
	}
	//delete record
		@DeleteMapping("/deletedata/{id}")
		public void deleteDepartmentdataAsperId(@PathVariable long id) {
			service.deleteDepartmentAsperId(id);
		}

	
	

	
}
