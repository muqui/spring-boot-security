package com.boot.alberto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("user")
public class UserController {

	
	@GetMapping("index")
    public String index(){
        return "user/index";
    }
}
