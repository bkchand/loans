package com.chandra.gaya.loan.homeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.gaya.loan.homeloan.dto.PersonReq;
import com.chandra.gaya.loan.homeloan.entities.Person;
import com.chandra.gaya.loan.homeloan.service.PersonService;

@RestController
@RequestMapping("/loan")
public class HomeLoanController {

	
	@Autowired
	private PersonService PersonService;
	
	@GetMapping("/getAll/")
	public String  getEmpInfo() {
		
		return "Welcome to App";
	}
	
	@PostMapping("/save/")
	public Person  savePerson(@RequestBody PersonReq personReq) {
		Person person =new Person();
		person.setId(personReq.getId());
		person.setName(personReq.getName());
		person.setMobile(personReq.getMobile());
		
		return PersonService.save(person);
	}
	
}
