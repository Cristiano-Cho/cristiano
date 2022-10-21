package com.example.ToDo.App.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class TodoAppContoller {
    @GetMapping
    public String Helloworld() {
        return "To-do Application !";
    }
}
