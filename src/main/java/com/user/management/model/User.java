package com.user.management.model;

import com.user.management.model.dto.UserChangeRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    @Id
    private String userId;

    private String name;

    private String email;

    private String password;

    @Column(name = "isAdmin")
    private boolean admin = false;

    public User(UserChangeRequestDto changeRequestDto) {
        this.userId = changeRequestDto.getUserId();
        this.name = changeRequestDto.getName();
        this.email = changeRequestDto.getEmail();
        this.password = changeRequestDto.getPassword();
        this.admin = changeRequestDto.isAdmin();
    }
}
