package com.ksu.hotel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ksu.hotel.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
