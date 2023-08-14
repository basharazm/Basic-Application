package com.basicapplication.basic_application.services;

import com.basicapplication.basic_application.beans.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customers = new ArrayList<> (Arrays.asList(
            new Customer("1", "Ahmad", "a@a.com"),
            new Customer("2", "Samer", "s@a.com"),
            new Customer("3", "Rami", "r@a.com")
    ));

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomer(String id) {
        return customers.stream().filter(c -> c.getId().equals(id)).findFirst().get();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
