package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.SubjectDao;
import com.jbk.entity.Subject;

@Service
public class SubjectService {
	
	@Autowired
	SubjectDao dao;

	public List<Subject> getAllSubjects() {
		
		List<Subject>allsubject = dao.getAllSubjects();
		return allsubject;

	}

	public Subject getSubjectById(Long id) {
		
		return null;
	}
 
	//insert record method..
	public void saveSubject(Subject subject) {
		
			dao.saveSubject(subject);
			
		}
		
	  
      //delect record method..
	public void deleteSubject(Long id) {
		
		dao.deleteSubject(id);
		
		
	}
	

}
