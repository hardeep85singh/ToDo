package com.example.ToDo.model;

public class User {
    private long userId;
    private String userFirstName;
    private String userLastName;

    public User(){}

    public User(String userFirstName, String userLastName){
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }

    public long getUserId(){
        return userId;
    }

    public String getUserFirstName(){
        return userFirstName;
    }

    public String getUserLastName(){
        return userLastName;
    }

    public void setUserId(long userId){
        this.userId = userId;
    }

    @Override
    public int hashCode(){
        return getUserFirstName().hashCode() + getUserLastName().hashCode();
    }

}
