package com.javaprograms.string;

/*
 * AUTHOR : Swapnil Aher
 * Program : To find the odd occurence of a Number in Array. 
 * Logic: Use ^(exclusive-OR) operation on each item, you will get the Odd occurring number
 * Time complexity =O(n)
 */
public class FindOddOccurence {
	
	//
	int returnOddOccurence(int[] input)
	{
		int result =0;
		
		for(int i=0;i<input.length;i++)
		{
			result = result ^ input[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,2,1,3,3};
	FindOddOccurence obj = new FindOddOccurence();
	System.out.println("odd occurring number "+	obj.returnOddOccurence(input));
	}

}
