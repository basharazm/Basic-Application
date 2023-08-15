package com.basicapplication.basic_application.services;

import com.basicapplication.basic_application.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
//    CustomerRepository customerRepository;

    private List<Customer> customers = new ArrayList<> (Arrays.asList(
            new Customer("1", "Ahmad", "a@a.com"),
            new Customer("2", "Samer", "s@a.com"),
            new Customer("3", "Rami", "r@a.com")
    ));

    public List<Customer> getAllCustomers() {

//        List customers = new ArrayList();
//        customerRepository.findAll()
//                .forEach(customers::add);
        return customers;
    }

    public Customer getCustomer(String id) {
        return customers.stream().filter(c -> c.getId().equals(id)).findFirst().get();
    }

    public void addCustomer(Customer customer) {
//        customerRepository.save(customer);
    }
}
