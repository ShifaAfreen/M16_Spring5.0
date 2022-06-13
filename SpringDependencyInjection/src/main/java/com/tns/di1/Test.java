package com.tns.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("Bean.xml");
		Student s = c.getBean("s1",Student.class);
		s.cheating();
		
		AnotherStudent a = c.getBean("a1",AnotherStudent.class);
		a.cheating();
		

	}

}
