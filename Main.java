package com.te.springautowaire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("autowirespring.xml");
		Laptop bean = container.getBean(Laptop.class);
		System.out.println(bean);
	}

}
