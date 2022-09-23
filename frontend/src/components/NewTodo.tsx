import React, { useState} from 'react';
import {TodoModel} from "../models/TodoModel";

type NewTodoProps = {
    onAdd: any;
}

function NewTodo(props: NewTodoProps) {
    const [description, setDescription] = useState('');

    // @ts-ignore
    const handleSubmit = (event) => {
        event.preventDefault()
        if (description) {
            props.onAdd(description).then(() => setDescription(""));
        }
    }

    return (
        <div>
            <div className="input-container" >
                <div className="input-group input-group-sm mb-3">
                    <input style={{width: "80%"}} type="text" placeholder="enter a name"
                           onChange={(event ) => setDescription(event.target.value)} />
                    <button onClick={handleSubmit} className="input-group-text" id="inputGroup-sizing-sm">Add</button>
                <p>{description}</p>
                </div>
            </div>
        </div>
    );
}

export default NewTodo;