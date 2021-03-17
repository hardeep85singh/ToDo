package com.example.ToDo.model;

import javax.persistence.*;

@Entity
@Table(name = "todo_list")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "todoid")
    private long id;

    @Column(name = "todo")
    private String toDo;

    @Column(name = "Done")
    private boolean done;

    @Column(name = "userid")
    private long userId;

    public ToDo() {
    }

    public ToDo(String toDo) {
        this.toDo = toDo;
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
