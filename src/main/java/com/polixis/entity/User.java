package com.polixis.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Vardan Tevosyan
 */
@Getter
@Setter
@Entity
@Table(name = "t_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;
}
