package com.theunrealapp.tasks.controller;

import com.theunrealapp.tasks.domain.Task;
import com.theunrealapp.tasks.repository.TaskRepository;
import com.theunrealapp.tasks.service.TaskService;
import com.theunrealapp.tasks.service.TaskServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

  private TaskService taskService;

  @GetMapping(value = {"","/"})
  public Iterable<Task> list(){

    return this.taskService.list();
  }




}
