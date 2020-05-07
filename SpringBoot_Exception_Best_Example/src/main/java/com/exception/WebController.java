package com.exception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
@RestController
public class WebController {
  
  @Autowired
  CustomerService customerService;
  
  @RequestMapping(value = "/customername/{name}")
  public Customer findCustomerByName(@PathVariable("name") String name) {
 
    Customer cust = customerService.findCustomerByName(name);
 
    if (null == cust) {
      throw new CustomNotFoundException("Not found customer with name is " + name);
    }
 
    return cust;
  }
  
  @RequestMapping(value = "/customerage/{age}")
  public Customer findCustomerByName(@PathVariable("age") int age) {
 
    Customer cust = customerService.findCustomerByAge(age);
 
    if (null == cust) {
      throw new CustomNotFoundException("Not found customer with age is " + age);
    }
 
    return cust;
  }
}