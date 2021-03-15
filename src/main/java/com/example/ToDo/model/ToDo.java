package com.example.ToDo.model;


public class ToDo {
    private long id;
    private String toDo;
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
