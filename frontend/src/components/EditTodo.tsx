import React, {useEffect, useState} from 'react';
import {TodoModel} from "../models/TodoModel";
import {useParams} from "react-router-dom";
import {getTodoById} from "../services/todo-api-service";

// type EditTodoProps = {
//     show: boolean;
//     close: any;
//     onSave: any;
//     todo: TodoModel;
// }

function EditTodo() {

    // const { id } = useParams();
    // const [todoEdit, setTodoEdit] = useState();
    // const [description, setDescription] = useState("");
    //
    // useEffect(() => {
    //     getTodoById(id).then(setTodoEdit).catch(console.error)
    // }, [id]);


    return (
        <div>
            {/*<div className="modal" tabIndex={-1}>*/}
            {/*    <div className="modal-dialog">*/}
            {/*        <div className="modal-content">*/}
            {/*            <div className="modal-header">*/}
            {/*                <button type="button" className="btn-close" data-bs-dismiss="modal"*/}
            {/*                        aria-label="Close"></button>*/}
            {/*            </div>*/}
            {/*            <div className="modal-body">*/}

            {/*                <div className="input-container" >*/}
            {/*                    <div className="input-group input-group-sm mb-3">*/}
            {/*                        <input style={{width: "80%"}} type="text" placeholder="What do you want to do?"*/}
            {/*                               onChange={(event ) => setDescription(event.target.value)} />*/}
            {/*                <p>There is nothing to edit.</p>*/}
            {/*            </div>*/}
            {/*            <div className="modal-footer">*/}
            {/*                <button type="button" className="btn btn-secondary" data-bs-dismiss="modal">Close</button>*/}
            {/*                <button type="button" className="btn btn-primary">Save</button>*/}
            {/*            </div>*/}
            {/*        </div>*/}
            {/*    </div>*/}
            {/*</div>*/}
        </div>
    );
}

export default EditTodo;