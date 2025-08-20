package com.spring_learning.spring_security_client.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String matchingPassword;
}
