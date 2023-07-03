package com.ismataga.to_do_app.service.impl;

import com.ismataga.to_do_app.dto.ToDoRequest;
import com.ismataga.to_do_app.dto.ToDoResponse;
import com.ismataga.to_do_app.entity.Task;
import com.ismataga.to_do_app.entity.User;
import com.ismataga.to_do_app.mapper.ToDoMapper;
import com.ismataga.to_do_app.repository.ToDoRepository;
import com.ismataga.to_do_app.repository.UserRepository;
import com.ismataga.to_do_app.service.ToDoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class ToDoServiceImpl implements ToDoService {
    private final ToDoMapper toDoMapper = ToDoMapper.INSTANCE;

    private final ToDoRepository toDoRepository;
    private final UserRepository userRepository;


    @Override
    public void createToDo(ToDoRequest toDoRequest) {
        log.info("createToDo().start");
        Task task = toDoMapper.mapToToDoEntity(toDoRequest);
        toDoRepository.save(task);
        log.info("createdToDo().end");
    }



    @Override
    public List<ToDoResponse> getAllToDo() {

        log.info("getAllToDo().start");
        List<Task> task = toDoRepository.findAll();
        List<ToDoResponse> toDoResponses = toDoMapper.mapToToDoResponseList(task);
        log.info("getAllToDo().end");
        return toDoResponses;
    }

    @Override
    public ToDoResponse getToDoById(Long id) {
        log.info("getToDoById().start id {}", id);
        Task task = toDoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ToDo not founded by id" + id));
        log.info("getToDoById().end id {}", id);
        return toDoMapper.mapToToDoResponse(task);

    }


    @Override
    public void updateToDo(Long id, ToDoRequest toDoRequest) {
        log.info("updateToDo().start id {} ", id);

        Task task = toDoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("To do not founded by id" + id));
        if (toDoRequest.getName() != null)
            task.setName(toDoRequest.getName());
        toDoRepository.save(task);
        log.info("updateToDo().end id {}", id);
    }

    @Override
    public void deleteToDo(Long id) {
        log.info("deleteToDo().start id ", id);
        toDoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("To do not founded by id" + id));
        toDoRepository.deleteById(id);
        log.info("deleteToDo().end id ", id);

    }
//    public List<ToDoResponse> getTasksByUserId(Long id) {
//        List<Task> task = toDoRepository.findByUserUserId(id);
//        List<ToDoResponse> toDoResponses = toDoMapper.mapToToDoResponses(task);
//
//        return toDoResponses;
//
//    }
}
