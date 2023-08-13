package com.google.scholar.models;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Academic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int year;
    @ManyToOne
    private School school;
}
