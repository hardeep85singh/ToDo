package com.example.ToDo.controller;
import com.example.ToDo.service.UserService;
import com.example.ToDo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserServiceController {

    @Autowired //UserService is injected
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void createUser(@RequestBody User user) {
        userService.createUser(user); //userService createUser method
    }

//    @RequestMapping(value = "/users")
//    public List<User> getAllUsers() {
//        return userService.getAllUsers(); //userService getAllUsers method
//    }
}











//user.setUserId(user.hashCode());
//        userRepo.put(user.getUserId(), user);
//        return new ResponseEntity<>("User is created", HttpStatus.CREATED);








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
