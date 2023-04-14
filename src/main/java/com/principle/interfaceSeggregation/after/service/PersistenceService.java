package com.principle.interfaceSeggregation.after.service;

import java.util.List;

import com.principle.interfaceSeggregation.after.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
}
