package com.javarnd.ems.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class Student_detailsController {
    @Autowired
    private Student_detailsService reviewService;

    @PostMapping("")
    public ResponseEntity<Student_details> addABook(@RequestBody Student_details review) {
        return new ResponseEntity<Student_details>(reviewService.saveOrUpdateABook(review), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<Student_details> getAllBookings(){
        return reviewService.findAll();
    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<Student_details> getBookingById(@PathVariable Long reviewId) {
        return new ResponseEntity<Student_details>(reviewService.findReviewById(reviewId), HttpStatus.OK);
    }
}
