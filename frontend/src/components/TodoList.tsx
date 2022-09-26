import React from 'react';
import {TodoModel} from "../models/TodoModel";
import TodoItem from "./TodoItem";

type TodoListProps = {
    todos: TodoModel[]
    deleteTodo: (id: string) => void;
}

function TodoList(props: TodoListProps) {

    return (
        <div>
            {props.todos.map((todo, index) =>
                 <TodoItem
                     key={index}
                    todo={todo}
                    deleteTodo={props.deleteTodo}
                />
            )}
        </div>
    );
}

export default TodoList;