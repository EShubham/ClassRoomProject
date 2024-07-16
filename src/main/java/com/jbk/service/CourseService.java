package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.CourseDao;
import com.jbk.entity.Course;


@Service
public class CourseService {
	
	@Autowired
      CourseDao dao;
      
      public List<Course>allcourserecord(){
    	  List<Course>clist = dao.allcourserecord();
		return clist;
    	  
      }
      //insert record

	  public void insertdatacourse(Course c) {
		dao.insertdatacourse(c);
		
	}
	  //Update record
	  public void updateCoursedetails(Course c) {
			dao.updateCoursedetails(c);
		}

	  //Delete the record
		public void deleteCourseAsperId(int id) {
			
			dao.deleteCourseAsperId(id);
			
		}
		
		//AllRecord in course...
		public List<Course>fetchCourseslist(){
			List<Course>allcourselist = dao.allcourserecord();
			return allcourselist;
			
		}
	
	
}
