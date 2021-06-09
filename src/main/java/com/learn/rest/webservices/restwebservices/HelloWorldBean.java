package com.learn.rest.webservices.restwebservices;

public class HelloWorldBean {
	
	private String message;

	

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	 HelloWorldBean(String msg)
	{
		this.message = msg;
	}

}
