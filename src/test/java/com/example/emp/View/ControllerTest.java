package com.example.emp.View;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcResultMatchersDsl;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

//class ControllerTest {
//    @Autowired
//    MockMvc mockMvc;
//
//    @Test
//    @DisplayName("대충 컨트롤러가 작동하는가?")
//    void viewControllerTest() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/test"))
//                .andExpect(MockMvcResultMatchers.status().is(200));
//    }
//}