package com.example.rad2.controller;

import com.example.rad2.entity.User;
import com.example.rad2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/submit")
    @ResponseBody
    public ResponseEntity<String> submitUser(
            @RequestParam String name,
            @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userService.saveUser(user);
        return ResponseEntity.ok("Пользователь сохранен!");
    }
}