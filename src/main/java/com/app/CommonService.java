package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonService {
	
	@Autowired
	private CommonDAO commonDAO;
	
	public Integer saveEntity(Object entity) {
		Integer id = commonDAO.save(entity);
		
		return id;
	}
	
	public Integer saveEntity(String entityName, Object entity) {
		Integer id = commonDAO.save(entityName, entity);
		
		return id;
	}
}
