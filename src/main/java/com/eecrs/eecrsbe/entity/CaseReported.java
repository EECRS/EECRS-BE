package com.eecrs.eecrsbe.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class CaseReported extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private long id;

    @ManyToOne
    @JoinColumn(name = "location")
    private Location location;

    @Column
    private CaseType type;

    @Column
    private Integer amount;

    @Column
    private LocalDate reportedDate;
}
