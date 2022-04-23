package com.chandra.gaya.loan.homeloan.service;

import java.util.List;

import com.chandra.gaya.loan.homeloan.entities.Person;

public interface PersonService {

	Person save(Person persion);
	
	List<Person> getAllPerson();
}
