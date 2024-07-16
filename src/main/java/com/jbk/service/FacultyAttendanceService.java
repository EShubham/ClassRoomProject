package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.FacultyAttendanceDao;

import com.jbk.entity.Faculty;


@Service
public class FacultyAttendanceService {
	
	@Autowired
	FacultyAttendanceDao dao;

	public List<Faculty> getAllFacultyAttendances() {
		 List<Faculty>fattendancelist = dao.allFattendancerecord();
	
		return fattendancelist;
	}

	public Faculty getFacultyAttendanceById(Long id) {
		
		return null;
	}

	public void saveFacultyAttendance(Faculty facultyAttendance) {
		
		dao.saveFacultyAttendance(facultyAttendance);
		
	}

	public void deleteFacultyAttendance(Long id) {
		dao.deleteFacultyAttendance(id);
		
		
	}



}
