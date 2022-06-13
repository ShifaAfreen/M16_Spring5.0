package com.tns.di;

public class Student
{

	private String studentname;
	private int id;
	

	public Student(String studentname, int id) {

		this.studentname = studentname;
		this.id = id;
	}


	public void display()
	{
		System.out.println("Student name is "+studentname+" and ID is "+id);
	}
}
