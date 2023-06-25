package com.ismataga.to_do_app.controller;

import com.ismataga.to_do_app.dto.UserRequest;
import com.ismataga.to_do_app.dto.UserResponse;
import com.ismataga.to_do_app.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userServiceImpl;

    @PostMapping
    public void addUser(@RequestBody UserRequest userRequest){
        userServiceImpl.createUser(userRequest);
    }
    @GetMapping
    public List<UserResponse> getAllUsers(){
      return   userServiceImpl.getAllUsers();
    }
    @GetMapping("{id}")
    public UserResponse getUserById(@PathVariable Long id){
        return userServiceImpl.getUserById(id);
    }

    @PutMapping("{id}")
    public void updateUserById(@PathVariable Long id,@RequestBody UserRequest userRequest){
        userServiceImpl.updateUserById(id,userRequest);
    }
    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable Long id){
        userServiceImpl.deleteUser(id);
    }
}
