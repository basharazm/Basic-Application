package com.basicapplication.basic_application.controllers;

import com.basicapplication.basic_application.models.Customer;
import com.basicapplication.basic_application.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {



    @Autowired
    private CustomerService customerService;
    @RequestMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable  String id) {
        return customerService.getCustomer(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/customers")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }
}
