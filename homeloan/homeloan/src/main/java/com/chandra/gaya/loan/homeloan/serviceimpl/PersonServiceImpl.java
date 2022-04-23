package com.chandra.gaya.loan.homeloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandra.gaya.loan.homeloan.dao.PersonDao;
import com.chandra.gaya.loan.homeloan.entities.Person;
import com.chandra.gaya.loan.homeloan.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
     @Autowired
     private PersonDao personDao;
	public Person save(Person persion) {
		return personDao.save(persion);
	}
	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}

}
