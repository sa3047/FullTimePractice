package com.java.javaconcepts;

public class ConstructorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Car
{
	int price;
	Car(int p)
	{
		this.price = p;
	}
	
	
}

class Ford extends Car
{
	int maxSpeed;
	Ford()
	{
		super(500);
		maxSpeed=100;
	}
}