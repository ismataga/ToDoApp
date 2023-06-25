package com.ismataga.to_do_app.service;

import com.ismataga.to_do_app.dto.UserRequest;
import com.ismataga.to_do_app.dto.UserResponse;
import com.ismataga.to_do_app.entity.User;
import com.ismataga.to_do_app.mapper.UserMapper;
import com.ismataga.to_do_app.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper = UserMapper.INSTANCE;

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
        List<User> user = userRepository.findAll();
        List<UserResponse> userResponses = userMapper.mapToUserResponseList(user);
        log.info("getAllUsers().end");
        return userResponses;
    }

    @Override
    public UserResponse getUserById(Long id) {
        log.info("getUserById().start id {}", id);
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not founded by id" + id));
        log.info("getUserById().end id {} ", id);
        return userMapper.mapToUserResponse(user);
    }

    @Override
    public void updateUserById(Long id, UserRequest userRequest) {
        log.info("updateUserById().start id {}", id);
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not founded by id" + id));
        if (userRequest.getName() != null) {
            user.setName(userRequest.getName());
        }
        userRepository.save(user);
        log.info("updateUserById().end id {}", id);

    }

    @Override
    public void deleteUser(Long id) {
        log.info("deleteUserById().start id {}", id);
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not founded by id" + id));
        userRepository.deleteById(id);
        log.info("deleteUserById().end id {}", id);
    }
}
