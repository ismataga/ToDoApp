package com.ismataga.to_do_app.service.impl;


import com.ismataga.to_do_app.dto.RegistrationDTO;
import com.ismataga.to_do_app.entity.User;
import com.ismataga.to_do_app.mapper.UserMapper;
import com.ismataga.to_do_app.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final UserRepository repository;
    private final UserMapper mapper;
    private final MailSender mailSender;
    @Value("${app.registration.base-path")
    private String baseUrl;


    public void register(RegistrationDTO dto) {

        User user = Optional.of(dto).map(mapper::toEntity).map(repository::save).orElseThrow();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(dto.getUsername());
        message.setFrom("info@good.company");
        message.setSubject("Registration Confirmation");
        message.setText(baseUrl + "/registration/confirmation" +user.getUuid());
//        mailSender.send(message);
        System.out.println(baseUrl + "/registration/confirmation/" +user.getUuid());
    }


}
