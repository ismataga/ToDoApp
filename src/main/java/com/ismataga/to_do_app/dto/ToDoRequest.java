package com.ismataga.to_do_app.dto;

import com.ismataga.to_do_app.entity.Status;
import com.ismataga.to_do_app.entity.User;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ToDoRequest {

    private String name;
    private String description;
    private Status status;
    private User user;
}
