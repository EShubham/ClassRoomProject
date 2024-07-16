package com.jbk.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.jbk.entity.Classroom;

@Repository
public class ClassroomDao {

	@Autowired
	SessionFactory factory;
	
	
	public List<Classroom> allClassroomstaffList(){
		
		org.hibernate.Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Classroom.class);
		List<Classroom> stafflist= criteria.list();
		return stafflist ;
		
	}
	public void insertClassroomdetails(Classroom staff) {		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(staff);
		tx.commit();
		
	}
	public void deleteClassroomdataAsperId(int id) {
		
		 Session session = factory.openSession();
		 Transaction tx = session.beginTransaction();
		 Classroom c = session.load(Classroom.class,id);
		 session.delete(c);
		 tx.commit();
		
	}
	public void updateClassroomdetails(Classroom staff) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(staff);
		tx.commit();
		
		
	}
	
	

		
}

