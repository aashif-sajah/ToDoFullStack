package com.aashif.toDo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class TaskController
{

    @GetMapping("/hello-world")
    public String helloWorld()
    {
        return "Hello World";
    }

    @PostMapping("/api/tasks")
    public List<String> createTask()
    {
        List<String>users = new ArrayList<>();
        users.add("John");
        users.add("Jane");
        return users;
    }
}
