package com.eecrs.eecrsbe.entity;

import lombok.Data;

import javax.persistence.Column;

@Data
public class Case extends BaseEntity {
    private Integer confirmed;

    private Integer deaths;

    private Integer recovered;

    @Column(name = "new_confirmed")
    private Integer newConfirmed;

    @Column(name = "new_deaths")
    private Integer newDeaths;

    @Column(name = "new_recovered")
    private Integer newRecovered;
}
