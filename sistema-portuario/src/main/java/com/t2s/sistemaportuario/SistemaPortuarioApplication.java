package com.t2s.sistemaportuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SistemaPortuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaPortuarioApplication.class, args);
	}
	
	@GetMapping("/")
	  public String hello() {
	    return "Hello World!!!";
	  }

}