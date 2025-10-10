package com.courseweb.course.controllers;

import com.courseweb.course.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAllUsers() {
        User user = new User(1L, "john_doe", "johnD@gmail,com", "1234567890", "password123");
        return ResponseEntity.ok().body(user);
    }



}
