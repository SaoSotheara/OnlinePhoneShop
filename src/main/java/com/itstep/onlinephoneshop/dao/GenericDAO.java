package com.itstep.onlinephoneshop.dao;

import java.util.List;

public interface GenericDAO<T> {

	public void create(T entity);
	public void update(T entity);
	public T getOneById(int id);
	public List<T> list();
	public long count();
	
}
