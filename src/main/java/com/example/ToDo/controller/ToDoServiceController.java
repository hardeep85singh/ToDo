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
    public ModelAndView getUserToDos(){
        ModelAndView mv = new ModelAndView("addToDo");
        return mv;
    }

    @RequestMapping(value="/userToDo/{userId}", method = RequestMethod.POST)
    public List<ToDo> addToDo(@RequestBody ToDo toDo, @PathVariable long userId){
        toDoService.createToDo(toDo, userId);
        return getUserToDoPage(userId);
    }

    @RequestMapping(value="/userToDo/{userId}", method = RequestMethod.PUT)
    public void toDoDone(@RequestBody ToDo toDo, @PathVariable long userId){
        toDoService.isDone(userId);
    }


    @RequestMapping(value="/userToDo/{userId}", method = RequestMethod.DELETE)
    public List<ToDo> deleteToDo(@RequestBody ToDo toDo, @PathVariable long userId){
        toDoService.deleteToDo(toDo, userId);
        return getUserToDoPage(userId);
    }

    public List<ToDo> getUserToDoPage(long userId){
        return toDoService.getToDosByUser(userId);
    }

}
