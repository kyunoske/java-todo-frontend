package com.example.backend.service;

import com.example.backend.model.TodoList;
import com.example.backend.model.TodoModel;
import com.example.backend.repo.TodoRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
class TodoServiceTest {

    @Autowired
    private MockMvc mockMvc;

    TodoRepo repo = mock(TodoRepo.class);
    TodoService service = new TodoService(repo);
    TodoList list = new TodoList();

//    @Test
//    void getAllTodos_ReturnsAllTodos() {
//        //Given
//        Map<String, TodoModel> toDos = new HashMap<>(
//                Map.of(
//                        "1", new TodoModel("1", "OPEN","Wash the car"),
//                        "2", new TodoModel("2", "OPEN","Sing a song"),
//                        "3", new TodoModel("3", "DONE","Write a poem"))
//        );
//
//        when(repo.getAllTodos()).thenReturn();
//
//        //When
//        List<TodoModel> actual = service.getAllTodos();
//
//        //Then
//        assertEquals(toDos, actual);
//    }
}