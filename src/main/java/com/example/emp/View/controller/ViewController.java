package com.example.emp.View.controller;

import com.example.emp.View.model.Project;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ViewController {
    @GetMapping("/")
    public String testController(Model model){
        model.addAttribute("project", new Project());
        return "test";
    }

    @PostMapping("/input")
    @ResponseBody
    public Project inputThing(@RequestParam String group){
        System.out.println("==============================================");
        System.out.println(group);
        System.out.println("==============================================");

        Project p = new Project();
        return p;
    }
}