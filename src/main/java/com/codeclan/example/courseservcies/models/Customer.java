package com.codeclan.example.courseservcies.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="homeTown")
    private String homeTown;

    @Column(name="age")
    private int age;

    @OneToMany(mappedBy = "customer")
    @JsonIgnoreProperties({"customer"})
    private List<Booking> customerBookings;

    public Customer(String name, String homeTown, int age) {
        this.name = name;
        this.homeTown = homeTown;
        this.age = age;
        this.customerBookings = new ArrayList<>();
    }

    public Customer() {
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Booking> getCustomerBookings() {
        return customerBookings;
    }

    public void setCustomerBookings(List<Booking> customerBookings) {
        this.customerBookings = customerBookings;
    }

    public Long getId() {
        return id;
    }

    public void addCustomerBooking(Booking booking) {
        this.customerBookings.add(booking);
    }
}
