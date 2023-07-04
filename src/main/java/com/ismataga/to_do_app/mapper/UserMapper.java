package com.ismataga.to_do_app.mapper;


import com.ismataga.to_do_app.dto.TaskResponse;
import com.ismataga.to_do_app.dto.UserRequest;
import com.ismataga.to_do_app.dto.UserResponse;
import com.ismataga.to_do_app.entity.Task;
import com.ismataga.to_do_app.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapToUserEntity(UserRequest userRequest);

    List<UserResponse> mapToUserResponseList(List<User> user);

    UserResponse mapToUserResponse(User user);


}
