package com.aleconco.mariadb.controller;
import com.aleconco.mariadb.model.Customer;
import com.aleconco.mariadb.repo.CustomerRepository;


import java.util.Arrays;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class WebController {
	
	@Autowired
	CustomerRepository repository;
	
/*	@GetMapping("/save")
	public String process(){
		
		repository.save(Arrays.asList(new Customer("Jack", "Smith"), 
										new Customer("Adam", "Johnson"),
										new Customer("Kim", "Smith"),
										new Customer("David", "Williams"),
										new Customer("Peter", "Davis")));
		
		return "Done";
	}*/
	
	
	@GetMapping("/findall")
	public String findAll(){
		
		String result = "";
		
		for(Customer cust : repository.findAll()){
			result += cust + "</br>";
		}
		
		return result;
	}
	
//	@GetMapping("/findbyid")
//	public String findById(@RequestParam("id") long id){
//		String result = "";
//		result = repository.findOne(id).toString();
//		return result;
//	}
	
	@GetMapping("/findbylastname")
	public String fetchDataByLastName(@RequestParam("lastname") String lastName){
		String result = "";
		
		for(Customer cust: repository.findByLastName(lastName)){
			result += cust + "</br>"; 
		}
		
		return result;
	}
}
