	package com.javarnd.ems.student;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.javarnd.ems.enquiry.Enquiry;

		

@Entity
@Table(name="student_detail")
public class Student_details implements Serializable {
	
	/**
	 * 
	 */
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long studentId;
	    
	  
	
	
	private String student_name;
	
	private String student_email;
	
	private int student_number;

	
	    @ManyToOne
	    @JoinColumn(name = "enquiry_id")
	    private Enquiry enquiry;

	
	
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	@JsonBackReference
	public Enquiry getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(Enquiry enquiry) {
		this.enquiry = enquiry;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	public int getStudent_number() {
		return student_number;
	}

	public void setStudent_number(int student_number) {
		this.student_number = student_number;
	}


	
	
	
	
}
