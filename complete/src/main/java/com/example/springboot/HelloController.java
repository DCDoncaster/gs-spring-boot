package com.example.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

	@GetMapping("")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("hello")
	public String hello() {
		return "Hello Apprentices!";
	}

	@GetMapping("2add2")
	public int add2() {
		
		return 2 + 2;
	}
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String data(@RequestBody String data) {
		return data;
	}

	@RequestMapping(value="squarenumber", method = RequestMethod.GET)
	public @ResponseBody int getInt(@RequestParam("input") int inputValue){
				return inputValue * inputValue;
	}

@GetMapping("error")
public String errorString() {
	return "Error";
}
}
