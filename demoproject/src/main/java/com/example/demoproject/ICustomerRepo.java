package com.example.demoproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demoproject.Customer;
@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long> {

}