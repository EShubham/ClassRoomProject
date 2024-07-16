package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.DepartmentDao;
import com.jbk.entity.Department;



@Service
public class DepartmentService {
	
	@Autowired
	DepartmentDao dao;
	
	  public List<Department>allDepartmentrecord(){
    	  List<Department>deptlist = dao.allDepartmentrecord();
    	  
		return deptlist;
	  }
		
		
		 //insert record

		  public void insertdataDepartment(Department d) {
			dao.insertdataDepartment(d);
			
		}
		  //Update record
		  public void updateDepartmentdetails(Department d ) {
				dao.updateDepartmentdetails(d);
			}
             
		 
			
			//AllRecord in course...
			public List<Department>fetchDepartmentlist(Department d){
				List<Department>deptlist = dao.allDepartmentrecord();
				return deptlist;
		  
      }


			public void deleteDepartmentAsperId(long id) {
				dao.deleteDepartmentAsperId(id);
				
			}

	
}
