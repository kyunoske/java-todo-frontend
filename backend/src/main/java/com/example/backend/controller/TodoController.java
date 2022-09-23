package com.example.backend.controller;

import com.example.backend.model.TodoModel;
import com.example.backend.repo.TodoRepo;
import com.example.backend.service.TodoService;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping
    public List<TodoModel> getAllTodos() {
        return service.getAllTodos();
    }

    @GetMapping("{id}")
    public TodoModel getTodoById(@PathVariable String id) {
        return service.getTodoById(id);
    }

    @PostMapping
    public TodoModel addTodo(@RequestBody TodoModel todo) {
        return service.addTodo(todo);
    }

    @PutMapping("{id}")
    public TodoModel editTodo(@PathVariable String id, @RequestBody TodoModel todoDetails) {
        return service.editTodo(todoDetails);
    }

    @DeleteMapping("{id}")
    public TodoModel deleteTodo(@PathVariable String id) {
        return service.deleteTodo(id);
    }
}
