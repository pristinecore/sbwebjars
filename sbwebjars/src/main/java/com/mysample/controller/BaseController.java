package com.mysample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysample.repository.UserRepository;

@Controller
public class BaseController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/user-list.html", method = RequestMethod.GET) 
	public String userList(Model model) {
		
		model.addAttribute("userlist", userRepository.findAllByOrderByUserIdAsc());
		
		return "user-list";
	}
}
