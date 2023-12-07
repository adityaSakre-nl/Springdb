package com.spring.springdb.controller;

import com.spring.springdb.entity.Users;
import com.spring.springdb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public @ResponseBody List<Users> getAllUsers(){
        return userService.getALlUsers();
    }

    @GetMapping("/{id}")
    public @ResponseBody Users getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @PostMapping("/add")
    public @ResponseBody Users addUser(@RequestBody Users user)
    {
        return userService.createUser(user);
    }

    @GetMapping("/del/{id}")
    public @ResponseBody void removeUserById(@PathVariable int id)
    {
        userService.deleteUserById(id);
    }

    @GetMapping("/delAll")
    public @ResponseBody void deleteALl()
    {
        userService.deleteALl();
    }

    @GetMapping("/cnt")
    public @ResponseBody int recordCount()
    {
        return userService.record_numbers();
    }

    @GetMapping("/cls")
    public @ResponseBody String callname(){
        return userService.getClassName();
    }
}
