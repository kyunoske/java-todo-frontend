package com.example.backend.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TodoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @DirtiesContext
    @Test
    void getAllTodos() throws Exception {
        //Given
        String books = """
                [
                    {
                        "id": "1",
                        "status": "OPEN",
                        "description": "Wash the car"
                    },
                    {
                        "id": "2",
                        "status": "OPEN",
                        "description": "Sing a song"
                    },
                    {
                        "id": "3",
                        "status": "DONE",
                        "description": "Write a poem"
                    }
                ]
                """;

        //when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/api/todo"))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        [
                            {
                                "id": "1",
                                "status": "OPEN",
                                "description": "Wash the car"
                            },
                            {
                                "id": "2",
                                "status": "OPEN",
                                "description": "Sing a song"
                            },
                            {
                                "id": "3",
                                "status": "DONE",
                                "description": "Write a poem"
                            }
                        ]
                        """));
    }
}