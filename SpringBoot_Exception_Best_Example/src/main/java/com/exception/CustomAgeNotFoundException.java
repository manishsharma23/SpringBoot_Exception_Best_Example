package com.exception;

public class CustomAgeNotFoundException extends RuntimeException{
	 
	  public CustomAgeNotFoundException(String msg) {
	    super(msg);
	  }
	}