package com.eecrs.eecrsbe.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private long id;

    @ManyToOne
    @JoinColumn(name = "woreda")
    private Woreda woreda;

    @Column
    private String latitude;

    @Column
    private String longitude;

}
