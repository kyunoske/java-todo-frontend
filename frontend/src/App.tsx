import React, {useEffect, useState} from 'react';
import {BrowserRouter as Router, Routes, Route, BrowserRouter} from "react-router-dom";
import './App.css';
import Homepage from "./pages/Homepage";
import {TodoModel} from "./models/TodoModel";
import {deleteTodo, getAllTodos, postTodo, putTodo} from "./services/todo-api-service";


// const todos: TodoModel[] = [
//     {description: "Have patience when fishing", status: "Open"},
//     {description: "Learn to can dance", status: "Open"},
//     {description: "Learn the guitar", status: "Open"},
// ]

function App() {

    const [todos, setTodos] = useState([]);

    useEffect(() => {
        getAllTodos()
            .then(todos => setTodos(todos))
            .catch(error => console.error(error))
    }, [])

    const createNewTodo = (description: string) =>
        postTodo(description)
            .then(() => getAllTodos())
            .then(todos => setTodos(todos))
            .catch(error => console.error(error));

    const removeTodo = (id: string) => {
        deleteTodo(id)
            .then(() => getAllTodos())
            .then(todos => setTodos(todos))
            .catch(error => console.error(error))
    }


    const updateTodo = (todo: TodoModel) =>
        putTodo(todo)
            .then(() => getAllTodos())
            .then(todos => setTodos(todos))
            .catch(error => console.error(error))

    return (
        <Router>
            <Routes>
            <Route path="/" element={<Homepage
                todos={todos} deleteTodo={removeTodo}
                createNewTodo={createNewTodo}
            />} />
            </Routes>
        </Router>
    );
}

export default App;
