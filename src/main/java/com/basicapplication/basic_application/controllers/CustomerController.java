package com.basicapplication.basic_application.controllers;

import com.basicapplication.basic_application.models.Customer;
import com.basicapplication.basic_application.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @RequestMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping("/customers/{id}")
    public Optional<Customer> getCustomer(@PathVariable  String id) {
        return customerService.getCustomer(id);
    }

    @RequestMapping("/customers/exist/{name}")
    public boolean isCustomerNameExist(@PathVariable  String name) {
        return customerService.isCustomerNameExist(name);
    }

    @RequestMapping(method= RequestMethod.POST, value="/customers")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/customers")
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/customers/{id}")
    public void deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomer(id);
    }
}
