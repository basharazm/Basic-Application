package com.basicapplication.basic_application.repository;

import com.basicapplication.basic_application.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    @Transactional
     @Query("" +
     "SELECT CASE WHEN COUNT (c) > 0 THEN " +
     "TRUE ELSE FALSE END " +
     "FROM Customer c " +
     "WHERE c.name = :name"
     )
    Boolean isCustomerNameExist(@Param("name") String name);
}
