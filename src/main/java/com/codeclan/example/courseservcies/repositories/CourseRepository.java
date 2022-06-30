package com.codeclan.example.courseservcies.repositories;

import com.codeclan.example.courseservcies.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
