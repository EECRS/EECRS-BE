package com.eecrs.eecrsbe.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Zone  extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private long id;
    @Column(name = "name")
    private String name;
    @Column
    private Region region;
}
