package com.example.springboot;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.*;

@RestController
public class HelloController {

	@GetMapping("")
	public String hello() {
		return "Hello Team!";
	}

	@GetMapping("2add2")
	public int add2() {

		return 2 + 2;
	}

	@GetMapping("add")
	public String data(@RequestBody String data) {
		return data;
	}

	@GetMapping("squarenumber")
	public @ResponseBody double getDouble(@RequestParam("input") double inputValue) {
		return inputValue * inputValue;
	}

	@GetMapping("gettest")
	//send reponsebody with requestbody
	public @ResponseBody String getTest(@RequestBody String data) {
	Gson gson = new Gson();
	Map map = gson.fromJson(data, Map.class);
	map.get("a").getClass();
	System.out.println(map);
	return map.get("a").toString();
	}
}
