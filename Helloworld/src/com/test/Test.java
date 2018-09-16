package com.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bean.HelloUser;

public class Test {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory bean=new XmlBeanFactory(resource);
		
		HelloUser user=(HelloUser)bean.getBean("userId");
		user.display();
		
	}
}
