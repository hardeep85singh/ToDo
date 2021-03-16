package com.example.ToDo.service;

import com.example.ToDo.model.ToDo;
import com.example.ToDo.repository.ToDoRepository;
import com.example.ToDo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("toDoService")
public class ToDoServiceImpl implements ToDoService{

    @Autowired
    private ToDoRepository toDoRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createToDo(ToDo toDo) {
        toDoRepository.save(toDo);
    }

    @Override
    public List<ToDo> getToDosByUser(long userId) {
        return null;
    }

//    @Override
//    public List<ToDo> getToDosByUser(long userId){
//        return userRepository.findById(userId).get().getToDo();

//        List<ToDo> toDoList = new LinkedList<>();
//        Iterable<ToDo> iterable = toDoRepository.findAll();
//        while(iterable.iterator().hasNext()){
//            toDoList.add(iterable.iterator().next());
//        }
//        return toDoList;
//    }
}
