package com.example.ToDo.repository;

import com.example.ToDo.model.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {


}
