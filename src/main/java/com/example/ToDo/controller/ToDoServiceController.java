package com.example.ToDo.controller;

import com.example.ToDo.model.ToDo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ToDoServiceController {
    private Map<Long, ToDo> toDoRepo = new HashMap<>(); // Map into Map required


    @RequestMapping(value = "/{userId}/todo", method = RequestMethod.POST)
    public ResponseEntity<Object> createToDo(@PathVariable("userId") String userId, @RequestBody ToDo todo){

        todo.setId(todo.hashCode());
        toDoRepo.put(todo.getId(), todo);
        return new ResponseEntity<>("ToDo is created", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{userId}/todo")
    public ResponseEntity<Object> getToDoList(@PathVariable("userId") String userId){ // check required for userid
        return new ResponseEntity<>(toDoRepo.values(), HttpStatus.OK);
    }
}



























//
//    UserServiceController userServiceController;
// userServiceController = new UserServiceController(toDoRepo, todo.getToDo());