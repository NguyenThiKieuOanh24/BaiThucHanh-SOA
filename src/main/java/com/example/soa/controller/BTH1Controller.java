package com.example.soa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bai1")
public class BTH1Controller {
	 @GetMapping("/hello")
	    public String sayHello() {
	        return "Hello Word!";
	    }
}
