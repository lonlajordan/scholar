package com.google.scholar.models;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
public class SubjectGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "subjectGroup")
    private List<Subject> subjects;
}
