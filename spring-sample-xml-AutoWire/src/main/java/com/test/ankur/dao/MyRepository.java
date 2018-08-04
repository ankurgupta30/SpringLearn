package com.test.ankur.dao;

import java.util.List;

public interface MyRepository<E> {

	List<E> findAll();
}
