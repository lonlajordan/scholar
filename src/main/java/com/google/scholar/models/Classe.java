package com.google.scholar.models;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String section;
    private String level;
    private String series;
    private String option;
    @ManyToMany
    private List<Subject> subjects;
}
