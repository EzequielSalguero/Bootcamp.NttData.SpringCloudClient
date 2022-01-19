package com.nttdata.bootcamp.gateway.micro2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping(path="/micro2")
	public String helloWorld() {
		return "Hola estoy en el micro2";
	}
}
