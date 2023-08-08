package com.ismataga.to_do_app.dto;

import com.ismataga.to_do_app.annotation.PasswordMatch;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@PasswordMatch
public class RegistrationDTO {

    @NotBlank
    @Email(regexp = )
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String confirmPassword;

}
