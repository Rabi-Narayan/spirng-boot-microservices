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
		return "hello world";
	}
	
	@GetMapping(path = "/hello-world-bean/newBean/{name}")
	public HelloWorldBean getHelloWorldBean(@PathVariable String name)
	{
		System.out.println("hiiiiiiiiiiiiiiiii");
		return new HelloWorldBean("Hello World"+" " + name);
	}

}
