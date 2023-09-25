package com.ismataga.to_do_app.dto;

import com.ismataga.to_do_app.entity.Task;
import lombok.*;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<Task> taskList;
}
