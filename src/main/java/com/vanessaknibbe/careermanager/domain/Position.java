package com.vanessaknibbe.careermanager.domain;

import javax.persistence.*;

@Entity
@Table
public class Position {

    //fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String title;

    @Column
    private boolean isRemote;

    @Column
    private String level; // could make these enums

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Company company;

    //constructor

    //getter and setters

}
