package com.test.ankur.service;

import java.util.List;

import com.test.ankur.dao.MyRepository;
import com.test.ankur.dao.MyRepositoryImpl;
import com.test.ankur.domin.Person;

public class MyServiceImpl implements MyService {

	private MyRepository myRepository;
	
	@Override
	public List<Person> findPeople() {
		return myRepository.findAll();
	}

	public void setMyRepository(MyRepository myRepository) {
		this.myRepository = myRepository;
	}

	
}
