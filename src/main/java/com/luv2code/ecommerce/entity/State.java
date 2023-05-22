package com.luv2code.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(table = "country_id")
    private Country country_id;
}
