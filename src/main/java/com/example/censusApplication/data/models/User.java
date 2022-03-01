package com.example.censusApplication.data.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;


@Data
@Entity
@Table(name = "user", uniqueConstraints= @UniqueConstraint(columnNames="email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
                joinColumns = @JoinColumn(
                        name = "user_id", referencedColumnName = "id"
                ), inverseJoinColumns = @JoinColumn(
                        name = "role_id", referencedColumnName = "id"
    ))
    private Collection<Role> roles;
}
