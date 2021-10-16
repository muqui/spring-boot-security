package com.boot.alberto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("visitor")
public class VisitorController {
	
	@GetMapping("index")
    public String index(){
        return "visitor/index";
    }
 
}
