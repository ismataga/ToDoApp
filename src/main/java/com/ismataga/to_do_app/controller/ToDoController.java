package com.ismataga.to_do_app.controller;

import com.ismataga.to_do_app.dto.ToDoRequest;
import com.ismataga.to_do_app.dto.ToDoResponse;
import com.ismataga.to_do_app.entity.Task;
import com.ismataga.to_do_app.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/tasks")
@RequiredArgsConstructor
public class ToDoController {

    private final ToDoService toDoService;


    @PostMapping
    public void createToDo(@RequestBody ToDoRequest toDoRequest) { toDoService.createToDo(toDoRequest);
    }


    @GetMapping
    public List<ToDoResponse> getAllToDos() {
        return toDoService.getAllToDo();
    }


    @GetMapping("{id}")
    public ToDoResponse getToDo(@PathVariable Long id) {
        return toDoService.getToDoById(id);
    }


    @PutMapping("{id}")
    public void updateToDo(@PathVariable Long id, @RequestBody ToDoRequest toDoRequest) { toDoService.updateToDo(id, toDoRequest);

    }

    @DeleteMapping("{id}")
    public void deleteToDo(@PathVariable Long id) { toDoService.deleteToDo(id);
    }

//    @GetMapping("/users/{id}")
//    public List<Task> getTasksByUserId(@PathVariable Long id) {
//        return toDoService.getTasksByUserId(id);
//    }

}
