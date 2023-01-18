package com.MavenExample.Bank.Service;

import com.MavenExample.Bank.Entity.Customer;
import com.MavenExample.Bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;
    public Customer saveCustomer(Customer customer){
        return repository.save(customer);
    }
    public List<Customer> saveCustomers(List<Customer> customers){
        return repository.saveAll(customers);
    }
    public List<Customer> getCustomers(){
        return repository.findAll();
    }
        public Customer getCustomerById(int acNo){
        return repository.findById(acNo).orElse(null);
        }
    public Customer getCustomerByName(String custName){
        return repository.findByName(custName);
    }
    public String deleteCustomer(int acNo){
        repository.deleteById(acNo);
        return "Customer Removed!!"+acNo;
    }
   /* public Customer updateCustomer(Customer customer){
        Customer existingCustomer=repository.findById(customer.getAccNumber()).orElse(null);
        existingCustomer.setAccNumber(customer.getAccNumber());
        existingCustomer.setCustName(customer.getCustName());
        existingCustomer.setPanCardNo(customer.getPanCardNo());
        return repository.save(existingCustomer);
    }*/

}
