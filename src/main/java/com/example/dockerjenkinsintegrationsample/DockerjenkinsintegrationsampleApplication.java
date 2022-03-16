package com.example.dockerjenkinsintegrationsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerjenkinsintegrationsampleApplication {

	@GetMapping("/message")
	public String hello(){
		return  "Hello Ram Kumar Patwa";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerjenkinsintegrationsampleApplication.class, args);
	}

}
