package com.bigData.stream.services;
import com.bigData.stream.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bigData.stream.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class customer_services {

        @Autowired
        private CustomerRepository CustomerRepository;

    public List<Customer> findAllCustomers() {
        return CustomerRepository.findAll();
    }
    public Optional<Customer> findCustomerById(UUID id) {
        return CustomerRepository.findById(id);
    }

    }

