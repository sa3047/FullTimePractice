package com.javaprograms.string;

/*@author : Swapnil Aher
 *@Date: 3/10/2015
 *@purpose: Recursive function to reverse the string
 * */
public class ReverseStringRecur {


	public void reverseString(String str)
	{		
		if(str.length()!=0)
		{
			System.out.print(str.charAt(str.length()-1));
			reverseString(str.substring(0, str.length()-1));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseStringRecur obj = new ReverseStringRecur();
		obj.reverseString("geeks for geeks");
		//reverseString("swapnil");

	}

}
