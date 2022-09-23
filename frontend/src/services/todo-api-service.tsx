import axios from "axios";

export const getAllTodos = () =>
    axios.get('api/todo').then(response => response.data);

// @ts-ignore
export const postTodo = description =>
    axios.post('api/todo', { description: description, status: 'OPEN' })