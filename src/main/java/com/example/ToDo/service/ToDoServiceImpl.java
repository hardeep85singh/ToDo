package com.example.ToDo.service;

import com.example.ToDo.model.ToDo;
import com.example.ToDo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("toDoService")
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public void createToDo(ToDo toDo, long userId) {
        toDoRepository.save(new ToDo(toDo.getToDo(), userId));
    }

    @Override
    @Query("SELECT toDo from todo_list where toDo.userId = 1")
    public List<ToDo> getToDosByUser(long userId) {

        return (List<ToDo>) toDoRepository.findAll();
    }

    @Override
    public List<ToDo> getAllToDos() {
        return (List<ToDo>)toDoRepository.findAll();
    }


}