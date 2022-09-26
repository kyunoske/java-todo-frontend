import React from 'react';
import "./TodoItem.css";
import {TodoModel} from "../models/TodoModel";

type TodoItemProps = {
    todo: TodoModel;
    deleteTodo: (id: string) => void;
}

function TodoItem(props: TodoItemProps) {

    return (

        <div className="todo-container">
            <h3>{props.todo.description}</h3>
            <div className="todo-options">
            </div>
            <button onClick={() => props.deleteTodo(props.todo.id)}>delete</button>
        </div>
    );
}

export default TodoItem;