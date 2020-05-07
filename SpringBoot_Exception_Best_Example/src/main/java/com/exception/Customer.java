package com.exception;
public class Customer {
 
  private String name;
  private int age;

  private String lname;
  
  public Customer(String name, String lname,int age){
    this.setName(name);
    this.setAge(age);
    this.setLname(lname);
  }
 
  // name
  public String getName() {
    return name;
  }
 
  public void setName(String name) {
    this.name = name;
  }
 
  // age
  public int getAge() {
    return age;
  }
 
  public void setAge(int age) {
    this.age = age;
  }

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}
}