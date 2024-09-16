package com.app;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDAOImpl implements CommonDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer save(Object entity) {
		Integer id = (Integer) hibernateTemplate.save(entity);
		return id;
	}

	@Override
	@Transactional
	public Integer save(String entityName, Object entity) {
		Integer id = (Integer) hibernateTemplate.save(entityName, entity);
		return id;
	}

}
