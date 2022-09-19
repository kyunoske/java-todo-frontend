package com.example.backend.repo;

import com.example.backend.model.TodoModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TodoRepo {

    private Map<String, TodoModel> todos = new HashMap<>(
            Map.of(
                    "1", new TodoModel("1", "OPEN","Wash the car"),
                    "2", new TodoModel("2", "OPEN","Sing a song"),
                    "3", new TodoModel("3", "DONE","Write a poem")));

    public List<TodoModel> getAllTodos() {
        return new ArrayList<TodoModel>(todos.values());
    }

    public TodoModel postNewTodo(TodoModel todo) {
        todos.put(todo.getId(), todo);
        return todo;
    }

    public TodoModel getTodoById(String id) {
        return todos.get(id);
    }

    public Map<String, TodoModel> getTodos() {
        return todos;
    }

    public TodoModel editTodo(TodoModel todo) {
        todos.get(todo.getId()).setStatus(todo.getStatus());
        todos.get(todo.getId()).setDescription(todo.getDescription());
        return todos.get(todo.getId());
    }

    public TodoModel deleteTodo(String id) {
        return todos.remove(id);
    }
}
