package com.MavenExample.Bank;

import com.MavenExample.Bank.Entity.Customer;
import com.MavenExample.Bank.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService service;
    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer custom){
        return service.saveCustomer(custom);
    }
    @PostMapping("/addCustomers")
    public List<Customer> addCustomer(@RequestBody List<Customer> customers){
        return  service.saveCustomers(customers);
    }
    @GetMapping("/customers")
    public List<Customer> findAllCustomers(){
        return service.getCustomers();
    }
    @GetMapping("/customers/{acNo}")
    public Customer findCustomerById(@PathVariable int acNo){
        return service.getCustomerById(acNo);
    }
    @GetMapping("/customers/{custName}")
    public Customer findCustomerByName(@PathVariable String custName){
        return service.getCustomerByName(custName);
    }
    //@PutMapping("/update")
    //public Customer updateCustomer(@RequestBody Customer customers){
        //return  service.updateCustomer(customers);
    //}
    @DeleteMapping("/delete/{acNo}")
    public String deleteCustomer(@PathVariable int acNo){
        return service.deleteCustomer(acNo);
    }


}
