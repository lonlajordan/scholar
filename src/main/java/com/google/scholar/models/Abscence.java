package com.google.scholar.models;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
public class Abscence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
    private int duration = 1; // in hours
    private boolean justify = false;
    private String justification;
    @ManyToOne
    private Seance seance;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Evaluation evaluation;
}
