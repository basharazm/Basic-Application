package com.basicapplication.basic_application.repository;

import com.basicapplication.basic_application.models.Customer;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository underTest;

    @Test
    void testAddCustomer() {
        String name = "Saeed";
        Customer customer = new Customer("6", name, "ss@ss.com");

        Customer testedCustomer = underTest.save(customer);

        assertNotNull(testedCustomer);
    }
    @Test
    @Disabled
    void isCustomerNameExist() {

        //given
        String name = "Saeed";
//        Customer customer = new Customer("6", name, "ss@ss.com");
//
//        underTest.save(customer);

        // when - tested method
        Boolean expected = underTest.isCustomerNameExist(name);

        // then
        assertThat(expected).isTrue();

    }
}