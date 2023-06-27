package com.example.demo.CustomerRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.CustomerModel.CustomerModel;

public interface CustomerRepository extends JpaRepository<CustomerModel,Integer>{

}
