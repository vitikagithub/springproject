package com.example.demo.CustomerService;

import java.util.List;

import com.example.demo.CustomerModel.CustomerModel;

public interface CustomerService {
	public CustomerModel saveCustomerModel(CustomerModel customermodel);
    public List<CustomerModel>getAllCustomerModel();
}
