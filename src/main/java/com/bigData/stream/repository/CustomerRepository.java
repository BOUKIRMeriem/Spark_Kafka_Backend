package com.bigData.stream.repository;

import com.bigData.stream.Entity.Customer;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface CustomerRepository extends CassandraRepository<Customer, UUID> {

}

