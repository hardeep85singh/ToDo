package com.example.ToDo.controller;

import com.example.ToDo.model.ToDo;
import com.example.ToDo.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserServiceController {

    private Map<Long, User> userRepo = new HashMap<>();

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        user.setUserId(user.hashCode());
        userRepo.put(user.getUserId(), user);
        return new ResponseEntity<>("User is created", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/users")
    public ResponseEntity<Object> getUsers() {
        return new ResponseEntity<>(userRepo.values(), HttpStatus.OK);
    }
}




















//
//    User user;
//
//    public UserServiceController(Map<Long, ToDo> userToDo, String todo){
//        user = new User();
//        long userId = user.getUserId();
//        userToDo.put(userId, new ToDo(todo));
//    }




//    @PostMapping("/users")
//    public ResponseEntity<Object> createUser(@RequestBody User user){
//        user.setId(user.hashCode());
//        userRepo.put(user.getId(), user);
//        return new ResponseEntity<>("User is created", HttpStatus.CREATED);
//    }
//
//    @GetMapping("/users")
//    public ResponseEntity<Object> getUsers(){
//        return new ResponseEntity<>(userRepo.values(), HttpStatus.OK);
//    }
//}
