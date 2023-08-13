package com.google.scholar.models;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;
    @ManyToOne
    private Level level;
}
