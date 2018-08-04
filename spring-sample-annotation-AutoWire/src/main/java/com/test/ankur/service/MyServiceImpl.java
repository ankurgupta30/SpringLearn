package com.test.ankur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.ankur.dao.MyRepository;
import com.test.ankur.dao.MyRepositoryImpl;
import com.test.ankur.domin.Person;

@Service("myService")
public class MyServiceImpl implements MyService {

	@Autowired
	private MyRepository myRepository;
	
	@Override
	public List<Person> findPeople() {
		return myRepository.findAll();
	}

	
	public void setMyRepository(MyRepository myRepository) {
		this.myRepository = myRepository;
	}

	
}
