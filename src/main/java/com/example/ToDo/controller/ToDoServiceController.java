package com.example.ToDo.controller;

import com.example.ToDo.model.ToDo;
import com.example.ToDo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class ToDoServiceController {

    @Autowired
    private ToDoService toDoService;

    @RequestMapping(value = "/addToDo", method = RequestMethod.POST)
    public String addToDo(@RequestBody ToDo toDo){
        return "addToDo";

//        toDoService.createToDo(toDo);
//        ModelAndView mv = new ModelAndView("addToDo");
//        mv.addObject(toDo);
//        return mv;
    }

    @RequestMapping(value = "/addToDo")
    public ModelAndView getToDo(){
        ModelAndView mv = new ModelAndView("addToDo");
        return mv;
    }

}

















//    private Map<Long, List<ToDo>> toDoRepo = new HashMap<>(); // Map into Map required
//
//
//    @RequestMapping(value = "/{userId}/todo", method = RequestMethod.POST)
//    public ResponseEntity<Object> createToDo(@PathVariable("userId") String userId, @RequestBody ToDo todo){
//
//        todo.setId(todo.hashCode());
////        toDoRepo.put(todo.getId(), todo);
//        return new ResponseEntity<>("ToDo is created", HttpStatus.CREATED);
//    }
//
//    @RequestMapping(value = "/{userId}/todo")
//    public ResponseEntity<Object> getToDoList(@PathVariable("userId") String userId){ // check required for userid
//        return new ResponseEntity<>(toDoRepo.values(), HttpStatus.OK);
//    }


























//
//    UserServiceController userServiceController;
// userServiceController = new UserServiceController(toDoRepo, todo.getToDo());