package com.example.backend.service;

import com.example.backend.model.TodoModel;
import com.example.backend.repo.TodoRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void getAllTodos_ReturnsAllTodos() {
        //Given
        TodoModel todo1 = new TodoModel();
        TodoModel todo2 = new TodoModel();
        List<TodoModel> todoList = new ArrayList<>(List.of(todo1, todo2));
        when(repo.getAllTodos()).thenReturn(todoList);

        //When
        List<TodoModel> actual = service.getAllTodos();

        //Then
        assertEquals(List.of(todo1, todo2), actual);
    }

    @Test
    void addNewTodo() {
        //Given
        TodoModel todo1 = new TodoModel("1", "OPEN", "test");


        when(repo.postNewTodo(todo1)).thenReturn(todo1);

        //When
        TodoModel actual = service.addTodo(todo1);

        //Then
        assertEquals(todo1, actual);
    }

//    @Test
//    void getTodoById() {
//        //Given
//        TodoModel todo1 = new TodoModel("1", "OPEN", "test1");
//        TodoModel todo2 = new TodoModel("2", "OPEN", "test2");
//        List<TodoModel> todoList = new ArrayList<>(List.of(todo1, todo2));
//        when(repo.getAllTodos()).thenReturn(todoList);
//
//        //When
//        TodoModel actual = service.getTodoById("2");
//
//        //Then
//        assertEquals(todo2, actual);
//    }
}