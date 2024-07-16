package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jbk.Dao.ClassroomDao;
import com.jbk.entity.Classroom;

@Service
public class ClassroomService {

	@Autowired
	ClassroomDao dao;

	public void insertClassroomdetails(Classroom staff) {
		dao.insertClassroomdetails(staff);
		
	}
	
	public void updateClassroomdetails(Classroom staff) {
		dao.updateClassroomdetails(staff);
	}

	public void deleteClassroomdataAsperId(int id) {
		
		dao.deleteClassroomdataAsperId(id);
		
	}
	
	public List<Classroom>fetchallstaff(){
		List<Classroom>allclassroomstaff = dao.allClassroomstaffList();
		return allclassroomstaff;
		
	}
	
	public List<Classroom> ClassroomId() {
		List<Classroom>allClassroomId = dao.allClassroomstaffList();
		return allClassroomId ;
	}
	
	}

