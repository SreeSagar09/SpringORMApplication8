package com.app;

public interface CommonDAO {
	
	public Integer save(Object entity);
	
	public Integer save(String entityName, Object entity);
}
