package com.example.lab1_gtics_20201497.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/principal", method = RequestMethod.GET)
public class HomeController {
    @GetMapping(value = "")
    public String indexView() {
        return "index";
    }
}
