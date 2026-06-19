package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Product;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private CustomerRepository custRepo;

    @Autowired
    private ProductRepository productRepo;


    public Orders placeOrder(Long custId , Long ProdId , int qty){

        Customer customer = custRepo.findById(custId).orElse(null);
        System.out.println("Customer = " + customer);

        Product product = productRepo.findById(ProdId).orElse(null);
        System.out.println("Product = " + product);

        if(customer != null && product != null){

            Orders order = new Orders();
            order.setCustomer(customer);
            order.setProduct(product);
            order.setQuantityOrdered(qty);
            order.setTotalPrice(product.getPrice()*qty);

            Orders savedOrder = orderRepo.save(order);

            System.out.println("Saved Order = " + savedOrder);

            return savedOrder;
        }

        System.out.println("Customer or Product not found");

        return null;
    }
}