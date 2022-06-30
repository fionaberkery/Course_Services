package com.codeclan.example.courseservcies.repositories;

import com.codeclan.example.courseservcies.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
