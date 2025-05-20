package com.user.management.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class UserChangeRequestDto {

    @Pattern(regexp = "^[A-Za-z0-9_]{3,20}$")
    private String userId;

    @NotBlank
    private String name;

    @NotBlank
    @Email(message = "無効な電子メール形式")
    private String email;

    @NotBlank
    @Pattern(
        regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
        message = "パスワードは8文字以上で、大文字・小文字・数字・記号を含めてください。"
    )
    private String password;

    private boolean admin;

    @NotBlank
    private String flag;
}