package com.example.ToDo.controller;

import com.example.ToDo.model.ToDo;
import com.example.ToDo.model.User;
import com.example.ToDo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class ToDoServiceController {

    @Autowired
    private ToDoService toDoService;

    @RequestMapping(value = "/userToDo/{userId}")
    public ModelAndView getUserToDoPage(@PathVariable long userId){
        ModelAndView mv = new ModelAndView("addToDo");
        mv.addObject(toDoService.getToDosByUser(userId));
        return mv;
    }

    @RequestMapping(value="/userToDo/{userId}", method = RequestMethod.POST)
    public void addToDo(@RequestBody ToDo toDo, @PathVariable long userId){
        toDoService.createToDo(toDo, userId);
    }

    @RequestMapping(value = "/userToDo")
    public List<ToDo> getUserToDos(){
        System.out.println("added to list");
        return toDoService.getAllToDos();
    }
}
