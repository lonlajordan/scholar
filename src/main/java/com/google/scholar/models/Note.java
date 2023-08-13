package com.google.scholar.models;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double mark;
    @ManyToOne
    private Evaluation evaluation;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private Academic academic;
}
