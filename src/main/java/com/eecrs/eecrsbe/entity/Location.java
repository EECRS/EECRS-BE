package com.eecrs.eecrsbe.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class Location {

    @ManyToOne
    @JoinColumn(name = "woreda")
    private Woreda woreda;

    @Column
    private String latitude;

    @Column
    private String longitude;
}
