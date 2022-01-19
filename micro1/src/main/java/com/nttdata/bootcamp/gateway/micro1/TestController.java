package com.nttdata.bootcamp.gateway.micro1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping(path="/micro1")
	public String helloWorld() {
		return "Hola estoy en el micro1";
	}
}
