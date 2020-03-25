package com.eecrs.eecrsbe.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@Data
public class BaseEntity {

    @Column(name = "row_id", nullable = false)
    private UUID _randomId = UUID.randomUUID();

    @Column(name = "version")
    @Version
    private Integer version = 0;

    @Column(name = "created_by", length = 20, nullable = false)
    @CreatedBy
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", nullable = false)
    @CreatedDate
    private Date createdAt = new Date();

    @Column(name = "updated_by", length = 20, nullable = true)
    @LastModifiedBy
    private String updatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date", nullable = true)
    @LastModifiedDate
    private Date updatedAt = new Date();

    private static Date uCreatedAt=null;
    private static String uCreatedBy=null;

    public void setUPCreatedAt(){

        this.createdAt=uCreatedAt;
        this.createdBy=uCreatedBy;

    }

    /**
     * Sets createdAt before insert
     */
    @PrePersist
    public void setCreatedAt() {
        this.createdAt = new Date();
        Authentication currentAuth = SecurityContextHolder.getContext().getAuthentication();
        if (currentAuth != null)
            this.createdBy = currentAuth.getName();
        else
            this.createdBy = "SYSTEM";
    }
    @PreUpdate
    public void setUpdatedAt() {

        this.updatedAt = new Date();
        Authentication currentAuth = SecurityContextHolder.getContext().getAuthentication();
        if (currentAuth != null)
            this.updatedBy = currentAuth.getName();
        else
            this.updatedBy = "SYSTEM";
    }


    public String getUpdatedBy() {
        return updatedBy;
    }

}
