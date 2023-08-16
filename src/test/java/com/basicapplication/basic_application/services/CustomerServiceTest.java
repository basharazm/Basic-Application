package com.basicapplication.basic_application.services;

import com.basicapplication.basic_application.repository.CustomerRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

class CustomerServiceTest {

    @Mock  private CustomerRepository customerRepository;
    private AutoCloseable autoCloseable;
    private CustomerService underTest;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllCustomers() {
        //when
        underTest.getAllCustomers();
        //then
        verify(customerRepository).findAll();
    }

    @Test
    @Disabled
    void getCustomer() {
    }

    @Test
    @Disabled
    void addCustomer() {
    }

    @Test
    @Disabled
    void updateCustomer() {
    }

    @Test
    @Disabled
    void deleteCustomer() {
    }
}