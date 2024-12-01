package com.aashif.toDo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TaskController
{

    @GetMapping("/hello-world")
    public String helloWorld()
    {
        return "Hello World";
    }
}
