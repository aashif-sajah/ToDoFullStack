package com.aashif.toDo.contoller;

import com.aashif.toDo.model.Task;
import com.aashif.toDo.repository.TaskRepo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/tasks")
public class TaskController
{
    private TaskRepo taskRepo;

    TaskController(TaskRepo taskRepo){
        this.taskRepo = taskRepo;
    }

    @GetMapping("/hello-world")
    public String helloWorld()
    {
        return "Hello World";
    }

    @PostMapping
    public String createTask(@RequestBody Task task)
    {
        taskRepo.save(task);
        return task.toString();
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return taskRepo.findAll();
    }
}
