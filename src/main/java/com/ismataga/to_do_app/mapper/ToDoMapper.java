package com.ismataga.to_do_app.mapper;

import com.ismataga.to_do_app.dto.ToDoRequest;
import com.ismataga.to_do_app.dto.ToDoResponse;
import com.ismataga.to_do_app.entity.ToDo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ToDoMapper {
    ToDoMapper INSTANCE = Mappers.getMapper(ToDoMapper.class);

    ToDo mapToToDoEntity(ToDoRequest toDoRequest);

    List<ToDoResponse> mapToToDoResponseList(List<ToDo> employees);

    ToDoResponse mapToToDoResponse(ToDo toDo);
}
