package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
	public static void main(String arg[])
	{
		ApplicationContext c = new ClassPathXmlApplicationContext("Bean.xml");
		Student s =c.getBean("s1",Student.class);
		s.display();
		
	}

}
