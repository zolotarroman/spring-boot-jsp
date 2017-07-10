package com.roman.controllers;

import java.util.Map;

import com.roman.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Autowired
	User user;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		user.setName("Roman");
		model.put("message", "Hello " + user.getName());
		return "welcome";
	}

}