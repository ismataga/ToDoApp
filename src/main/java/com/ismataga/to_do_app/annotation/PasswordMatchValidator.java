package com.ismataga.to_do_app.annotation;

import com.ismataga.to_do_app.dto.RegistrationDTO;
import com.ismataga.to_do_app.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Objects;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, RegistrationDTO> {

    @Override
    public boolean isValid(RegistrationDTO value, ConstraintValidatorContext context) {
        return value == null || Objects.equals(value.getPassword(), value.getConfirmPassword());
    }


}
