package com.example.ToDo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity //The @Entity annotation specifies that the class is an entity and is mapped to a database table
@Table(name="user_data") // The @Table annotation specifies the name of the database table to be used for mapping
public class User implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;

    @Id //The @Id annotation specifies the primary key of an entity
    @GeneratedValue(strategy = GenerationType.AUTO) // @GeneratedValue provides for the specification of generation strategies for the values of primary keys.
    @Column(name="id")
    private long userId;

    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;

    public User(){
    }

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getUserId(){
        return userId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setUserId(long userId){
        this.userId = userId;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.userId);
        hash = 79 * hash + Objects.hashCode(this.firstName);
        hash = 79 * hash + Objects.hashCode(this.lastName);
        return hash;
    }

}
