package com.test.ankur.dao;

import java.util.ArrayList;
import java.util.List;

import com.test.ankur.domin.Person;

public class MyRepositoryImpl implements MyRepository {

	@Override
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		Person person = new Person("Ankur",38,'M');
		persons.add(person);
		return persons;
	}

}
