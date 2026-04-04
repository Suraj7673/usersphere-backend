package com.suraj.usermanagement.controller;
import com.suraj.usermanagement.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;


@RestController
public class MyController {
	
	private List<User> userList = new ArrayList<>(); 

    @GetMapping("/test")
    public String test() {
        return "Working";
    }
    
    @GetMapping("/users")
    public List<User> getAllUsers() {
  
    	return userList;
    	
    }
    
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
    	userList.add(user);
    	return user;
    	
    }
}


