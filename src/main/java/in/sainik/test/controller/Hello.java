package in.sainik.test.controller;

import in.sainik.test.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }
    @RequestMapping("/user")
    public User getUser(){
        User user = new User();
        user.setId("1");
        user.setName("Nikhil");
        user.setEmailId("sainikair@gmail.com");

        return user;
    }

}
