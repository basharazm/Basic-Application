package com.basicapplication.basic_application.services;

import com.basicapplication.basic_application.models.Customer;
import com.basicapplication.basic_application.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {

        List customers = new ArrayList();
        customerRepository.findAll()
                .forEach(customers::add);
        return customers;
    }

    public Optional<Customer> getCustomer(String id) {
        return customerRepository.findById(id);
    }

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    public boolean isCustomerNameExist(String name) {
        return customerRepository.isCustomerNameExist(name);
    }
}
