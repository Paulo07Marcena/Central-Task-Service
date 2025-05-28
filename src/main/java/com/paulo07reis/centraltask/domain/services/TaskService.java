package com.paulo07reis.centraltask.domain.services;

import com.paulo07reis.centraltask.models.Task;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import java.util.List;

@Service
public class TaskService {

    public static List<Task> tasksList;

    public Mono<Task> insert(Task task) {
        return Mono.just(task)
                .flatMap(this::save);
    }

    private Mono<Task> save (Task task){
        return Mono.just(task)
                .map(Task::newTask);
    }
}
