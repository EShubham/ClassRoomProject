package com.jbk.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Subject;

@Repository
public class SubjectDao {
	
	@Autowired
	SessionFactory factory;
	
	public List<Subject> getAllSubjects() {
		org.hibernate.Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Subject.class);
		List<Subject> subjectlist= criteria.list();
		return subjectlist ;
		
	}
  //insert record
	public void saveSubject(Subject subject) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(subject);
		tx.commit();
		
		
	}
	//delet record..
	public void deleteSubject(Long id) {
		 Session session = factory.openSession();
		 Transaction tx = session.beginTransaction();
		 Subject sub = session.load(Subject.class,id);
		 session.delete(sub);
		 tx.commit();
		
		
	}
	

}
