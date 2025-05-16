package com.visitor.management.system.src.main.java.com.user.management.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import org.springframework.data.annotation.Id;

@Entity
public class User {
    @Id
    private Long userId;

    private String name;

    @Email(message = "無効な電子メール形式")
    private String email;


    private String password;

    private String isAdmin;

    private String isDeleted;
}
