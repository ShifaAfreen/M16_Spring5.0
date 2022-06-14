package com.tns.springaw;

public class Heart 
{
	private String nameOfAnimal; 
	private int noOfheart;
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public int getNoOfheart() {
		return noOfheart;
	}

	public void setNoOfheart(int noOfheart) {
		this.noOfheart = noOfheart;
	}

	public void print()
	{
		System.out.println("The heart-beat rate is 72 beat per min");
	}
}
