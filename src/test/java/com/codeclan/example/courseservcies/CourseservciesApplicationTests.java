package com.codeclan.example.courseservcies;

import com.codeclan.example.courseservcies.models.Customer;
import com.codeclan.example.courseservcies.repositories.CustomerRepository;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@ActiveProfiles("test")
@SpringBootTest
class CourseservciesApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateCustomer(){
		Customer customer = new Customer("Bob Robson", "Edinburgh", 68);
		customerRepository.save(customer);

	}

}
