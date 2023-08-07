package com.ismataga.to_do_app.mapper;


import com.ismataga.to_do_app.dto.RegistrationDTO;
import com.ismataga.to_do_app.dto.UserRequest;
import com.ismataga.to_do_app.dto.UserResponse;
import com.ismataga.to_do_app.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Mapper
public abstract class UserMapper {

    @Autowired
    protected PasswordEncoder encoder;

    public abstract User mapToUserEntity(UserRequest userRequest);

    public abstract List<UserResponse> mapToUserResponseList(List<User> user);

    public abstract UserResponse mapToUserResponse(User user);

    @Mapping(target = "name", ignore = true)
    @Mapping(target = "email", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "accountNonExpired", constant = "true")
    @Mapping(target = "accountNonLocked", constant = "true")
    @Mapping(target = "credentialsNonExpired", constant = "true")
    @Mapping(target = "password", expression = "java(encoder.encode(dto.getPassword()))")
    public abstract User toEntity(RegistrationDTO dto);

}
