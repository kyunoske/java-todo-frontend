import React from 'react';
import TodoList from "../components/TodoList";
import {TodoModel} from "../models/TodoModel";
import NewTodo from "../components/NewTodo";
import {deleteTodo} from "../services/todo-api-service";

type HomepageProps = {
    todos: TodoModel[];
    createNewTodo: any;
    deleteTodo: (id: string) => void;
}
function Homepage(props: HomepageProps) {

    return (

        <div>
            <h1>Your todo list</h1>
            <TodoList todos={props.todos} deleteTodo={deleteTodo}/>

            <NewTodo onAdd={props.createNewTodo} />

        </div>
    );
}

export default Homepage;