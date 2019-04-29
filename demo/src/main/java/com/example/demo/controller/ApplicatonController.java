package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "demo")
public class ApplicatonController {

	@RequestMapping(value = "hello")
	public String helloWorld() {
		return "Hello World!";
	}
}
