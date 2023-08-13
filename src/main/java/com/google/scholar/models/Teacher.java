package com.google.scholar.models;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    private String sex;
    @Column(unique = true)
    private String matriculation;
    private String phone;
    private String email;
    private String grade;
    private String speciality;
    @ManyToOne
    private Department department;
}
