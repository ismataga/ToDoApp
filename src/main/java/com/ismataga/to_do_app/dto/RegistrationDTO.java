package com.ismataga.to_do_app.dto;

import com.ismataga.to_do_app.annotation.PasswordMatch;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@PasswordMatch(groups = ValidUser.class)
public class RegistrationDTO {



    @NotBlank
    private String username;

    @NotBlank(groups = {ValidRegistration.class})
    private String password;

    @NotBlank
    private String confirmPassword;

}
