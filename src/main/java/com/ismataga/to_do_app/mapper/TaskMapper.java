package com.ismataga.to_do_app.mapper;

import com.ismataga.to_do_app.dto.TaskRequest;
import com.ismataga.to_do_app.dto.TaskResponse;
import com.ismataga.to_do_app.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {


    Task mapToTaskEntity(TaskRequest taskRequest);

    List<TaskResponse> mapToTaskResponseList(List<Task> task);

    TaskResponse mapToTaskResponse(Task task);
}
