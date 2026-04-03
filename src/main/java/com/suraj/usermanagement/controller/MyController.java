package com.suraj.usermanagement.controller;
import com.suraj.usermanagement.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/test")
    public String test() {
        return "Working";
    }
    
    @GetMapping("/user")
    public User getUser() {
    	
    	User user = new User();
    	
    	user.setId(1);
    	user.setName("Suraj");
    	user.setEmail("suraj@gmail.com");
    	
    	return user;
    	
    }
}



