package com.zhk.autaxapi.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String index() throws Exception {
		return "Hello World";
		
	}
}
