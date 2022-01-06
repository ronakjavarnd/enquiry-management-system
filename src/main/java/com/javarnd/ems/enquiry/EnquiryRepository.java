package com.javarnd.ems.enquiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {

	Enquiry getByenquiryId(Long enquiryId);
	
	
}
