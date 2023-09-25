package com.ismataga.to_do_app.service;

import com.ismataga.to_do_app.dto.RegistrationDTO;
import com.ismataga.to_do_app.dto.ResetPasswordDto;
import com.ismataga.to_do_app.dto.TaskRequest;

public interface EmailService {


    void forgotPassword(String email);


    void resetPassword(ResetPasswordDto resetPasswordDto);
}
