package com.eecrs.eecrsbe.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
public class Case extends BaseEntity {

    @ManyToOne
    @JoinColumn
    private Location location;

    @Column
    private CaseType type;

    @Column
    private Integer amount;

    @Column
    private LocalDate reportedDate;
}
