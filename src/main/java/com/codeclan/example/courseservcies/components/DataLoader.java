package com.codeclan.example.courseservcies.components;

import com.codeclan.example.courseservcies.models.Booking;
import com.codeclan.example.courseservcies.models.Course;
import com.codeclan.example.courseservcies.models.Customer;
import com.codeclan.example.courseservcies.models.Town;
import com.codeclan.example.courseservcies.repositories.BookingRepository;
import com.codeclan.example.courseservcies.repositories.CourseRepository;
import com.codeclan.example.courseservcies.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;



//@Profile("!test")
// @Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Customer bobRobson = new Customer("Bob Robson", "Edinburgh", 68);
        customerRepository.save(bobRobson);

        Course python = new Course("Python", Town.GLASGOW, 4.7);
        courseRepository.save(python);

        Booking bobsBooking = new Booking("22-04-23", python, bobRobson);
        bookingRepository.save(bobsBooking);

        python.addCourseBooking(bobsBooking);
        courseRepository.save(python);

        bobRobson.addCustomerBooking(bobsBooking);
        customerRepository.save(bobRobson);

    }
}
