package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cId;
	@Column(nullable = false)
	private String cName;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + "]";
	}
		
}
