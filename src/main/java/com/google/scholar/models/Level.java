package com.google.scholar.models;

import lombok.Getter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String section;
    private String name;
    private String series;
    @OneToMany(mappedBy = "level")
    private Set<Classroom> classrooms = new HashSet<>();
}
