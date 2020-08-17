package com.lti.ministryTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.controller.MinistryController;
import com.lti.model.Users;
import com.lti.repo.MinistryRepo;


public class MinistryTest {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
	MinistryController conroller = ctx.getBean(MinistryController.class);
	
	Users user= new Users();
	
	@Test  
    public void addNewMinister() {  
        
		user.setPassword("admin");
		user.setRole("ministry");
		user.setRoleId(1);
        
       int id = conroller.ministryRegistration(user);
        
        
        System.out.println("User added. " + id);  
    }
}
