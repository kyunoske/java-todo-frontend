import React, {useEffect, useState} from 'react';
import {BrowserRouter as Router, Routes, Route, BrowserRouter} from "react-router-dom";
import './App.css';
import TodoItem from "./components/TodoItem";
import Homepage from "./pages/Homepage";
import {TodoModel} from "./models/TodoModel";
import {getAllTodos, postTodo} from "./services/todo-api-service";

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

    // @ts-ignore
    const createNewTodo = description =>
        postTodo(description)
            .then(() => getAllTodos())
            .then(todos => setTodos(todos))
            .catch(error => console.error(error));

    return (
        <Router>
            <Routes>
            <Route path="/" element={<Homepage todos={todos} createNewTodo={createNewTodo} />} />
            </Routes>
        </Router>
    );
}

export default App;
