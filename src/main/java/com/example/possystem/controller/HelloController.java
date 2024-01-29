package com.example.possystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "<h1>This is the Hello Controller</h1>";
	}
}
