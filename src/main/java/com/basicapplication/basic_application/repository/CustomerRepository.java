package com.basicapplication.basic_application.repository;

import com.basicapplication.basic_application.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
