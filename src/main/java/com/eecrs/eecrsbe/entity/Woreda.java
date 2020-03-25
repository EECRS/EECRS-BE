package com.eecrs.eecrsbe.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Woreda extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "subCity_id")
    private SubCity subCity;
}
