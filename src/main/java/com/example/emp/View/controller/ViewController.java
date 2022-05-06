package com.example.emp.View.controller;

import com.example.emp.View.model.MetaData;
import com.example.emp.View.model.ProjectDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class ViewController {
    private final ObjectMapper objectMapper;

    @GetMapping("/")
    public String testController(Model model){
        model.addAttribute("project", new ProjectDto());
        model.addAttribute("data", new MetaData());
        return "test";
    }

    @PostMapping("/input")
    @ResponseBody
    public ProjectDto inputThing(
        @RequestBody JsonObject jsonpObject
        ){

        System.out.println("===================================================================");
        System.out.println(jsonpObject);
        System.out.println("===================================================================");

        return new ProjectDto();
    }
}