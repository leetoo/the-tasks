package com.theunrealapp.tasks.service;

import com.theunrealapp.tasks.domain.Task;
import com.theunrealapp.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class TaskServiceImpl implements TaskService {
  private TaskRepository taskRepository;

  public TaskServiceImpl(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  @Override
  public Iterable<Task> list() {
    return this.taskRepository.findAll();
  }

  @Override
  public Task save(Task task) {
    return this.taskRepository.save(task);
  }
}
