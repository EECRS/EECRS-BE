package com.eecrs.eecrsbe.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "version")
    @Version
    private Integer version = 0;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;

    @Column(name = "updated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;


    private static Date uCreatedAt=null;
    private static String uCreatedBy=null;

    public void setUPCreatedAt(){

        this.createdAt=uCreatedAt;
        this.createdBy=uCreatedBy;

    }

    /**
     * Sets createdAt before insert
     */
    public void setCreatedAt() {
      /*  this.createdAt = new Date();
        Authentication currentAuth = SecurityContextHolder.getContext().getAuthentication();
        if (currentAuth != null)
            this.createdBy = currentAuth.getName();
        else
            this.createdBy = "SYSTEM"; */
    }
    @PreUpdate
    public void setUpdatedAt() {
        this.updatedAt = new Date();
    }
}
