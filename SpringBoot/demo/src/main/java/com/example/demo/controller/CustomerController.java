package com.example.demo.controller;


import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

        @Autowired
        CustomerService service;


        @GetMapping
        List<Customer> getAllCustomer(){
            return service.getAllCustomers();
        };

        @PostMapping
        Customer saveCustomer(@RequestBody Customer cust){
            return  service.SaveCustomer(cust);
        }



}
