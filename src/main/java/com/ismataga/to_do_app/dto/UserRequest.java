package com.ismataga.to_do_app.dto;

import com.ismataga.to_do_app.entity.Task;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotBlank
    private String name;
    @NotNull
    @Email(regexp = "^\\w+@\\w+\\.\\w+$")
    private String email;
    private String password;
}
