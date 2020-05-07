package com.exception;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
 
  HashMap<String, Customer> custStorage = new HashMap<String, Customer>();
 
  @PostConstruct
  void init() {
    Customer jack = new Customer("Jack", 20);
    Customer peter = new Customer("Peter", 30);
    custStorage.put("Jack", jack);
    custStorage.put("Peter", peter);
    custStorage.put("20", new Customer("Jack", 20));
    custStorage.put("30", peter);
  }
 
  public Customer findCustomerByName(String name) {
    return custStorage.get(name);
  }

  public Customer findCustomerByAge(int age) {
    return custStorage.get(age);
  }
}