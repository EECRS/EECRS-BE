package com.eecrs.eecrsbe.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "user_tbl", uniqueConstraints = @UniqueConstraint(columnNames = {"username","email"}))
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_id_seq")
    @SequenceGenerator(name = "user_id_seq", sequenceName = "users_id_seq", allocationSize = 1)
    @Column(name = "user_id")
    private long id;

    private String username;
    private String password;
    private String email;
    private String jobTitle;
    private String organization;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = {@JoinColumn(name = "role_id") })
    private List<Role> roles = new ArrayList<>();

}
