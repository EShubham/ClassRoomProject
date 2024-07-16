package com.jbk.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Course;

@Repository
public class CourseDao {
	
  @Autowired
 SessionFactory factory;
  
  public List<Course> allcourserecord(){
	  Session session =factory.openSession();
	  Criteria criteria =session.createCriteria(Course.class);
	  List<Course> clist=criteria.list();
	  return clist;
  }
  
  
	public void insertdatacourse( Course c) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(c);
		tx.commit();
		
	}
	
	
	public void updateCoursedetails(Course c) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(c);
		tx.commit();
		
		
	}
	
	
	public void deleteCourseAsperId(int cId) {
		 Session session = factory.openSession();
		 Transaction tx = session.beginTransaction();
		 Course c = session.load(Course.class,cId);
		 session.delete(c);
		 tx.commit();
		
		
	}
	

}
