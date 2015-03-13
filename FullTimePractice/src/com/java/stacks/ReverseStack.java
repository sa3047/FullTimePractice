package com.java.stacks;

import java.util.Stack;

/*
 * @author: Swapnil Aher
 * @date: 3/13/2015
 * @purpose: print stack elements in reverse order
 * */
public class ReverseStack {

	public static void main(String[] args)
	{
		//Create a stack of elements
		Stack<Integer> st= new Stack<Integer>();
		
		st.push(new Integer(1));
		st.push(new Integer(2));
		st.push(new Integer(3));
		st.push(new Integer(4));
		st.push(new Integer(5));
		mPrintStack(st);
		
	}
	static void mPrintStack(Stack<Integer> st)
	{
		Integer value=null;
		if(!st.isEmpty())
		{
			value = st.pop();
			System.out.println(value);
		}
		
		
		if(!st.isEmpty())
		mPrintStack(st);
		
		
	}
}
