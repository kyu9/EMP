package com.example.emp.View;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

    @GetMapping("/test")
    public String testController(){
        return "test";
    }
}
