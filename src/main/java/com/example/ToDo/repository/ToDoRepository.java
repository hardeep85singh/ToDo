package com.example.ToDo.repository;

import com.example.ToDo.model.ToDo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    @Query("Select t from ToDo t where t.userId = :userId")
    public List<ToDo> findByUserid(@Param("userId") Long userId);


}
