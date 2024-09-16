package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.CommonService;
import com.app.Employee;
import com.app.Product;
import com.app.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CommonService commonService = applicationContext.getBean(CommonService.class);
		
		Product product1 = new Product();
		product1.setProductCode("P005");
		product1.setProductName("Ball");
		product1.setQuantity(20);
		product1.setPrice(10.00);
		
		Integer id = commonService.saveEntity(product1);
		if(id>0) {
			System.out.println("Product saved successfully.");
		}else {
			System.out.println("Product saving failed.");
		}
		
		
		Employee employee1 = new Employee();
		employee1.setEmployeeCode("A006");
		employee1.setEmployeeName("Rakesh");
		employee1.setAge(27);
		employee1.setDesignation("Software Engineer");
		
		Integer id2 = commonService.saveEntity("com.app.Employee", employee1);
		if(id>0) {
			System.out.println("Employee saved successfully.");
		}else {
			System.out.println("Employee saving failed.");
		}
	}
}
