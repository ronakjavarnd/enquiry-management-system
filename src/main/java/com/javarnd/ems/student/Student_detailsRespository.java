package com.javarnd.ems.student;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javarnd.ems.enquiry.Enquiry;

@Repository
public interface Student_detailsRespository extends JpaRepository<Student_details, Long>{
	Student_details getByStudentId(Long id);

}
