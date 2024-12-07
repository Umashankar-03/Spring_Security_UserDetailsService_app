package com.sbss.project.controller;

import com.sbss.project.entity.AppUser;
import com.sbss.project.service.AppUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.sbss.project.entity.AppUser;
import com.sbss.project.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
 // Added base mapping for better API structure
public class UserRestController {

    private final AppUserService appUserService;

    @Autowired // Ensures Spring properly wires this bean
    public UserRestController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @PostMapping("/registerUser")
    public String registerAppUser(@RequestBody AppUser appUser) {
        System.out.println("Received AppUser: " + appUser); // Debugging line
        appUserService.addUser(appUser);
        return "User is Registered";
    }

    @GetMapping("/registerUser")
    public String registerAppUser(){
        return "User registered successfully";
    }


    @GetMapping(value = "/admin")
    public String admin() {
        return "<h3> WELCOME Admin :) <h3/>";
    }

    @GetMapping(value = "/user")
    public String user() {
        return "<h3> Hello User :) <h3/>";
    }

    @GetMapping(value = "/welcome")
    public String welcome() {
        return "<h3> WELCOME  :) <h3/>";
    }



}
