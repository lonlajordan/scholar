package com.google.scholar.models;

import lombok.Getter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Classroom classroom;
    @ManyToOne
    private Teacher teacher;
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private Academic academic;
    @OneToMany(mappedBy = "course")
    private Set<Seance> seances = new HashSet<>();

}
