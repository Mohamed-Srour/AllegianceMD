package com.example.taskdemo.controllers;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskdemo.business.dtos.UserDto;
import com.example.taskdemo.business.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
 
    @GetMapping("/getAll")
    public ResponseEntity<List<UserDto>> getAllUsers()
    {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable int id)
    {
        return ResponseEntity.ok(userService.getById(id));
    }
    
}
