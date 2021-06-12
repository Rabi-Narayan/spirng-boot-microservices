package com.learn.rest.webservices.restwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld()
	{
		return "hello world Rabi";
	}
	
	@GetMapping(path = "/hello-world-bean/newBean/{name}")
	public HelloWorldBean getHelloWorldBean(@PathVariable String name)
	{
		return new HelloWorldBean("Hello World"+" " + name);
	}

}
