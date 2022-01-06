package com.javarnd.ems.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_detailsService {
    @Autowired
    private Student_detailsRespository reviewRepository;

    public Student_details saveOrUpdateABook(Student_details review) {
        return reviewRepository.save(review);
    }

    public Student_details findReviewById(Long bookId) {
        return reviewRepository.getByStudentId(bookId);
    }

    public Iterable<Student_details> findAll() {
        return reviewRepository.findAll();
    }
}
