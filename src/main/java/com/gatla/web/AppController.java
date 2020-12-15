package com.gatla.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/hi")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
