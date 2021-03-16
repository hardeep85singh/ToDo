package com.example.ToDo.controller;
import com.example.ToDo.message.Response;
import com.example.ToDo.service.UserService;
import com.example.ToDo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserServiceController {

    @Autowired //UserService is injected
    private UserService userService;


    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ModelAndView addUser(@RequestBody User user){
        userService.createUser(user);
        ModelAndView mv = new ModelAndView("home");
        mv.addObject(user);
        return mv;
    }

    @RequestMapping(value = "/listUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers(); //userService getAllUsers method
    }

}




//    @RequestMapping(value = "/listUsers")
//    public ModelAndView getAll(){
//        ModelAndView mv = new ModelAndView("listUsers");
//        List<User> users = userService.getAllUsers();
//        for(int i = 0; i < users.size(); i++){
//            mv.addObject(i);
//        }
//        return mv;
//    }
//    @RequestMapping(value = "/users", method = RequestMethod.POST)
//    public void createUser(@RequestBody User user) {
//        userService.createUser(user); //userService createUser method
//    }

//    @RequestMapping(value = "/listUsers")
//    public Response listAllUsers() {
//        Iterable users = userService.getAllUsers();
//        return new Response("Done", users);
//    }







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
