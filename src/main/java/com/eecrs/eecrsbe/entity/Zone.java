package com.eecrs.eecrsbe.entity;

import lombok.Data;

import javax.persistence.Column;


@Data
public class Zone  extends BaseEntity{
    @Column(name = "name")
    private String name;
    @Column
    private Region region;
}
