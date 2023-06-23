package com.ismataga.to_do_app.service;

import com.ismataga.to_do_app.dto.ToDoRequest;
import com.ismataga.to_do_app.dto.ToDoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService{


    @Override
    public void createTask(ToDoRequest toDoRequest) {

    }

    @Override
    public List<ToDoResponse> getAllToDo() {
        return null;
    }

    @Override
    public ToDoResponse getToDoById(Long id) {
        return null;
    }



    @Override
    public void updateToDo(Long id, ToDoRequest toDoRequest) {

    }

    @Override
    public void deleteToDo(Long id) {

    }
}
