package com.chandra.gaya.loan.homeloan.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chandra.gaya.loan.homeloan.dao.PersonDao;
import com.chandra.gaya.loan.homeloan.entities.Person;
import com.chandra.gaya.loan.homeloan.repository.PersonRepository;

@Repository
public class PersonDaoImp implements PersonDao{
	@Autowired
	private  PersonRepository personRepository;

	public Person save(Person persion) {
		return personRepository.save(persion);
	}

	public List<Person> getAllPerson() {
		return  personRepository.findAll();
	}

}
