package com.javarnd.ems.enquiry;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.javarnd.ems.student.Student_details;

import javax.persistence.*;
import java.util.List;

@Entity
public class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enquiryId;
    
    private String courseName;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enquiry", fetch = FetchType.LAZY)
    private List<Student_details> Student_details;

    @JsonManagedReference
    public List<Student_details> getStudent_details() {
		return Student_details;
	}

	public void setStudent_details(List<Student_details> student_details) {
		Student_details = student_details;
	}
   

	public Long getEnquiryId() {
		return enquiryId;
	}

	
	public void setEnquiryId(Long enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

   
}
