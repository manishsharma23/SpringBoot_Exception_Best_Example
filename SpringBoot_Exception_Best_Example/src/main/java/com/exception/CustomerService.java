package com.exception;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
 
  HashMap<String, Customer> custStorage = new HashMap<String, Customer>();
 
  @PostConstruct
  void init() {
    Customer Manish = new Customer("Manish","Sharma", 20);
    Customer sharma = new Customer("Lisha","Sharma", 30);
    custStorage.put("Manish", Manish);
    custStorage.put("Lisha", sharma);
  }
 
  public Customer findCustomerByName(String name) {
    return custStorage.get(name);
  }

  public Customer findCustomerByAge(int age) {
    return custStorage.get(age);
  }
}