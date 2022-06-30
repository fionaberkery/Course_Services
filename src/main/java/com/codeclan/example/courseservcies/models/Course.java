package com.codeclan.example.courseservcies.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="town")
    private Town town;

    @Column(name="starRating")
    private double starRating;

    @OneToMany(mappedBy = "course")
    @JsonIgnoreProperties({"course"})
    private List<Booking> courseBookings;

    public Course(String name, Town town, double starRating) {
        this.name = name;
        this.town = town;
        this.starRating = starRating;
        this.courseBookings = new ArrayList<>();
    }

    public Course() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public double getStarRating() {
        return starRating;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }

    public List<Booking> getCourseBookings() {
        return courseBookings;
    }

    public void setCourseBookings(List<Booking> courseBookings) {
        this.courseBookings = courseBookings;
    }

    public Long getId() {
        return id;
    }


    public void addCourseBooking(Booking booking) {
        this.courseBookings.add(booking);
    }
}
