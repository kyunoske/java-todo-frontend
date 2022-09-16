package com.example.backend.service;

import com.example.backend.model.TodoModel;
import com.example.backend.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepo repo;

    @Autowired
    public TodoService(TodoRepo repo) {
        this.repo = repo;
    }

    public List<TodoModel> getAllTodos() {
        return repo.getAllTodos();
    }
}
