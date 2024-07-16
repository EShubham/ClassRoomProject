package com.jbk.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Department;

@Repository
public class DepartmentDao {
	
	@Autowired
	SessionFactory factory;

	public List<Department> allDepartmentrecord() {
		Session session =factory.openSession();
		  Criteria criteria =session.createCriteria(Department.class);
		  List<Department>deptlist=criteria.list();
		return deptlist ;
	}

	public void insertdataDepartment(Department d) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(d);
		tx.commit();
		
		
	}

	public void updateDepartmentdetails(Department d) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(d);
		tx.commit();
		
	}

	public void deleteDepartmentAsperId(long id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Department d = session.load(Department.class, id);
		session.delete(d);
		tx.commit();
		
	}

	
}
