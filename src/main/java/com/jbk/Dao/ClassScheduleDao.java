package com.jbk.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.ClassSchedule;

@Repository
public class ClassScheduleDao {


	@Autowired
	SessionFactory factory;
	
	public List<ClassSchedule> getAllClassSchedules() {
		org.hibernate.Session session = factory.openSession();
		Criteria criteria = session.createCriteria(ClassSchedule.class);
		List<ClassSchedule> classlist= criteria.list();
		return classlist ;
	}

	public void saveClassSchedule(ClassSchedule classSchedule) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(classSchedule);
		tx.commit();
		
	}

	public void deleteClassSchedule(Long id) {
		
		 Session session = factory.openSession();
		 Transaction tx = session.beginTransaction();
		 ClassSchedule cs = session.load(ClassSchedule.class,id);
		 session.delete(cs);
		 tx.commit();
		
	}

}
