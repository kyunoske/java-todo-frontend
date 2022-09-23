package com.example.backend.service;

import com.example.backend.model.TodoModel;
import com.example.backend.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

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

    public TodoModel addTodo(TodoModel todo) {
        List<TodoModel> presentTodos = repo.getAllTodos();
        int newId1 = presentTodos.size() + 1;
        String newId = String.valueOf(newId1);
        todo.setId(newId);
        return repo.postNewTodo(todo);
    }

    public TodoModel getTodoById(String id) {
        TodoModel foundTodo = repo.getTodoById(id);
        if(foundTodo == null) {
            throw new NoSuchElementException("No Todo was found with id " + id);
        }
        return repo.getTodoById(id);
    }

    public TodoModel editTodo(String id, TodoModel todo) {
        Map<String, TodoModel> presentTodos = repo.getTodos();
        TodoModel updateTodo = presentTodos.get(id);
        updateTodo.setStatus(todo.getStatus());
        updateTodo.setDescription(todo.getDescription());
        return repo.editTodo(updateTodo);
    }

    public TodoModel deleteTodo(String id) {
        return repo.deleteTodo(id);
    }
    //TEST
}
