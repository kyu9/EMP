package com.example.emp.View.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewController {
    @GetMapping("/")
    public String testController(Model model){
        return "test";
    }

    @PostMapping("/view/input")
    public ResponseEntity inputThing(){

        return new ResponseEntity(HttpStatus.OK);
    }
}