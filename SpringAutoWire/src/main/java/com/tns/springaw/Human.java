package com.tns.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	private Heart h;
	
	public Human()
	{
		super();
	}
	@Autowired
	@Qualifier("tigerHeart")
	public void setH(Heart h) {
		this.h = h;
	}

	public Human(Heart h) {
		super();
		this.h = h;
	}

	/*public void setH(Heart h) {
		this.h = h;
	}*/

	public void displaly()
	{
		h.print();
		System.out.println("The name of animal is "+h.getNameOfAnimal()+ " and number of heart is "+h.getNoOfheart());
	}
}
