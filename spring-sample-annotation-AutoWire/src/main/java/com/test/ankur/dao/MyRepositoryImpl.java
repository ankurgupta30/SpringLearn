package com.test.ankur.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.ankur.domin.Person;

@Repository
public class MyRepositoryImpl implements MyRepository {

	@Override
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		Person person = new Person("Ankur",38,'M');
		persons.add(person);
		return persons;
	}

}
