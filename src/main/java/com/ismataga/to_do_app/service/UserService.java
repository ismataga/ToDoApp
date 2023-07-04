package com.ismataga.to_do_app.service;


import com.ismataga.to_do_app.dto.UserRequest;
import com.ismataga.to_do_app.dto.UserResponse;



import java.util.List;

public interface UserService {
    void createUser(UserRequest userRequest);

    List<UserResponse> getAllUsers();
    UserResponse getUserById(Long id);

    void updateUserById(Long id,UserRequest userRequest);

    void deleteUser(Long id);


}
