import React from 'react';
import "./TodoItem.css";
import {TodoModel} from "../models/TodoModel";

function TodoItem(props: TodoModel) {
    return (
        <div className="todo-container">
            <h3>{props.description}</h3>
            <div className="todo-options">
                <p>details</p>
                <p>onAdvance</p>
                <p>onDelete</p>
            </div>
        </div>
    );
}

export default TodoItem;