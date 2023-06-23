package com.ismataga.to_do_app.controller;

import com.ismataga.to_do_app.dto.ToDoRequest;
import com.ismataga.to_do_app.dto.ToDoResponse;
import com.ismataga.to_do_app.entity.Status;
import com.ismataga.to_do_app.entity.ToDo;
import com.ismataga.to_do_app.service.ToDoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/tasks")
@RequiredArgsConstructor
public class ToDoController {
    private final ToDoServiceImpl toDoServiceImpl;


    @PostMapping
    public void createToDo(@RequestBody ToDoRequest toDoRequest) {
        toDoServiceImpl.createTask(toDoRequest);
    }


    @GetMapping
    public List<ToDoResponse> getToDo() {
        return toDoServiceImpl.getAllToDo();

    }


    @GetMapping("{id}")
    public ToDoResponse getToDo(@PathVariable Long id) {
        return toDoServiceImpl.getToDoById(id);
    }

    @PatchMapping("{id}")
    public void updateToDo(@PathVariable Long id, @RequestBody ToDoRequest toDoRequest) {
        toDoServiceImpl.updateToDo(id, toDoRequest);

    }

    @DeleteMapping("{id}")
    public void deleteToDo(@PathVariable Long id) {
        toDoServiceImpl.deleteToDo(id);
    }

}
