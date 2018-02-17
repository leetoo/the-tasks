package com.theunrealapp.tasks.service;

import com.theunrealapp.tasks.domain.Task;

public interface TaskService {
  Iterable<Task> list();

  Task save(Task task);
}
