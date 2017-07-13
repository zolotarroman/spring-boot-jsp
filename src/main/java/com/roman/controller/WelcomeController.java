package com.roman.controller;

import java.util.Map;

import com.roman.model.User;
import com.roman.repository.UserRepository;
import com.roman.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Tells to Spring this is controller
@Controller
public class WelcomeController {
	//Tells to Spring to make an instance of object "UserRepository"
	@Autowired
	private UserRepository userRepository;
	//Tells to Spring to make an instance of object "UserService"
	//We don`t need it by now
	@Autowired
	private UserService userService;
	//Tells to Spring to make some actions on this URL(value = "/")
	//using method GET
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Map<String, Object> model) {				//Tells to Spring to create some
		User user = userRepository.findByName("vasya");				//object called "model" and bind it to object on
		model.put("message", "Hello " + user.getName());			//.jsp and set some values to this object
		return "welcome";
		//Tells to Spring which .jsp file to use (welcome.jsp)
	}
}