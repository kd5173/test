package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	   @GetMapping("/echo")
	    
	    public String echo(String name) {
	        // System.out.println("echo get...");
	        String echo = "hi," + name;
	        System.out.println(echo);
	        String web="hello,"+name;
	        System.out.println(web);
	        return echo;
	    }
}