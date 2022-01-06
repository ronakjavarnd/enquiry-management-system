package com.javarnd.ems.enquiry;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
@RequestMapping("/api/enquiry")
@CrossOrigin
public class EnquiryController {
	
	@Autowired
    private EnquiryService enquiryService;

	@Autowired
    private EnquiryRepository enquiryRepository;

	
	 @PostMapping("")
	    public ResponseEntity<Enquiry> addABook(@RequestBody Enquiry enquiry){
		 System.out.println("enquiry");
	        return new ResponseEntity<Enquiry>(enquiryService.saveOrUpdateABook(enquiry), HttpStatus.CREATED);
	    }
	 
	    @DeleteMapping("/delete/{id}")
		public String deleteEnquiry(@PathVariable long id) {
			
			Enquiry e = enquiryService.findBookById(id);
			
			enquiryRepository.delete(e);
			return "Deleted";
		}
	    
	    
	    @PutMapping(path="/update",consumes= {"application/json"})
	    public Enquiry saveOrUpdate(@RequestBody Enquiry enquiry) {
	    	
	    	
	    			enquiryRepository.save(enquiry);
	    			return enquiry;
	    }
	 

	    @GetMapping("/all")
	    public Iterable<Enquiry> getAllEnquiry(){
	        return enquiryService.findAll();
	    }

	    @GetMapping("/{bookId}")
	    public ResponseEntity<Enquiry> getBookingById(@PathVariable Long enquiryId) {
	        return new ResponseEntity<Enquiry>(enquiryService.findBookById(enquiryId), HttpStatus.OK);
	    }

	
	
}
