package com.javadev.springbootactuatordemo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {
	
	 @GetMapping("/example")
	    public String example() {
	        return "Hello User !! " + new Date();
	    }

}
