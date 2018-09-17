package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.HelloUSer;


public class Test
{

	public static void main(String[] args) {
		
		Resource r1=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r1);  
	    
	    HelloUSer user=(HelloUSer)factory.getBean("q");
		user.display();
	}
	
}
