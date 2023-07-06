package com.ismataga.to_do_app.dto;
import com.ismataga.to_do_app.entity.Task;
import lombok.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private String name;
    private String  email;
    private String password;
    private List<Task> taskList;
}
