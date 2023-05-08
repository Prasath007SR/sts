package com.EducationalLoan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.EducationalLoan.demo.model.Admin;
import com.EducationalLoan.demo.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	AdminService as;
	
	@GetMapping("/fetchAdminDetails")
	public List<Admin> fetchAdminDetails() {
		return as.fetchAdminDetails();
	}

	@PostMapping("/postAdminDetails")
	public Admin postAdminDetails(@RequestBody Admin a) {
	
		return as.postAdminDetails(a);
	}

	@PutMapping("/putAdminDetails")
	public Admin putAdminDetails(@RequestBody Admin a) {
		
		return as.putAdminDetails(a);
	}

	@DeleteMapping("/deleteAdminDetails/{id}")
	public String deleteAdminDetails(@PathVariable int id) {
		
		 as.deleteAdminDetails(id);
         return "Admin Details deleted";
	}

}
