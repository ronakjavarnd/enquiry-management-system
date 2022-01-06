package com.javarnd.ems.enquiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EnquiryService {

    @Autowired
    private EnquiryRepository enquiryRepository;

    public Enquiry saveOrUpdateABook(Enquiry book) {
    	System.out.println("book"+book);
        return enquiryRepository.save(book);
    }

    public Enquiry findBookById(Long bookId) {
        return enquiryRepository.getByenquiryId(bookId);
    }

    public Iterable<Enquiry> findAll() {
        return enquiryRepository.findAll();
    }


}
