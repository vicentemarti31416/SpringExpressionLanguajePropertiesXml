package com.example.utilPropertiesSpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.utilPropertiesSpEL.bean.BeanTarget;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/beans.xml");
		BeanTarget target = context.getBean(BeanTarget.class);
		System.out.println(target.getUsername());
		System.out.println(target.getPassword());
	}
}
