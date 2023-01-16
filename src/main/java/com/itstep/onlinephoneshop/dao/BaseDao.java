package com.itstep.onlinephoneshop.dao;

import java.sql.Connection;
import java.util.List;

public class BaseDao<T> {
	private Connection getConnection() {
		return null;
	}
	
	protected int deleteEntity(int id) {
		return 0;
	}
	
	protected int updateEntity(T entity) {
		return 0;
	}
	
	protected int createEntity(T entity) {
		return 0;
	}
	
	protected List<T> listAllEntity() {
		return null;
	}
	
	protected T findOneById(int id) {
		return null;
	}
}
