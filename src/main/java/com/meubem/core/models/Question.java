package com.meubem.core.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String institution;

    @Column(columnDefinition="CLOB NOT NULL")
    @Lob
    private String statement;

//    @OneToMany
//    private List<Alternative> alternatives;
//
//    @OneToOne
//    private Alternative correct;
}

