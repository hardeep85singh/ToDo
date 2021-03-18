package com.example.ToDo.model;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Configuration
@Entity
@Table(name = "todo_list")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "todo")
    private String toDo;

    @Column(name = "done")
    private boolean done;

    @Column(name = "userid")
    private long userId;

    public ToDo() {
    }

    public ToDo(String toDo, long userId) {
        this.toDo = toDo;
        this.userId = userId;
        done = false;
    }

    public long getId() {
        return id;
    }

    public String getToDo() {
        return toDo;
    }

    public boolean isDone() {
        return done;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
