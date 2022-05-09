package com.example.emp.View.controller;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

import com.example.emp.Dependency.GradleModules;
import com.example.emp.View.model.MetaData;
import com.example.emp.View.model.ProjectDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        GradleModules d = new GradleModules();
        d.setId("ID1");d.setName("NAME1");d.setDescription("DESC1");d.setGroupName("GROUP1");d.setScript("SCRIPT1");

        GradleModules d2 = new GradleModules();
        d2.setId("ID2");d2.setName("NAME2");d2.setDescription("DESC2");d2.setGroupName("GROUP2");d2.setScript("SCRIPT2");

        GradleModules d3 = new GradleModules();
        d3.setId("ID3");d3.setName("NAME3");d3.setDescription("DESC3");d3.setGroupName("GROUP3");d3.setScript("SCRIPT3");

        List<GradleModules> dependencies = new ArrayList<>();
        dependencies.add(d);dependencies.add(d2);dependencies.add(d3);

        model.addAttribute("project", new ProjectDto());
        model.addAttribute("data", new MetaData());
        model.addAttribute("dependencies", dependencies);
        return "test";
    }

    @PostMapping("/input")
    @ResponseBody
    public ProjectDto inputThing(
        @RequestBody String str
        ) throws IOException {
        System.out.println("received json String : "+str);

        ProjectDto dto = objectMapper.readValue(str, ProjectDto.class);
        System.out.println("transformed Object : " + dto.toString());

        //do Something

        return new ProjectDto();
    }
}