package com.theunrealapp.tasks.service;

import com.theunrealapp.tasks.domain.Task;
import com.theunrealapp.tasks.repository.TaskRepository;
import org.springframework.web.bind.annotation.GetMapping;

public class TaskServiceImpl implements TaskService{



  private TaskRepository taskRepository;
  public TaskServiceImpl(TaskRepository taskRepository){
    this.taskRepository = taskRepository;
  }

  @Override
  public Iterable<Task> list() {
    return this.taskRepository.findAll();
  }
}
