package com.chandra.gaya.loan.homeloan.dao;

import java.util.List;

import com.chandra.gaya.loan.homeloan.entities.Person;

public interface PersonDao {
	
    Person save(Person persion);
    
    List<Person> getAllPerson();

}
