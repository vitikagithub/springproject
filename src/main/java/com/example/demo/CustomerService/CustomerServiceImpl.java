package com.example.demo.CustomerService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.CustomerModel.CustomerModel;
import com.example.demo.CustomerRepository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerrepository;
	
	public CustomerModel saveCustomerModel(CustomerModel customermodel) {
		return customerrepository.save(customermodel);
	}
	
	public List<CustomerModel> getAllCustomerModel(){
		return customerrepository.findAll();
	}
}

