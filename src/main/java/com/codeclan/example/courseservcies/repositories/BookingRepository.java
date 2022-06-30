package com.codeclan.example.courseservcies.repositories;

import com.codeclan.example.courseservcies.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
