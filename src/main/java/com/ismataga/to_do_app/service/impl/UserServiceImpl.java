package com.ismataga.to_do_app.service.impl;


import com.ismataga.to_do_app.dto.UserRequest;
import com.ismataga.to_do_app.dto.UserResponse;
import com.ismataga.to_do_app.entity.User;
import com.ismataga.to_do_app.exceptions.UserNotFoundException;
import com.ismataga.to_do_app.mapper.UserMapper;

import com.ismataga.to_do_app.repository.UserRepository;
import com.ismataga.to_do_app.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService , UserDetailsService {

    private final UserRepository userRepository;
    private final UserMapper userMapper ;
    private final PasswordEncoder encoder;

    @Override
    public void createUser(UserRequest userRequest) {
        log.info("createUser().start");
        User user = userMapper.mapToUserEntity(userRequest);
        userRepository.save(user);
        log.info("createdToDo().end");
    }

    @Override
    public List<UserResponse> getAllUsers() {
        log.info("getAllUsers().start");
        List<User> users = userRepository.findAll();
        List<UserResponse> userResponses = userMapper.mapToUserResponseList(users);
        log.info("getAllUsers().end");
        return userResponses;
    }

    @Override
    public UserResponse getUserById(Long id) {
        log.info("getUserById().start id {}", id);
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not founded by id " + id));
        log.info("getUserById().end id {} ", id);
        return userMapper.mapToUserResponse(user);
    }

    @Override
    public void updateUserById(Long id, UserRequest userRequest) {
        log.info("updateUserById().start id {}", id);
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not founded by id " + id));
        if (userRequest.getName() != null) {
            user.setName(userRequest.getName());
        }
        userRepository.save(user);
        log.info("updateUserById().end id {}", id);

    }

    @Override
    public void deleteUser(Long id) {
        log.info("deleteUserById().start id {}", id);
        userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not founded by id " + id));
        userRepository.deleteById(id);
        log.info("deleteUserById().end id {}", id);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new org.springframework.security.core.userdetails.User(username, encoder.encode( "12345"), Collections.emptyList());
    }
















}
