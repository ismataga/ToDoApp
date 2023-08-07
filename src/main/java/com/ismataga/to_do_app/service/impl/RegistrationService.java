package com.ismataga.to_do_app.service.impl;


import com.ismataga.to_do_app.dto.RegistrationDTO;
import com.ismataga.to_do_app.entity.User;
import com.ismataga.to_do_app.mapper.UserMapper;
import com.ismataga.to_do_app.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final UserRepository repository;
    private final UserMapper mapper;



    public void register(RegistrationDTO dto){

        User entity = mapper.toEntity(dto);


    }


}
