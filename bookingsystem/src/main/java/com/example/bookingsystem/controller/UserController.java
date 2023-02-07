package com.example.bookingsystem.controller;

import com.example.bookingsystem.service.UserService;
import com.example.bookingsystem.shared.GenericResponse;
import com.example.bookingsystem.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    GenericResponse createUser(@RequestBody User user){
        userService.save(user);
        return new GenericResponse("User Saved");
    }

}
