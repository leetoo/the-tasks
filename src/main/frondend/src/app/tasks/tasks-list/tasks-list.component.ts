import { Component, OnInit } from '@angular/core';
import {Task} from "../task.model";

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {



    tasks:Task[] = [];

  constructor() { }

  ngOnInit() {
      this.tasks.push(new Task(1,"task 1 ", false , "12/12/18"));
      this.tasks.push(new Task(1,"task 2 ", true , "11/12/18"));
      this.tasks.push(new Task(1,"task 3 ", false , "15/12/18"));
      this.tasks.push(new Task(1,"task 4 ", true , "18/12/18"));
  }

    getDueDateLabel(task: Task){
        return task.completed ? 'label-success' : 'label-primary';
    }

    onTaskChange(event, task) {
        // this.taskService.saveTask(task,event.target.checked).subscribe();
        console.log('Task has changed');
    }

}
