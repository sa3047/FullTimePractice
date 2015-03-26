package com.java.javaconcepts;
/*
 *1)JVM will add Default constructor in your class if you do not  provide any constructor
 *2) if this() is called in any constructor then call to super() is omitted by JVM
 */
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
	
	int getPrice()
	{
		return this.price;
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

