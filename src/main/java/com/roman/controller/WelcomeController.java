package com.roman.controller;

import java.util.Map;

import com.roman.model.User;
import com.roman.repository.UserRepository;
import com.roman.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Map<String, Object> model) {
		User user = userRepository.findByName("vasya");
		model.put("message", "Hello " + user.getName());
		return "welcome";
	}
}