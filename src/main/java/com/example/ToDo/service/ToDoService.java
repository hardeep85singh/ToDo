package com.example.ToDo.service;

import com.example.ToDo.model.ToDo;

import java.util.List;

public interface ToDoService {

    public void createToDo(ToDo toDo);

    public List<ToDo> getToDosByUser(long userId);

}
