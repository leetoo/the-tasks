package com.theunrealapp.tasks.controller;

import com.theunrealapp.tasks.domain.Task;
import com.theunrealapp.tasks.repository.TaskRepository;
import com.theunrealapp.tasks.service.TaskService;
import com.theunrealapp.tasks.service.TaskServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
  private TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }

  @GetMapping(value = {"", "/"})
  public Iterable<Task> list() {
    return this.taskService.list();
  }

  @PostMapping("/save")
  public Task saveTask(@RequestBody Task task) {
    return this.taskService.save(task);
  }
}
