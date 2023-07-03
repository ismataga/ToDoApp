package com.ismataga.to_do_app.mapper;

import com.ismataga.to_do_app.dto.ToDoRequest;
import com.ismataga.to_do_app.dto.ToDoResponse;
import com.ismataga.to_do_app.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ToDoMapper {
    ToDoMapper INSTANCE = Mappers.getMapper(ToDoMapper.class);

    Task mapToToDoEntity(ToDoRequest toDoRequest);

    List<ToDoResponse> mapToToDoResponseList(List<Task> task);

    ToDoResponse mapToToDoResponse(Task task);

//    List<ToDoResponse> mapToToDoResponses(List<Task> task);
}
