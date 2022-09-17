package com.subbu.subbupamapna.demo.jpaexamples.a_simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path = "/user")
public class UserController {
	
	    @Autowired
	    private MyUserRepository myUserRepository;

	    @PostMapping(path = "/add")
	    public @ResponseBody String addNewUser(@RequestParam String email) {

	        UserEntity user = new UserEntity();
	        user.setEmail(email);
	        myUserRepository.save(user);
	        return "User Created";
	    }

	    @GetMapping(path = "/all")
	    public @ResponseBody Iterable < UserEntity > getAllUsers() {
	        return myUserRepository.findAll();
	    }

}
