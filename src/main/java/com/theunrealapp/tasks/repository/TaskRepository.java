package com.theunrealapp.tasks.repository;

import com.theunrealapp.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;


public interface TaskRepository extends CrudRepository<Task,Long> {


}
