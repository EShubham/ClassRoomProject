package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.ClassScheduleDao;
import com.jbk.entity.ClassSchedule;
import com.jbk.entity.Classroom;

@Service
public class ClassScheduleService {

	@Autowired
	ClassScheduleDao dao;

	public List<ClassSchedule> getAllClassSchedules() {
		List<ClassSchedule>allclassSchedule = dao.getAllClassSchedules();
		return allclassSchedule;
		
	}

	public ClassSchedule getClassScheduleById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveClassSchedule(ClassSchedule classSchedule) {
		 dao.saveClassSchedule(classSchedule);
		
	}

	public void deleteClassSchedule(Long id) {
		dao.deleteClassSchedule(id);
		
	}
	
	
}
