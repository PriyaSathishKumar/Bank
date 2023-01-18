package com.MavenExample.Bank.repository;

import com.MavenExample.Bank.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
        Customer findByName(String custName) ;
}
