package com.example.demo.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CustomerModel.CustomerModel;
import com.example.demo.CustomerService.CustomerServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/Customer")
public class CustomerController {
	@Autowired
	private CustomerServiceImpl customerserviceimpl;
	
	@PostMapping("/addcustomer")
	public CustomerModel addcustomerModel(@RequestBody CustomerModel customermodel) {
		return customerserviceimpl.saveCustomerModel(customermodel);
	}
	
	@GetMapping("/getcustomer")
	public List<CustomerModel>getAllCustomerModel(){
		return customerserviceimpl.getAllCustomerModel();
	}
	

}
