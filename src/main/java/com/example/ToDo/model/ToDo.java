package com.example.ToDo.model;

import javax.persistence.*;

@Entity
@Table(name = "ToDo_list")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="ToDo")
    private String toDo;

    @Column(name="Done")
    private boolean done;

    public ToDo(){};

    public ToDo(String toDo){
        this.toDo = toDo;
        done = false;
    }

    public long getId(){
        return id;
    }

    public String getToDo(){
        return toDo;
    }

    public boolean isDone(){
        return done;
    }

    public void setId(long id){
        this.id = id;
    }

    @Override
    public int hashCode(){
        return toDo.hashCode();
    }

}
