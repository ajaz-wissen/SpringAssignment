package com.ajaz.SpringAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAssignmentApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringAssignmentApplication.class, args);

		Object obj1 = context.getBean("getAddressMumbai");
//		Object obj11 = context.getBean("getAddressMumbai");
		Object obj2 = context.getBean("getAddressPune");
		Object obj3 = context.getBean("getAddressBangalore");

		System.out.println(obj1);
//		System.out.println(obj11);
		System.out.println(obj2);
		System.out.println(obj3);

	}

}
