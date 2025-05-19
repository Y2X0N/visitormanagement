package com.user.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetUserController {

    @GetMapping("/")
    public String index() {
        System.out.println("home");
        return "index"; // templates/index.html
    }
}
