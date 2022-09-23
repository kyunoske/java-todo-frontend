import React from 'react';
import {TodoModel} from "../models/TodoModel";
import TodoItem from "./TodoItem";

type TodoListProps = {
    todos: TodoModel[]
}

function TodoList(props: TodoListProps) {
    return (
        <div>
            {props.todos.map((todo, index) => {
                return <TodoItem
                    key={index}
                    description={todo.description}
                    status={todo.status}
                />
            })}
        </div>
    );
}

export default TodoList;