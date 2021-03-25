package com.example.ToDo.service;

import com.example.ToDo.model.ToDo;
import com.example.ToDo.model.User;

import java.util.List;

public interface ToDoService {

    public void createToDo(ToDo toDo, long userId);

    public List<ToDo> getToDosByUser(long userId);

    public boolean isDone(long userId);

    public List<ToDo> deleteToDo(ToDo toDo, long userId);

}
