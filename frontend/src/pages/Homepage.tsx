import React from 'react';
import TodoList from "../components/TodoList";
import {TodoModel} from "../models/TodoModel";
import NewTodo from "../components/NewTodo";

type HomepageProps = {
    todos: TodoModel[];
    createNewTodo: any;
}
function Homepage(props: HomepageProps) {

    return (
        <div>
            <TodoList todos={props.todos} />

            <NewTodo onAdd={props.createNewTodo} />

        </div>
    );
}

export default Homepage;