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

    @RequestMapping(value="/addToDo", method = RequestMethod.POST)
    public ModelAndView addToDo(@RequestBody ToDo toDo){
        toDoService.createToDo(toDo);
        ModelAndView mv = new ModelAndView("addToDo");
        mv.addObject(toDo);
        return mv;
    }

    @RequestMapping(value = "/userToDo")
    public ModelAndView getUserToDoPage(@RequestParam long user_id){

        ModelAndView mv = new ModelAndView("addToDo");
        mv.addObject(toDoService.getToDosByUser(user_id+1));
        return mv;
    }

    @RequestMapping(value = "/userToDos")
    public List<ToDo> getUserToDos(){
        System.out.println("added to list");
        return toDoService.getAllToDos();
    }

}
