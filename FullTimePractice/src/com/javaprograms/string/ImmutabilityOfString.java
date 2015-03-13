package com.javaprograms.string;

/* @author: Swapnil Aher
 * @purpose: Testing  Immutable string 
 *  */
public class ImmutabilityOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first = new String("First string");
		
		String Second= new String("Second string");
		
		System.out.println("Printing 1st string "+first);
		System.out.println("Printing 1st string "+Second);
		
		String third= first.replace("First", "changed");
		
		System.out.println("Printing 1st string "+first);
		System.out.println("Printing 3rd string "+third);
	}

}
