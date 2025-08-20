package com.spring_learning.spring_security_client.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    @Column(length = 60)
    private String password;
    private String role;
    private boolean enabled = false;

}
