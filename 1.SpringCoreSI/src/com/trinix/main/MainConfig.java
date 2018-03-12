package com.trinix.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.trinix.pojo.Employee;

public class MainConfig {

	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("src/applicationContext.xml");
		BeanFactory container = new XmlBeanFactory(resource);
		Employee emp = container.getBean("e1", Employee.class);
		System.out.println(emp);
	}

}
