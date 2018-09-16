package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.bean.HelloUser;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext bean=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloUser user=(HelloUser)bean.getBean("userId");
		user.display();
		
	}
}
