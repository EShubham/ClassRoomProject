package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jbk.entity.Faculty;
import com.jbk.service.FacultyAttendanceService;

@RestController
@RequestMapping("/api/faculty-attendances")
public class FacultyAttendanceController {

	@Autowired
	private FacultyAttendanceService facultyAttendanceService;

	@GetMapping("/allfaculty")
	public List<Faculty> getAllFacultyAttendances() {
		return facultyAttendanceService.getAllFacultyAttendances();
	}

	@GetMapping("/{id}")
	public Faculty getFacultyAttendanceById(@PathVariable Long id) {
		return facultyAttendanceService.getFacultyAttendanceById(id);
	}

	@PostMapping("/insertfaculty")
	public Faculty createFacultyAttendance(@RequestBody Faculty facultyAttendance) {
		facultyAttendanceService.saveFacultyAttendance(facultyAttendance);
		return facultyAttendance;
	}

	@PutMapping("/{id}")
	public Faculty updateFacultyAttendance(@PathVariable Long id,
			@RequestBody Faculty facultyAttendanceDetails) {
		Faculty facultyAttendance = facultyAttendanceService.getFacultyAttendanceById(id);
		if (facultyAttendance != null) {
			facultyAttendance.setFaculty(facultyAttendanceDetails.getFaculty());
			facultyAttendance.setClassSchedule(facultyAttendanceDetails.getClassSchedule());
			facultyAttendance.setDate(facultyAttendanceDetails.getDate());
			facultyAttendance.setStatus(facultyAttendanceDetails.getStatus());
			facultyAttendanceService.saveFacultyAttendance(facultyAttendance);
			return facultyAttendance;
		} else {
			return null;
		}
	}

	@DeleteMapping("/{id}")
	public void deleteFacultyAttendance(@PathVariable Long id) {
		facultyAttendanceService.deleteFacultyAttendance(id);
	}
}

