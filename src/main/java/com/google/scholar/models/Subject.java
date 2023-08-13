package com.google.scholar.models;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int coefficient;
    private int rank;
    @ManyToOne
    private SubjectGroup subjectGroup;
}
