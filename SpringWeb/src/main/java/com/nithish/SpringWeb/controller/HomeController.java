package com.nithish.SpringWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "I am in my Home ";
    }

    @RequestMapping("/about")
    public String about(){
        return "I am in About";
    }

}
