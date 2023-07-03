package com.ismataga.to_do_app.service;

import com.ismataga.to_do_app.dto.ToDoRequest;
import com.ismataga.to_do_app.dto.ToDoResponse;
import com.ismataga.to_do_app.entity.Task;


import java.util.List;

public interface ToDoService {
    void createToDo(ToDoRequest toDoRequest);

    List<ToDoResponse> getAllToDo();

    ToDoResponse getToDoById(Long id);

    void updateToDo(Long id, ToDoRequest toDoRequest);

    void deleteToDo(Long id);
//    List<Task> getTasksByUserId(Long id);
}
