package com.plwb.WeatherWA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class WeatherWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherWebAppApplication.class, args);
	}
	@GetMapping("/Hello")
	private String sayHello(@RequestParam(value="myName", defaultValue="World")String name) {
		return String.format("Hello %s", name);
	}

}
