package com.javaprograms.string;
import java.util.Stack;

/*
 * @author: Swapnil Aher
 * @purpose: Given a string, Reverse a string using a stack
 * 			 time complexity of O(n)
 */
public class ReverseStringUsingStack {

	static Stack<Character> Ip= new  Stack<Character>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString( "GeeksforGeeks");
	}
	
	static void reverseString(String str)
	{
		if(str.length()==0)
			return;
		
		Ip.push(str.charAt(0));
		reverseString(str.substring(1,str.length()));
		System.out.print(Ip.pop());
		
	}

}
