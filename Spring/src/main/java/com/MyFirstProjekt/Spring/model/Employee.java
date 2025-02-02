package com.MyFirstProjekt.Spring.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter; 

@Entity
@Table(name = "employees")
@Getter
@Setter

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    
}