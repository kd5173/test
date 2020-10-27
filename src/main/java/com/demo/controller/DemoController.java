package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	 private static String address;
	 
	 private static String email;
	 
	 private int age = 20;
	
     @GetMapping("/echo")
     public String echo(String name) {
        // System.out.println("echo get...");
    	
    	address=name + " have address ";
    	email=name + " have email ";
    	age =21;
    	
    	name = name+" jerry"; 
        String echo = "hi," + name;
        System.out.println(echo);
        String web="hello,"+name;
        System.out.println(web);
        return echo;
     }
}
