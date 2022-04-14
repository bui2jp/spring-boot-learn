package com.example.demo.webflux;

import com.example.demo.webflux.hello.GreetingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		//webclientを利用したHTTPのコール
		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		System.out.println(">> message4fds = " + greetingClient.getMessage().block());
	}

//	@GetMapping("/hello")
//	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return String.format("Hello %s!", name);
//	}
}
