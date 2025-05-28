package com.paulo07reis.centraltask.models;

import com.paulo07reis.centraltask.domain.services.TaskService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private int priority;
    private String title;
    private String description;
    private TaskState state;

    public Task newTask() {
        TaskService.tasksList.add(this);
        return this;
    }
}
