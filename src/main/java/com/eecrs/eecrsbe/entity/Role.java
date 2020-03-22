package com.eecrs.eecrsbe.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "role_tbl", uniqueConstraints = @UniqueConstraint(columnNames = {"role"}))
public class Role extends  BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roles_id_seq")
    @SequenceGenerator(name = "role_id_seq", sequenceName = "roles_id_seq", allocationSize = 1)
    @Column(name = "role_id")
    private long id;

    private com.eecrs.eecrsbe.entity.enums.Role role;
    private String description;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    private List<User> users = new ArrayList<>();

}
