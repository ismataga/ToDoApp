package com.ismataga.to_do_app.dto;

import com.ismataga.to_do_app.entity.Status;
import com.ismataga.to_do_app.entity.User;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponse {
    @NotNull
    private Long id;
    private String name;
    private String description;
    private Status status;

}
