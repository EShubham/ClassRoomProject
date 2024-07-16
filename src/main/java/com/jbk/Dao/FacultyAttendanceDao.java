package com.jbk.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Faculty;


@Repository
public class FacultyAttendanceDao {


	@Autowired
	SessionFactory factory;

	public List<Faculty> allFattendancerecord() {
		org.hibernate.Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Faculty.class);
		List<Faculty> faclist= criteria.list();
		return faclist ;
		
		
	}
 
	 //insert record
	public void saveFacultyAttendance(Faculty facultyAttendance) {
	
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(facultyAttendance);
		tx.commit();
	}
	
 //delete record
	public void deleteFacultyAttendance(Long id) {
		 Session session = factory.openSession();
		 Transaction tx = session.beginTransaction();
		 Faculty f = session.load(Faculty.class,id);
		 session.delete(f);
		 tx.commit();
		
		
		
	}
	
	
	
	
	
}
