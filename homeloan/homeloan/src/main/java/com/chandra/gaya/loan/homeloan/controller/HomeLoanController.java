package com.chandra.gaya.loan.homeloan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class HomeLoanController {

	
	@GetMapping("/getAll/")
	public String  getEmpInfo() {
		
		return "Welcome";
	}
}
