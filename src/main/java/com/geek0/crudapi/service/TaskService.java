package com.geek0.crudapi.service;

import com.geek0.crudapi.model.Task;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskService {
    Task createTask(Task task);

    List<Task> getAllTasks();
    Optional<Task> getTaskById(UUID id);
    Task updateTask(UUID id, Task taskDetails);
    void deleteTask(UUID id);
}
