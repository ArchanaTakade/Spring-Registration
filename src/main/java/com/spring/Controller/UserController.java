package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Model.User;
import com.spring.service.UserService;

@RestController
public class UserController {
    @Autowired
	UserService us;
    
	
    @PostMapping("/register")
	public String register(@RequestBody User user ) {
    return us.register(user);
    }
	
    @GetMapping("/user")
    public UserService getregister(@RequestParam ("fname") long fname ) {
        return getregister(fname);
}
//    @PutMapping("/")
    
}
